package Project1;

public class ListNode {

	private Object data;
	private ListNode nextNode;

	// first constructor
	public ListNode(Object newData) {
		this.nextNode = null;
		this.data = newData;
	}

	// second constructor
	public ListNode(Object newData, ListNode newNextNode) {
		this.nextNode = newNextNode;
		this.data = newData;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}

}
