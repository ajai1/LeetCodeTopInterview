
public class ValidAnagram {
	
    public static boolean isAnagram(String s, String t) {
    	if(s.isEmpty() && t.isEmpty()) return true;
    	if(s.isEmpty() || t.isEmpty() || s.length() != t.length())
    		return false;
    	
    	int[] al = new int[26]; 
    	for(int i =0; i<s.length(); i++) {
    		++al[s.charAt(i) - 'a'];
    		--al[t.charAt(i) - 'a'];
    	}
    	for(int i=0; i< al.length; i++) {
    		if(al[i] != 0)
    			return false;
    	}
    	return true;
    }

	public static void main(String[] args) {
		
		
		String s = "dacc";
		String t = "acdc";
		System.out.println(isAnagram(s,t));

	}

}
