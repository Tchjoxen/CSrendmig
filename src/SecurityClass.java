import java.util.ArrayList;

public class SecurityClass {
    public ArrayList<SecurityClass> FlowToos = new ArrayList<>();
    public String Name;

    public SecurityClass(String name){
        this.Name = name;
    }

    public void AddFlowToo(SecurityClass level){
        FlowToos.add(level);
    }

    public Boolean CompareFlowToo(SecurityClass other){
        if(this.Name.equals(other.Name)){
            return true;
        }
        for (SecurityClass s : FlowToos
             ) {
            if(other.Name.equals(s.Name)){
                return true;
            }
        }
        return false;
    }
}
