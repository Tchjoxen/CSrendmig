
import java.util.ArrayList;

public class SignAnalyzer {
	Memory memory;
	ArrayList<Edge> PG;
	ArrayList<Node> nodes = new ArrayList<Node>();
	Evaluator evaluator = new Evaluator();
	
	public SignAnalyzer(ArrayList<VarKonfig> varKonfigs, ArrayList<Edge> PG) {
		this.memory = new Memory(varKonfigs, PG);
		this.PG = PG;
		nodes.add(memory.memory.get(0).node);
	}
	
	public String Analyze() {
		Node currentNode;
		while(nodes.size() > 0) {
			//select new node
			currentNode = nodes.get(0);
			nodes.remove(0);
			
			// get abstract memory for node
			MemKonfig mem = memory.GetByNode(currentNode.Name);
			
			// for all edges where node is startnode
			for(Edge e : PG){
				if(e.Prev == currentNode) {
					MemKonfig newMem = evaluator.Evaluate(mem, e.Label);
					newMem.node = e.Next;
					if(memory.Update(newMem)) {
						nodes.add(e.Next);
					}
				}
			}
		}
		
		String out = "";
		for (MemKonfig m : memory.memory
	             ) {
	            out += m.node.Name + "\n";
	            for (VarKonfig v : m.memory
	   	             ) {
	            	
	   	            out += v.varname + ": ";
	   	            if(v.plus) {
	   	            	out += "+";
	   	            }
	   	         if(v.minus) {
	   	            	out += "-";
	   	            }
	   	         if(v.zero) {
	   	            	out += "0";
	   	            }
	   	         out += "\n";
	   	        }
	        }
		return out;
	}
	
}

class Evaluator{
	public MemKonfig Evaluate(MemKonfig mem, Expression exp) {
		//System.out.println(exp.GetLabel());
		try {
			switch (exp.Type()) {
				case "Plus":
					return PlusEval(mem, (PlusExpression) exp);
				case "Assignment":
					return AssignmentEval(mem, (AssignmentExpression) exp);
				case "Num":
					return NumEval(mem, (NumExpression) exp);
				case "Minus":
					return MinusEval(mem, (MinusExpression) exp);
				case "<=":
					return BooleanLessThanEqualsEval(mem, (BooleanLessThanEqualsExpression) exp);
				case "Times":
					return TimesEval(mem, (TimesExpression) exp);
				case "Div":
					return DivEval(mem, (DivExpression) exp);
				case "=":
					return BooleanEqualsEval(mem, (BooleanEqualsExpression) exp);
				case "Pow":
					return PowEval(mem, (PowExpression) exp);
				case "<":
					return BooleanLessThanEval(mem, (BooleanLessThanExpression) exp);
				case ">":
					return BooleanGreaterThanEval(mem, (BooleanGreaterThanExpression) exp);
				case ">=":
					return BooleanGreaterThanEqualsEval(mem, (BooleanGreaterThanEqualsExpression) exp);
				case "!=":
					return BooleanNegationEqualsEval(mem, (BooleanNegationEqualsExpression) exp);
				case "!":
					return BooleanNegationEval(mem, (BooleanNegationExpression) exp);
				case "||":
					return BooleanDoubleOrEval(mem, (BooleanDoubleOrExpression) exp);
				default:
					System.out.println("Unhandeled: " + exp.GetLabel() + " Type: " + exp.Type());
					System.out.println("");
					return mem;
			}
		}
		catch (Exception e){
			System.out.println("Error: " + e.getMessage() + "\n" + "Unhandled: " + exp.GetLabel() + " Type: " + exp.Type());
			System.out.println("");
			return mem;
		}
		
	}
	
	public MemKonfig BooleanDoubleOrEval (MemKonfig mem, BooleanDoubleOrExpression exp) {
		System.out.println("Unhandeled: " + exp.GetLabel());
		  return mem;
	}
	
	public MemKonfig PlusEval(MemKonfig mem, PlusExpression exp) {
		// only works with x + var in that order
		// otherwise we get runtime error
		
		// improtant to clone
		MemKonfig currentMem = mem.Clone();
		
		VarExpression var = (VarExpression)exp.lhs;
		int num = Integer.parseInt(((NumExpression)exp.rhs).n);
		
		for(VarKonfig x : currentMem.memory) {
			if(x.varname == var.x) {
				if( num > 0) {
					if(x.zero) {
						x.plus = true;
					}
					if(x.minus) {
						x.minus = true;
						x.plus = true;
						x.zero = true;
					}
				}else if(num < 0) {
					if(x.zero) {
						x.minus = true;
					}
					if(x.plus) {
						x.minus = true;
						x.plus = true;
						x.zero = true;
					}
				}
			}
		}
		
		return currentMem;
	}
	
