
public class RemoveDuplicatesFromArray {
	
	static int[] nums = {0,0,1,1,1,2,2,3,3,4};
	
    public static int removeDuplicates(int[] nums) {
    	if(nums.length == 0)	return 0;
    	int o = nums[0];
    	int uni = 0;
    	for(int i =1; i< nums.length; i++) {
    		if(nums[i] != o) {
    			uni++;
    			nums[uni] = nums[i];
    			o = nums[i];
    		}
    	}        
    	return uni+1;
    }

	public static void main(String[] args) {

		
		int length = removeDuplicates(nums);
		for(int i=0; i< length; i++) {
			System.out.print(nums[i] + " , ");
		}

	}

}
