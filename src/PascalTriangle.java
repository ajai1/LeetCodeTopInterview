import java.util.*;

public class PascalTriangle {
	
    public static List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return null;
        List <List<Integer>> ls = new LinkedList<>();
        for(int i =1; i<=numRows; i++) {
        	List<Integer> l = new LinkedList<>();
        	for(int j = 1; j<=i; j++) {
        		if(j == 1 || j == i) {
        			l.add(1);
        		}else {
        			List<Integer> previous = ls.get(i-2);
        			l.add(previous.get(j-1)+previous.get(j-2));
        		}
        	} 
        	ls.add(l);
        }
    	return ls;
    }

	public static void main(String[] args) {
		int n = 5;
		List <List<Integer>> l = generate(n);
		System.out.println(l);
	}

}
