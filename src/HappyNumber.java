
public class HappyNumber {
	
    public static boolean isHappy(int n) {
    	int t = 0;
    	while (n != 1) {
    		while(n/10 != 0) {
        		t += ((n%10)*(n%10));
        		n = n/10;
        	}
    		t += ((n%10)*(n%10));
    		if(t == 4)
    			return false;
    		n = t;
    		t = 0;
    	}    	
    	if(n == 1)
    		return true;
    	return false;
    }
    
	public static void main(String[] args) {
		
		int n = 17;
		System.out.println(isHappy(n));

	}

}
