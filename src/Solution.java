import java.util.ArrayList;
import java.util.List;

// * Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }





public class Solution {
	
	ListNode head;
	
	ListNode list1;
	ListNode list2;
	
	public Solution() {
		
//		ListNode node1 = new ListNode(1);
//		node1.next = new ListNode(2);
//		node1.next.next = new ListNode(3);
//		node1.next.next.next = new ListNode(4);
//		head = node1;
//		list1=node1;
//		
//		ListNode node2 = new ListNode(1);
//		node2.next = new ListNode(3);
//		node2.next.next.next = new ListNode(4);
//		list2=node2;
	}
	  
	//https://leetcode.com/problems/palindrome-linked-list/
	public boolean isPalindrome() {
			List<Integer> list = new ArrayList();	
	        if(head==null|head.next==null) {
	        	return true;
	        }
	        ListNode end=head;
	        while(end!=null) {
	        	list.add(Integer.valueOf(end.val));
	        	end=end.next;
	        }
	        int i=0;
	        int j = list.size()-1;
	        
	        while(i<j) {
	        	if(list.get(i) != list.get(j)) {
	        		return false;
	        	}
	        	i++;
	        	j--;
	        }
	    return true;    
	}
	
	
	 public ListNode mergeTwoLists() {
		 if(list1==null) {
			 return list2;
		 }
		 else if(list2==null) {
			 return list1;
		 }
		 
	
		 return null;
	        
	 }

	 
	  public String longestCommonPrefix(String[] strs) {
		   if (strs.length == 0) 
			   return "";
		       String prefix = strs[0];
		       for (int i = 1; i < strs.length; i++)
		           while (strs[i].indexOf(prefix) != 0) {
		               prefix = prefix.substring(0, prefix.length() - 1);
		               if (prefix.isEmpty()) return "";
		           }        
		       return prefix;
		 }
	  
	  
}
