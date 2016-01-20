/*
 * Somnath Sarkar
 */
package sojourner;


public class Driver {

	public static void main(String[] args) {
		int[] nl = {1,2,3,4,5,12,9};
		for(int i = 0; i<nl.length ; i++){
			new LinkedList(nl[i]);
		}
		Node n0 = LinkedList.getHead();
		while(n0 != null){
			System.out.print(n0.getNum() + ", ");
			n0 = n0.getNext();
		}
		System.out.println();
		LinkedList.resetCurr();
		n0 = LinkedList.getHead();
		LinkedList.reverseList(n0);
		n0 = LinkedList.getrevHead();
		while(n0 != null){
			System.out.print(n0.getNum() + ", ");
			n0 = n0.getNext();
		}
	}

}
