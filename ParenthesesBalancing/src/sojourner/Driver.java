package sojourner;

public class Driver {

	public static void main(String[] args) {
		Verifier v = new Verifier();
		String inString="a";//"{{{({)}}}}";
		for(int i=0; i < inString.length(); i++){
			char c = inString.charAt(i);
			if(!v.isBalanced(String.valueOf(c))){
				System.out.println("Invalid sequence");
				System.exit(1);
			}
		}
		if(v.getTop() != -1){
			System.out.println("Invalid Sequence");
		}
		else{
			System.out.println("Valid Sequence");
		}
	}
}
