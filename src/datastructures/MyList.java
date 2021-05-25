package datastructures;

import java.util.logging.*;



public class MyList implements MyListInterface {

	
	private final static Logger LOGGER = Logger.getLogger(MyList.class.getName());
	
	MyNode head;
	public MyList() {
		
	}
	
	@Override
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
	
	@Override
	public void addFirst(String str) {
		MyNode newNode = new MyNode(str);
		if(head==null) {
			this.head = newNode;
			this.head.next = null;
		}
		newNode.next = head;
		head = newNode;
	}
	
	@Override
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
	
	
	@Override
	public MyNode get(int idx) {
		if(idx==-1) {
			return null;
		}
		MyNode curr = this.head;
		for(;idx>0;idx--) {
			if(curr!=null) {
				curr=curr.next;
			}
		}
		return curr;
	}
	
	@Override
	public MyNode kthToLast(int k) {
		if(k==0) {
			return this.head;
		}
		
		
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
	
	@Override
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
	
	@Override
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
	
	@Override
	public Boolean removeDuplicates() {
		if(head==null||head.next==null) {
			return false;
		}
		MyNode curr = head;
		while(curr!=null) {
			MyNode prev = curr;
			MyNode runner = curr.next;
			while(runner!=null) {
				if(curr.data.equals(runner.data)) {
					prev.next = runner.next;
					runner = runner.next;
					
				}				
				runner=runner.next;
				prev = prev.next;
			}
			curr=curr.next;
		}
		return false;
	}
	
	@Override 
	public Boolean containsCycle() {
		if(this.head == null || this.head.next == null) {
			return false;
		}
		
		
		MyNode slow = this.head;
		MyNode fast = this.head.next;
		
		while(slow !=null) {
			if(fast == null || fast.next==null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				return true;
			}
			
		}
		return false;
		
	}
	
	
	

	

}
