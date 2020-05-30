public class MaxDepthBinaryTree {

    public static int maxDepth(TreeNode root) {
    	if(root == null) return 0;
    	int leftMax = maxDepth(root.left);
    	int rightMax = maxDepth(root.right);
    	return Math.max(leftMax, rightMax)+1;
    }
    
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2,new TreeNode(3), new TreeNode(4))
				,new TreeNode(2,new TreeNode(4),new TreeNode(3,new TreeNode(5), null)));
		System.out.println(maxDepth(root));
	}

}
