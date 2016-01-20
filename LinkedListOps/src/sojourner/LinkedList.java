package sojourner;

public class LinkedList {
	static int count=0;
	static Node head;
	static Node curr;
	static Node revHead;
	public LinkedList(int n){
		Node node = new Node(n);
		if(LinkedList.count == 0){
			LinkedList.head = node;
			LinkedList.curr = node;
		}
		else{
			(LinkedList.curr).next = node;
			LinkedList.curr = (LinkedList.curr).next;
		}
		node.setNext(null);
		LinkedList.count++;
	}
	public static Node getHead() {
		return LinkedList.head;
	}
	public static Node getrevHead() {
		return LinkedList.revHead;
	}
	public static void resetCurr(){
		LinkedList.curr = null;
	}
	/*
	 * Recursive function to reverse linked list
	 * Time: O(n), Space: O(1)
	 */
	public static void reverseList(Node h){
		if(h == null){
			return;
		}
		LinkedList.revHead = h;
		Node p = h.getNext();
		h.setNext(LinkedList.curr);
		LinkedList.curr = h;
		reverseList(p);
	}
}
