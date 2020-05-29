import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
    public static List<String> fizzBuzz(int n) {
    	ArrayList<String> al = new ArrayList<>();
    	for(int i = 1; i<=n ; i++) {
    		if(i%3 == 0 && i%5 == 0) {
    			al.add("FizzBuzz");
    		}else if(i%3 == 0) {
    			al.add("Fizz");
    		}else if(i%5 == 0) {
    			al.add("Buzz");
    		}else {
    			al.add(Integer.toString(i));
    		}
    	}
        
    	return al;
    }

	public static void main(String[] args) {
		int n = 15;
		ArrayList<String> al = (ArrayList<String>) fizzBuzz(n);
		System.out.println(al);
		
	}

}
