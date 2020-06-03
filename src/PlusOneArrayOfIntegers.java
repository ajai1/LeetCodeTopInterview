import java.util.Arrays;

public class PlusOneArrayOfIntegers {

    public static int[] plusOne(int[] digits) {
    	int[] s;
    	int size;
    	if(digits[0] == 9) {
    		s =  new int[digits.length + 1];
    		size = digits.length + 1;
    	}else {
    		s =  new int[digits.length];
    		size = digits.length;
    	}
    	
    	s[s.length-1] = 1;
    	int carry = 0;
    	for(int i=digits.length-1; i >=0 ; i--) {
    		int val = digits[i] + s[size-1] + carry;
    		if(val > 9) {
    			carry = 1;
    			val = 0;
    		}else {
    			carry = 0;
    		}
    		s[size-1] = val;
    		size --;
    	}
    	if(carry == 1)
    		s[0] = carry;

    	return s;
    }
	
	public static void main(String[] args) {
		int[] d = {1,2,9};
		int[] r = plusOne(d);
		for(int i : r)
			System.out.print(i+ " ");

	}

}
