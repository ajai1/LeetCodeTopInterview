
public class MaxContiguousSubArray {
	
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
    	int t = nums[0];
    	
    	for(int i = 1 ; i<nums.length; i++) {
    		if((t + nums[i]) > nums[i]) {
    			t = t + nums[i];
    		}else {
    			t = nums[i];
    		}
    		if(t > max) {
    			max = t;
    		}
    	}
    	return max;
    }

	public static void main(String[] args) {
		int[] n = {-2,1};
		System.out.println(maxSubArray(n));
	}

}