	public MemKonfig NumEval(MemKonfig mem, NumExpression exp) {		
		// improtant to clone
		MemKonfig currentMem = new MemKonfig();
		ArrayList<VarKonfig> vars = new ArrayList<VarKonfig>();
		VarKonfig var = new VarKonfig();
		
		int num = Integer.parseInt(exp.n);
		if(num > 0) {
			var.plus = true;
		}
		if(num < 0) {
			var.minus = true;
		}
		if(num == 0) {
			var.zero = true;
		}
		
		vars.add(var);
		currentMem.memory=vars;
		
		return currentMem;
	}

	public MemKonfig AssignmentEval(MemKonfig mem, AssignmentExpression exp) {
		// only works with x := number in that order
		// otherwise we get runtime error
		
		// improtant to clone
		MemKonfig currentMem = mem.Clone();
		String var = exp.x;
		VarKonfig num = Evaluate(mem, exp.a).memory.get(0); // int num = Integer.parseInt(((NumExpression)exp.a).n);
		
		for(VarKonfig x : currentMem.memory) {
			if(var.equals(x.varname)) {
				if(num.plus) {
					if(num.minus) {
						x.plus = true;
						x.minus = true;
						x.zero = true;
					}else {
						x.plus = true;
						x.minus = false;
						x.zero = false;
					}
				}
				if(num.minus) {
					if(num.plus) {
						x.plus = true;
						x.minus = true;
						x.zero = true;
					}else {
						x.plus = false;
						x.minus = true;
						x.zero = false;
					}
				}
				if(num.zero) {
					x.zero = true;
				}
			}
		}
		
		return currentMem;
	}

	public MemKonfig MinusEval(MemKonfig mem, MinusExpression exp) {
	    // only works with x - var in that order
	    // otherwise we get runtime error

	    // improtant to clone
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals( var.x)) {
	            if( num > 0) {
	                if(x.zero){
	                    x.minus = true;
	                }
	                if(x.plus){
	                    x.minus = true;
	                    x.plus = true;
	                    x.zero = true;
	                }
	            }else if( num < 0 ){
	                if(x.zero){
	                    x.plus = true;
	                }
	                if(x.minus){
	                    x.minus = true;
	                    x.plus = true;
	                    x.zero = true;
	                }
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig BooleanEqualsEval (MemKonfig mem, BooleanEqualsExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals( var.x)) {
	            if( num > 0) {
	                x.zero = false;
	                x.minus = false;
	            }else if( num < 0 ){
	                x.zero = false;
	                x.plus = false;
	            }else if(num == 0){
	                x.minus = false;
	                x.plus = false;
	            }
	        }
	    }

	    return currentMem;
	}
	
