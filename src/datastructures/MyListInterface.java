package datastructures;

public interface MyListInterface {

	void addLast(String str);

	void addFirst(String str);

	void printList();

	MyNode get(int idx);

	MyNode kthToLast(int k);

	Boolean delete(String str);

	Boolean hasDuplicates();
	
	Boolean removeDuplicates();
	
	Boolean containsCycle();

}