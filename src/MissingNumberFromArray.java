import java.util.Arrays;

public class MissingNumberFromArray {
	
    public static int missingNumber(int[] nums) {
        if(nums.length == 0)	return -1;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++) {
        	if(nums[i] != i) {
        		return i;
        	}
        }
        return 0;
    }

	public static void main(String[] args) {

		int[] nums = {0};
		System.out.println(missingNumber(nums));
		

	}

}
