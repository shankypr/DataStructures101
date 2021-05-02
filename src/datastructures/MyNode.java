package datastructures;

public class MyNode {

	String data;
	MyNode next;
	int val;
	
	
	MyNode(int _val) {
		this.val = _val;
	}
	
	MyNode(String val) {
		this.data = val;
	}
	
	MyNode(int _val, MyNode next) {
		this.val = _val;
		this.next = next;
	}

	MyNode(String val, MyNode next) {
		this.data = val;
		this.next = next;
	}

	public String getData() {
		return this.data;
	}
	
	public int getVal() {
		return this.val;
	}
	
	public MyNode getNext() {
		return this.next;
	}

}
