
public class RangeOfSumBST {
	
    public static int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root == null) return sum;
        else if(root.val >= L && root.val <= R)
        	sum += root.val;
        sum += rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    	return sum;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10, 
				new TreeNode(5, 
						new TreeNode(3), new TreeNode(7)), new TreeNode(15, 
								null, new TreeNode(18)));
		
		int L = 7;
		int R = 15;
		
		System.out.println(rangeSumBST(root, L, R));

	}

}
