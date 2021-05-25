package datastructures;

public class TreeNode {
	
	TreeNode left;
	TreeNode right;
	int val;

	public TreeNode(int val) {
		this.val=val;
	}
	
	public TreeNode(int val,TreeNode l, TreeNode r) {
		this.val=val;
		this.left=l;
		this.right=r;
	}
}
