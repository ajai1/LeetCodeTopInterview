
public class SingleNumber {

    public static int singleNumber2(int[] nums) {
        int t = -1;
        boolean notfound = true;
    	for(int i = 0; i< nums.length; i++) {
    		notfound = true;
    		if(nums[i] == 0)
    			continue;
    		t=nums[i];
    		for(int j =i+1; j<nums.length; j++) {
    			if(nums[j] == 0)
    				continue;
    			if(nums[i] == nums[j]) {
    				nums[i] = 0;
    				nums[j] = 0;
    				notfound = false;
    				break;
    			}
    		}
    		if(notfound) {
    			return t;
    		}
    	}
    	
    	return t;
    }
    
    public static int singleNumber(int[] nums) {
    	if(nums.length <= 0)
    		return -1;
    	int f = nums[0];
    	for(int i=1; i< nums.length; i++) {
    		f = f^nums[i];
    	}    	
    	return f;
    }
    
    public static char singleChar(char[] chars) {
    	if(chars.length <= 0)
    		return 'a';
    	char f = chars[0];
    	for(int i=1; i< chars.length; i++) {
    		f = (char) (f^chars[i]);
    	}    	
    	return f;
    }
	
	public static void main(String[] args) {

		int[] n = {2,3,5,3,2};
		char[] c = {'l','o','v','e','l','e','o','c'};
		System.out.println(singleNumber(n));
		System.out.println(singleChar(c));

	}

}
