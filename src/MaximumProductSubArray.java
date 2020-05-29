
public class MaximumProductSubArray {

    public static int maxProduct(int[] nums) {
    	if(nums.length <= 0)
    		return 0;
    	
    	int max_val = nums[0];
    	int min_val = nums[0];
    	int maximum = nums[0];
    	
    	for(int i=1; i<nums.length; i++) {    		
    		int t = max_val;
    		max_val = Math.max(nums[i], Math.max(max_val * nums[i], min_val * nums[i]));
    		min_val = Math.min(nums[i], Math.min(t * nums[i], min_val * nums[i]));
    		maximum = Math.max(maximum, max_val);
    	}
    	return maximum;
    }
	
	
	public static void main(String[] args) {
		//int[] nums = {3,-1,4};
		//int[] nums = {-2,3,-4,-10};
		int[] nums = {2,-5,-2,-4,3};
		System.out.println(maxProduct(nums));

	}

}
