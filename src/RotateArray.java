import java.util.Arrays;

public class RotateArray {
	
	
	public static int[] reverse(int start, int end, int[] nums) {
		while(start < end) {
			int t = nums[start];
			nums[start] = nums[end];
			nums[end] = t;
			start++;
			end--;
		}
		
		return nums;
	}

    public static void rotate(int[] nums, int k) {
    	k %= nums.length;
    	nums = reverse(0, nums.length -1, nums);
    	nums = reverse(0, k-1, nums);
    	nums = reverse(k, nums.length -1, nums);
    	for(int i : nums) {
    		System.out.print(i + " | ");
    	}
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		rotate(nums, 2);
	}

}
