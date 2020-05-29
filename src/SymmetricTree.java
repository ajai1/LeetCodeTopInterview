
public class SymmetricTree {
	
	
	  //Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	public static boolean isSymmetric(TreeNode root) {
	
		return false;
	} 

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),new TreeNode(2,  new TreeNode(4), new TreeNode(3));
		System.out.println(isSymmetric(root));
	}

}
