public class SecurityClass {
    public int Score;
    public String Name;

    public SecurityClass(int score, String name){
        this.Name = name;
        this.Score = score;
    }

    public int CompareFlowToo(SecurityClass other){
        return this.Score - other.Score;
    }
}
