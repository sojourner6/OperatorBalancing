package sojourner;

import java.util.ArrayList;
import java.util.HashMap;

public class Verifier {
	int top;
	ArrayList<String> stack = new ArrayList<String>();
	HashMap<String, Integer> codeMap = new HashMap<String, Integer>();
	Verifier(){
		top=-1;
		codeMap.put("[", -3);
		codeMap.put("{", -2);
		codeMap.put("(", -1);
		codeMap.put("]", 3);
		codeMap.put("}", 2);
		codeMap.put(")", 1);
		codeMap.put("#", 999);
	}
	public int getTop(){
		return this.top;
	}
	public void push(String s){
		stack.add(s);
		this.top++;
	}
	public String pop(){
		if(this.top > -1){
			String s = stack.get(top);
			stack.remove(top--);
			return s;
		}
		else{
			return "#";
		}
	}
	public boolean isBalanced(String bracket){
		int opCode;
		if(this.codeMap.containsKey(bracket)){
			opCode = this.codeMap.get(bracket);
		}
		else{
			return false;
		}
		if(opCode < 0){
			push(bracket);
		}
		else{
			String currCode = pop();
			if((this.codeMap.get(currCode) + opCode) != 0){
				return false;
			}
		}
		return true;
	}
	void displayStack(){
		for(String s : stack){
			System.out.print(s);
		}
		System.out.println();
	}
}
