
public class LongestCommonPrefix {
	
    public static String longestCommonPrefix(String[] strs) {
    	if(strs.length<=0) {
    		return "";
    	}
        String commonPrefix = strs[0];
        for(int i=1; i<strs.length; i++) {
        	String second = strs[i];
        	commonPrefix = compare(commonPrefix, second);
        }
        return commonPrefix;    	
    }
    
    public static String compare(String s1, String s2) {
    	StringBuilder sb = new StringBuilder();
    	//check which string length is small at first
    	if(s1.length()>s2.length()) {
    		String t = s1;
    		s1 = s2;
    		s2 = t;
    	}
    		for(int i=0; i<s1.length(); i++) {
    			if(s2.charAt(i) == s1.charAt(i)) {
    				sb.append(s1.charAt(i));
    			}else {
    				break;
    			}
    		}
    	return sb.toString();
    }

	public static void main(String[] args) {

		String[] strgs = {};
		System.out.println(longestCommonPrefix(strgs));

	}

}
