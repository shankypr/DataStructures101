package datastructures;

import java.util.logging.*;



public class MyList {

	
	private final static Logger LOGGER = Logger.getLogger(MyList.class.getName());
	
	MyNode head;
	public MyList() {
		
	}
	
	
	public void addLast(String str) {
		if(str==null||str.isEmpty()) {
			return;
		}
		
		MyNode newNode = new MyNode(str);
		newNode.next = null;
		
		if(head==null) {
			head = newNode;
		}
		else {
			MyNode prev = null;
			MyNode curr=head;
			while(curr!=null) {
				prev = curr;
				curr=curr.next;
			}
			prev.next = newNode;
		}
	}
	
	public void addFirst(String str) {
		MyNode newNode = new MyNode(str);
		if(head==null) {
			this.head = newNode;
			this.head.next = null;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void printList() {
		
		
		if(head==null) {
			return;
		}
		MyNode curr = head;
		
		while(curr!=null) {
			System.out.print("["+curr.data+"],");
			curr=curr.next;
		}
		
		
	}
	
	public MyNode kthToLast(int k) {
		if(k==0) {
			return this.head;
		}
		
		
		//MyNode target = null;
		MyNode prev = head;
		MyNode runner = head;
		int tmp=k;
		while(runner!=null && tmp>0) {
			tmp--;
			runner=runner.next;
		}
		if(tmp>0) {
			return null;
		}
		
		while(runner !=null) {
			runner=runner.next;
			prev = prev.next;
		}
		
		return prev;
		
	}
	
	public Boolean delete(String str) {
		Boolean deletedDups = false;
		if(str == null || str.isEmpty()) {
			return deletedDups;
		}
		MyNode prev = null;
		MyNode curr = head;
		
		while(curr!=null) {
			
			if(curr.data.equals(str)) {
				prev.next = curr.next;
				deletedDups = true;
			}
			prev = curr;
			curr=curr.next;
		}
		return deletedDups;
	}
	
	public Boolean hasDuplicates() {
		if(head==null||head.next==null) {
			return false;
		}
		MyNode curr = head;
		while(curr!=null) {
			MyNode runner = curr.next;
			while(runner!=null) {
				if(curr.data.equals(runner.data)) {
					return true;
				}				
				runner=runner.next;
			}
			curr=curr.next;
		}
		return false;
	}
	

}
