import java.util.ArrayList;

public class MemKonfig {
    Node node;
    ArrayList<VarKonfig> memory;

    public MemKonfig Clone() {
        MemKonfig out = new MemKonfig();
        out.node = new Node(node.Name);
        out.memory = new ArrayList<VarKonfig>();

        for(VarKonfig varkonfig : memory) {
            VarKonfig temp = new VarKonfig();
            temp.minus = varkonfig.minus;
            temp.plus = varkonfig.plus;
            temp.zero = varkonfig.zero;
            temp.varname = varkonfig.varname;
            out.memory.add(temp);
        }

        return out;
    }
}