
public class CountAndSay {
	
    public static String countAndSay(int n) {
    	if(n == 1) {
    		return "1";
    	}else {    	
	    	String result = countAndSay(n-1);
	    	int count = 1;
	    	char first = result.charAt(0);
	    	StringBuilder sb = new StringBuilder();
	    	for(int i=1; i< result.length(); i++) {
	    		if(first != result.charAt(i)) {
	    			sb.append(count);
	    			sb.append(first);
	    			count = 1;
	    			first = result.charAt(i);
	    		}else {
	    			count ++;
	    		}
	    	}
	    	sb.append(count);
			sb.append(first);
	    	return sb.toString();
    	}
    }
    
	public static void main(String[] args) {

		int n = 4;
		System.out.println(countAndSay(n));

	}

}
