import datastructures.MyList;
import datastructures.MyNode;

public class ListProblems {
	
	MyList list;
	
	public ListProblems() {
		list = new MyList();
		populateList();
		
	}
	
	
	private void populateList() {
		String arr[] = {"t","b","d","a","m","k"};
		String arr2[] = {"z","x","l"};
		
		for(String str:arr) {
			list.addLast(str);
		}
		
		for(String str:arr2) {
			list.addLast(str);
		}
		
		
		
		//System.out.println("Has Duplicates: "+list.hasDuplicates());
		//list.printList();
		MyNode node=list.kthToLast(3);
		System.out.println("REM Dups: "+node.getData());
	}

	

	

}
