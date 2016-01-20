/*
 * Somnath Sarkar
 */
package sojourner;

public class Node {
	int num;
	Node next;
	public Node(int n){
		this.num = n;
	}
	public Node getNext() {
		return this.next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getNum() {
		return this.num;
	}
}
