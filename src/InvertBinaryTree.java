
public class InvertBinaryTree {
	
    public static TreeNode invertTree(TreeNode root) {
        if(root == null)	return null;        
    	TreeNode left = invertTree(root.left);
    	TreeNode right = invertTree(root.right);
    	root.right = left;
    	root.left = right;
    	return root;
    }
    

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4, new TreeNode(2,new TreeNode(1), new TreeNode(3))
				,new TreeNode(7,new TreeNode(6),new TreeNode(9)));
		
	//	TreeNode root = new TreeNode(4, new TreeNode(2), null);
		TreeNode node = invertTree(root);
	}

}
