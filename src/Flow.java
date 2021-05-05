public class Flow {
    public SecurityConfig From;
    public SecurityConfig To;

    public Flow(SecurityConfig from, SecurityConfig to){
        this.From = from;
        this.To = to;
    }
}