	public MemKonfig BooleanLessThanEqualsEval (MemKonfig mem, BooleanLessThanEqualsExpression exp) {
		MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals( var.x)) {
	            if( num > 0) {
	                break;
	            }else if( num < 0 ){
	                x.plus = false;
	                x.zero = false;
	            }else if( num == 0){
	                x.plus = false;
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig TimesEval(MemKonfig mem,TimesExpression exp) {
		  // only works with x + var in that order
	    // otherwise we get runtime error

	    // improtant to clone
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;

	    try {
	        int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	        for(VarKonfig x : currentMem.memory) {
	            if(x.varname.equals(var.x)) {
	                if( num > 0) {
	                    if(x.zero){
	                        x.zero = true;
	                    }
	                    if(x.plus){
	                        x.plus = true;
	                    }
	                    if(x.minus) {
	                        x.minus = true;
	                    }
	                }else if( num < 0 ){
	                    if(x.zero){
	                        x.zero = true;
	                    }
	                    if(x.minus){
	                        x.plus = true;
	                    }
	                    if(x.plus){
	                        x.minus = true;
	                    }
	                }
	            }
	        }
	        
	    }catch(Exception e) {
	        MemKonfig VarMem = mem.Clone();
	        for(VarKonfig x : VarMem.memory) {
	            x.minus = false;
	            x.plus = false;
	            x.zero = false;
	        }

	        VarExpression var2 = (VarExpression)exp.rhs;

	        for(VarKonfig x : currentMem.memory) {
	            if(x.varname.equals(var.x)) {
	                for(VarKonfig y : currentMem.memory){
	                    if(y.varname.equals(var2.x)) {
	                        if(x.plus && y.plus){
	                            x.plus = true;
	                        }
	                        if(x.plus && y.minus){
	                            x.minus = true;
	                        }
	                        if(x.minus && y.plus){
	                            x.minus = true;
	                        }
	                        if(x.minus && y.minus){
	                            x.plus = true;
	                        }
	                        if(x.zero || y.zero){
	                            x.zero = true;
	                        }
	                    }
	                }
	            }
	        }
	        return VarMem;
	    }

	    return currentMem;
	}
	
	public MemKonfig DivEval(MemKonfig mem,DivExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals(var.x)) {

	            if( num > 0) {
	                if(x.zero){
	                    x.zero = true;
	                }
	                if(x.plus){
	                    x.plus = true;
	                }
	                if(x.minus) {
	                    x.minus = true;
	                }
	            }else if( num < 0 ){
	                if(x.zero){
	                    x.zero = true;
	                }
	                if(x.minus){
	                    x.plus = true;
	                }
	                if(x.plus){
	                    x.minus = true;
	                }
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig PowEval(MemKonfig mem,PowExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals(var.x)) {

	            if( num > 0) {
	                if(x.zero){
	                    x.zero = true;
	                }
	                if(x.plus){
	                    x.plus = true;
	                }
	                if(x.minus) {
	                    x.minus = true;
	                }
	            }else if( num < 0 ){
	                if(x.zero){
	                    x.zero = true;
	                }
	                if(x.minus){
	                    x.plus = true;
	                }
	                if(x.plus){
	                    x.plus = true;
	                }
	            }else if ( num == 0) {
	                x.plus = true;
	            }

	        }
	    }

	    return currentMem;
	}

	public MemKonfig BooleanLessThanEval (MemKonfig mem, BooleanLessThanExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals(var.x)) {
	            if( num > 0) {
	                break;
	            }else if( num <= 0 ){
	                x.plus = false;
	                x.zero = false;
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig BooleanGreaterThanEqualsEval (MemKonfig mem, BooleanGreaterThanEqualsExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals(var.x)) {
	            if( num < 0) {
	                break;
	            }else if( num > 0 ){
	                x.zero = false;
	                x.minus = false;
	            }else if( num == 0){
	                x.minus = false;
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig BooleanGreaterThanEval (MemKonfig mem, BooleanGreaterThanExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals(var.x)) {
	            if( num < 0) {
	                break;
	            }else if( num >= 0 ){
	                x.minus = false;
	                x.zero = false;
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig BooleanNegationEqualsEval (MemKonfig mem, BooleanNegationEqualsExpression exp) {
	    MemKonfig currentMem = mem.Clone();

	    VarExpression var = (VarExpression)exp.lhs;
	    int num = Integer.parseInt(((NumExpression)exp.rhs).n);

	    for(VarKonfig x : currentMem.memory) {
	        if(x.varname.equals(var.x)) {
	            if( num > 0) {
	                x.plus = false;
	            }else if( num < 0 ){
	                x.minus = false;
	            }else if(num == 0){
	                x.zero = false;
	            }
	        }
	    }

	    return currentMem;
	}

	public MemKonfig BooleanNegationEval (MemKonfig mem, BooleanNegationExpression exp) {
		MemKonfig currentMem = Evaluate(mem.Clone(), exp.value);
		
		if(exp.value.Type() == ">") {
			BooleanGreaterThanExpression gte = (BooleanGreaterThanExpression)exp.value;
			for(VarKonfig x : currentMem.memory) {
		        if(x.varname.equals(((VarExpression)gte.lhs).x)) {
		        	for(VarKonfig y : mem.memory) {
				        if(y.varname.equals(x.varname)) {
				            if(y.minus != x.minus) {
				            	x.minus = !x.minus;
				            }
				            else {
				            	x.minus = false;
				            }
				            if(y.plus != x.plus) {
				            	x.plus = !x.plus;
				            }else {
				            	x.plus = false;
				            }
				            if(y.zero != x.zero) {
				            	x.zero = !x.zero;
				            }else {
				            	x.zero = false;
				            }
				        }
				    }
		        }
		    }
			return currentMem;
		}else if(exp.value.Type() == "<=") {
			BooleanLessThanEqualsExpression gte = (BooleanLessThanEqualsExpression)exp.value;
			for(VarKonfig x : currentMem.memory) {
		        if(x.varname.equals(((VarExpression)gte.lhs).x)) {
		            x.minus = !x.minus;
		            x.plus = !x.plus;
		            x.zero = false;
		        }
		    }
			return currentMem;
		}
		else {
			System.out.println("Unhandeled: " + exp.GetLabel());
			return mem;
		}
		
		
	}
	
	
	}


