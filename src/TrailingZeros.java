
public class TrailingZeros {

    public static int trailingZeroes(int n) {
    	
    	
    	int zeros = 0;
    	while(n/5 != 0) {
    		zeros += n/5;
    		n = n/5;
    	} 	
    	return zeros;
    }

	
	public static void main(String[] args) {
		int n = 200;
		System.out.println(trailingZeroes(n));

	}

}
