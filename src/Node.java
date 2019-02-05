
public class Node {
	private Node next;
	private Person info;
	
	public Node() {
		
	}
	
	public Node(Person info, Node next) {
		this.info = info;
		this.next = next;
	}
	
	public Person getInfo() {
		return info;
	}
	
	public void setInfo(Person info) {
		this.info = info;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
