import java.util.HashMap;

public class State {
	public Node node;
    public HashMap<String, Double> config;

    public State(Node node, HashMap<String, Double> config){
        this.node = node;
        this.config = config;
    }
}
