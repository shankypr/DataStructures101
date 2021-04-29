package datastructures;

public class MyNode {

	String data;
	MyNode next;
	
	MyNode(String val) {
		this.data = val;
	}

	MyNode(String val, MyNode next) {
		this.data = val;
		this.next = next;
	} 

}
