import datastructures.MyList;
import datastructures.MyListInterface;
import datastructures.MyNode;

public class ListProblems {
	
	MyListInterface list;
	
	public ListProblems() {
		list = new MyList();
		populateList();
		
		System.out.println("Node Val: "+list.get(4).getData());
		
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
	}

	

	

}
