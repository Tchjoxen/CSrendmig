import java.util.ArrayList;

public class Memory{
    public ArrayList<MemKonfig> memory;

    // public Memory(ArrayList<MemKonfig> mem) {
    // 	memory = mem;
    // }
    
    public Memory(ArrayList<VarKonfig> variables, ArrayList<Edge> programGraph){
        memory = new ArrayList<MemKonfig>();
        for (Edge edge : programGraph) {
            if(edge.Prev.Name == "q▷"){
                MemKonfig mem = new MemKonfig();
                mem.memory = variables;
                mem.node = edge.Prev;
                memory.add(mem);
                MemKonfig mem2 = new MemKonfig();
                mem2.memory = new ArrayList<VarKonfig>();
                mem2.node = edge.Next;
                memory.add(mem2);
            }
            else{
                if(!Contains(edge.Prev.Name)){
                    MemKonfig mem = new MemKonfig();
                    mem.memory = new ArrayList<VarKonfig>();
                    mem.node = edge.Prev;
                    memory.add(mem);
                }
                if(!Contains(edge.Next.Name)){
                    MemKonfig mem = new MemKonfig();
                    mem.memory = new ArrayList<VarKonfig>();
                    mem.node = edge.Next;
                    memory.add(mem);
                }
            }
        }
    }

    public boolean Update(MemKonfig mem){
        MemKonfig prev = GetByNode(mem.node.Name);
        if(AreEqual(mem, prev)){
            return false;
        }
        Replace(mem);
        return true;
    }

    public boolean AreEqual(MemKonfig mem1, MemKonfig mem2){
    	
    	if(mem2.memory.size() < 1) {
    		return false;
    		}
    	
    	if(mem1.memory.size() != mem2.memory.size()) {
    		System.out.println("Something is wrong");
    		return true;
    	}
    	
    	for(int i = 0; i < mem1.memory.size(); i++) {
    		VarKonfig var1 = mem1.memory.get(i);
    		VarKonfig var2 = mem2.memory.get(i);
    		if(var1.varname != var2.varname) {
    			System.out.println("Something is wrong");
    			return true;
    		}
    		
    		if(var1.minus != var2.minus) {
    			return false;
    		}
    		
    		if(var1.plus != var2.plus) {
    			return false;
    		}
    		
    		if(var1.zero != var2.zero) {
    			return false;
    		}
    	}
    	
    	return true;
    }

    public MemKonfig GetByNode(String name){
        for (MemKonfig mem : memory
        ) {
            if(mem.node.Name == name){
                return mem.Clone();
            }
        }
        return null;
    }

    public void Replace(MemKonfig mem){
        for (int i = 0; i < memory.size(); i++) {
            if(memory.get(i).node.Name == mem.node.Name){
            	if(memory.get(i).memory.size() != mem.memory.size()) {
            		memory.set(i, mem);
            	}
            	
                MemKonfig conf = memory.get(i);
            	for(int j = 0; j < conf.memory.size(); j++) {
            		VarKonfig prev = conf.memory.get(j);
            		VarKonfig newvar = mem.memory.get(j);
            		if(newvar.minus == true) {
            			prev.minus = true;
            		}
            		if(newvar.plus == true) {
            			prev.plus = true;
            		}
            		if(newvar.zero == true) {
            			prev.zero = true;
            		}
            	}
            	
            }
        }
    }

    public boolean Contains(String nodeName){
        for (MemKonfig mem : memory
             ) {
            if(mem.node.Name == nodeName){
                return true;
            }
        }
        return false;
    }
}


