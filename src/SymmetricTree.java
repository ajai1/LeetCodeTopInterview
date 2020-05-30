
  //Definition for a binary tree node.
  class TreeNode {
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


public class SymmetricTree {	 
	public static boolean isSymmetric(TreeNode root) {		
		return root==null || checkTree(root.left, root.right);
	} 
	
	public static boolean checkTree(TreeNode left, TreeNode right) {		
		if(left == null && right == null)
			return true;
		else if (left != null && right != null) {
			return left.val == right.val && (checkTree(left.left, right.right) && checkTree(left.right, right.left));
		}		
		return false;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1, new TreeNode(2,new TreeNode(3), new TreeNode(4))
				,new TreeNode(2,new TreeNode(4),new TreeNode(3)));
		System.out.println(isSymmetric(root));
	}

}
