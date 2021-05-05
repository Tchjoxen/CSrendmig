import java.io.ObjectInputFilter;
import java.util.ArrayList;

public class SecurityAnalysisConfiguration {
    public ArrayList<SecurityConfig> Configs = new ArrayList<SecurityConfig>();
    public ArrayList<SecurityClass> Levels = new ArrayList<SecurityClass>();
    public ArrayList<Flow> Flows = new ArrayList<>();


    public Boolean AddLevel(SecurityClass level){
        if(!ContainsLevel(level)){
            return Levels.add(level);
        }
        return false;
    }

    private Boolean ContainsLevel(SecurityClass level){
        for (SecurityClass l : Levels
        ) {
            if(l.Score == level.Score || l.Name.equals(level.Name)){
                return true;
            }
        }
        return false;
    }

    private Boolean ContainsConfig(SecurityConfig config){
        for (SecurityConfig c : Configs
        ) {
            if(c.VarName.equals(config.VarName)){
                return true;
            }
        }
        return false;
    }

    private Boolean ContainsFlow(Flow flow){
        for (Flow f : Flows
        ) {
            if(f.To.VarName.equals(flow.To.VarName) && f.From.VarName.equals(flow.From.VarName)){
                return true;
            }
        }
        return false;
    }

    public Boolean AddLevelsIfPossible(ArrayList<SecurityClass> levels){
        for (SecurityClass l : levels
        ) {
            if(ContainsLevel(l)){
                return false;
            }
        }
        return Levels.addAll(levels);
    }

    public boolean AddConfig(SecurityConfig config){
        if(ContainsLevel(config.SecurityLevel) && !ContainsConfig(config)){
            return Configs.add(config);
        }
        return false;
    }

    public SecurityConfig FindConfigByVarName(String varName){
        for (SecurityConfig c : Configs
             ) {
            if(c.VarName.equals(varName)){
                return c;
            }
        }
        return null;
    }

    public Boolean AddFlow(Flow flow){
        if(ContainsFlow(flow)){
            return false;
        }
        return Flows.add(flow);
    }

    public ArrayList<Flow> GetAllAllowedFlows(){
        ArrayList<Flow> allowedFlows = new ArrayList<>();
        for (SecurityConfig c : Configs
             ) {
            for (SecurityConfig c2 : Configs
            ) {
                if(c.SecurityLevel.CompareFlowToo(c2.SecurityLevel) >= 0){
                    allowedFlows.add(new Flow(c,c2));
                }
            }
        }
        return allowedFlows;
    }
}