import java.util.ArrayList;

public class ReverseBits {

    public static int reverseBitsUsingStringBuilder(int n) {        
    	String binaryString = Integer.toUnsignedString(n, 2);
    	int zeroCount = Integer.numberOfLeadingZeros(n);
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i< zeroCount; i++) {
    		sb.append(0);
    	}
    	sb.append(binaryString);	
    	sb.reverse();
    	
    	return Integer.parseUnsignedInt(sb.toString(), 2);
    }
    
    public static int reverseBits(int n) {
    	
    	int it = 32;
    	ArrayList<Integer> bits = new ArrayList<Integer>();
    	while(it > 0) {
    		int t = n & 1;
    		bits.add(t);
    		n = n >> 1;
    		it--;
    	}
    	int r = 0;
    	for(int i =0; i<bits.size(); i++) {
    		r = r << 1;
    		r = r | bits.get(i);
    	}    	
    	return r;
    }
	
	public static void main(String[] args) {
		
		int n = 43261596;
		
		System.out.println(reverseBits(n));

	}

}
