
public class ClimbStairs {
	
    public static int climbStairs(int n) {
        if(n<0) {
        	return 0;
        }
        if(n == 1 || n == 0) {
        	return 1;
        }
    	int f = 1;
    	int s = 1;
    	for(int i=2; i<=n; i++) {
    		int t = s;
    		s = f+s;
    		f = t;    		
    	}
    	return s;
    }

	public static void main(String[] args) {
		System.out.println(climbStairs(6));
	}

}
