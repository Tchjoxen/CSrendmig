public class Edge{
    public Expression Label; //eg b := 3
    public Node Next;
    public Node Prev;

    public Edge(Expression label){
        Label = label;
    }

    public String GetPGElement()
    {
        return Prev.Name + " -> " + Next.Name + " [ label = \"" + Label.GetLabel().replaceAll(" ","") + "\"];";
    }
}

