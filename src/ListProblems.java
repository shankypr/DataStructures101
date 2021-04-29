import datastructures.MyList;

public class ListProblems {
	
	MyList list;
	
	public ListProblems() {
		list = new MyList();
		populateList();
		
	}
	
	
	private void populateList() {
		String arr[] = {"t","b","d","a","m","k"};
		String arr2[] = {"z","x","a"};
		
		for(String str:arr) {
			list.addLast(str);
		}
		
		for(String str:arr2) {
			list.addFirst(str);
		}
		
		
		
		System.out.println("Has Duplicates: "+list.hasDuplicates());
		//list.printList();
	}

	

	

}
