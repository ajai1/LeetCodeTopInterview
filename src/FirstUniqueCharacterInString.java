import java.util.HashMap;

public class FirstUniqueCharacterInString {
	
    public static int firstUniqChar2(String s) {
    	if(s.isEmpty()) {
    		return -1;
    	}
    	
    	char prev = s.charAt(0);
    	if(s.substring(1).indexOf(prev) == -1) {
    		return s.indexOf(prev);
    	}
        for(int i=1; i<s.length(); i++) {
        	prev = s.charAt(i);
        	String fh = s.substring(0, i);
        	String sh = s.substring(i+1, s.length());
        	if(fh.indexOf(prev) == -1 && sh.indexOf(prev) == -1) {
        		return s.indexOf(prev);
        	}
        }
    	return -1;

    }
    
    public static int firstUniqChar(String s) {
    	if(s.isEmpty()) {
    		return -1;
    	}
    	HashMap<Character, Integer> hm = new HashMap<>();
    	for(int i=0; i< s.length();i++) {
    		char ch = s.charAt(i); 
    		hm.put(ch, hm.getOrDefault(ch, 0) + 1);
    	}
    	for(int i=0; i<s.length(); i++) {
    		if(hm.get(s.charAt(i)) == 1)
    			return i;
    	}
    	return -1;
    }
    
    public static int firstUniqCharAlpha(String s) {
        
        int[] alphabet = new int[26];
        
        for(int i = 0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i<s.length(); i++){
            if(alphabet[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqCharAlpha(s));

	}

}
