import java.util.ArrayList;

public class Edges {
    public static Integer count = 0;
    public ArrayList<Edge> edges(Node from, Node to, Expression exp) {
        ArrayList<Edge> edges = new ArrayList<>();

        if(exp.Type() == "Start")
        {
            StartExpression start = (StartExpression) exp;
            edges.addAll(edges(from, to, start.Command));
        }
        if (exp.Type() == "Assignment") {
            AssignmentExpression aExp = (AssignmentExpression) exp;
            Edge out = new Edge(aExp);
            out.Prev = from;
            out.Next = to;
            edges.add(out);
        }
        else if (exp.Type() == "SkipExpression") {
            SkipExpression sExp = (SkipExpression) exp;
            Edge out = new Edge(sExp);
            out.Prev = from;
            out.Next = to;
            edges.add(out);
        }
        else if (exp.Type() == "EndCommand") {
            EndCommandExpression eExp = (EndCommandExpression) exp;
            Node q = new Node("q" + count++); // not one but some counter
            edges.addAll(edges(from, q, eExp.lhs));
            edges.addAll(edges(q, to, eExp.rhs));
        }
        else if (exp.Type() == "If") {
            IfExpression iExp = (IfExpression) exp;
            edges.addAll(edges(from, to, iExp.guardedCommand));
        }
        else if (exp.Type() == "Do") {
            DoExpression dExp = (DoExpression) exp;
            edges.addAll(edges(from, from, dExp.guardedCommand));
            if(dExp.guardedCommand.Type() == "IFCondition"){
                IFConditionExpression IFCExp = (IFConditionExpression) dExp.guardedCommand;
                BooleanNegationExpression bne = new BooleanNegationExpression();
                LanguageParser.BooleanNegationContext ctx = new LanguageParser.BooleanNegationContext(IFCExp.ctx.condition);
                ctx.value = IFCExp.ctx.condition;
                bne.ctx = ctx;
                bne.value = IFCExp.condition;
                Edge out = new Edge(bne);
                out.Prev = from;
                out.Next = to;
                edges.add(out);
            }
            else{
                edges.addAll(edges(from, to, dExp.guardedCommand));
            }
        }
        else if(exp.Type() == "IFCondition"){
            IFConditionExpression IFCExp = (IFConditionExpression) exp;
            Node q = new Node("q" + count++); // not one but some counter
            //edges.addAll(edges(from, q, IFCExp.condition));
            Edge out = new Edge(IFCExp.condition);
            out.Prev = from;
            out.Next = q;
            edges.add(out);
            edges.addAll(edges(q, to, IFCExp.Command));
        }
        else if(exp.Type() == "IFStatements"){
            IFStatementsExpression IFSExp = (IFStatementsExpression) exp;
            edges.addAll(edges(from, to, IFSExp.rhs));
            edges.addAll(edges(from, to, IFSExp.lhs));
        }
        else if(exp.Type() == "AssignmentToArray"){
            AssignmentToArrayExpression aexpp = (AssignmentToArrayExpression) exp;
            Edge out = new Edge(aexpp);
            out.Prev = from;
            out.Next = to;
            edges.add(out);
        }
        
        return edges;
    }
}
