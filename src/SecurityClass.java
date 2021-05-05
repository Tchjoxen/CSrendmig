public class SecurityClass {
    public SecurityClass FlowToo;
    public String Name;

    public SecurityClass(String name){
        this.Name = name;
    }

    public SecurityClass(String name, SecurityClass flowToo){
        this.Name = name;
        this.FlowToo = flowToo;
    }

    public Boolean CompareFlowToo(SecurityClass other){
        return other.Name.equals(this.FlowToo.Name);
    }
}
