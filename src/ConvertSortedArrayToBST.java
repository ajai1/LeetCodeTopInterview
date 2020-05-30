
public class ConvertSortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length == 0) return null;
    	return constructTree(nums, 0, nums.length-1);
    }
    
    public static TreeNode constructTree(int[] nums, int left, int right) {
    	if(left>right) return null;
    	int mid = (left + right)/2;
    	TreeNode node = new TreeNode(nums[mid]);
    	node.left = constructTree(nums, left, mid-1);
    	node.right = constructTree(nums, mid+1, right);
    	
    	return node;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {-10,-3,0,5,9};
		TreeNode n = sortedArrayToBST(nums);
		System.out.println("Done");

	}

}
