
public class ReverseStringCharArray {
	
    public static void reverseString(char[] s) {
    	int start = 0;
    	int end = s.length-1;
    	while(start<end) {
    		char t = s[start];
    		s[start] = s[end];
    		s[end] = t;
    		++start;
    		--end;
    	}
    }

	public static void main(String[] args) {
		
		char[] s = {'H','e','l','l','o'};
		reverseString(s);
	}

}
