package datastructures;

public class MyBinarySearchTree {
	
	TreeNode root;

	public MyBinarySearchTree() {
		root = new TreeNode(-1);
	}
	
	public MyBinarySearchTree(int n) {
		root = new TreeNode(n);
	}
	
	
	public TreeNode add(int val) {
		
		return insert(val,root);
		
	}
	
	
	private TreeNode insert(int val, TreeNode curr) {
		if(curr ==null) {
			curr = new TreeNode(val);
			return curr;
		}
		
		if(val<=curr.val) {
			 curr.left = insert(val,curr.left);
		}
		else if (val>curr.val) {
			 curr.right = insert(val,curr.right);
		}
		
		return curr;
		
	}
	
	
	public void printBstStructure() {
		printHelper(root);
		
	}
	private void printHelper(TreeNode curr) {
		if(curr==null) {
			System.out.println("-XX-");
			return;
		}
		
		System.out.println(curr.val);
		printHelper(curr.left);
		printHelper(curr.right);
		
	}
	

}
