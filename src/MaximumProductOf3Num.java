import java.util.Arrays;

public class MaximumProductOf3Num {
	
    public static int maximumProduct(int[] nums) {
        if(nums.length == 0)
        	return 0;
        
        Arrays.sort(nums);
        int max = 1;
        int front= 1;
        int l = nums.length-1;
        max = nums[l] * nums[l-1] * nums[l-2];
        front = nums[0] * nums[1] * nums[l];
        return Math.max(max, front);
    }

	public static void main(String[] args) {
		int[] nums = {2,1,2,3,-6,-2};
		System.out.println(maximumProduct(nums));

	}

}
