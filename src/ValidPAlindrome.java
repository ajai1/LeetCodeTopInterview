
public class ValidPAlindrome {
	
	public static boolean isPalindrome(String s) {

		int i = 0;
		int e = s.length()-1;
		while(i < e ) {
			while(i<e && !Character.isLetterOrDigit(s.charAt(i))) {
				++i;
			}
			while(e > i && !Character.isLetterOrDigit(s.charAt(e))){
				--e;
			}
    		if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(e))) {
        		if(i<e && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(e--))) {
        			return false;
        		}
    		}else {
    			return false;
    		}
		}
		
		return true;
	}

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}

}
