import java.util.Arrays;

public class TribonacciNumber {

	public static int tribonacci(int n) {
		int[] mem = new int[38];
		Arrays.fill(mem, -1);
		mem[0] = 0;
		mem[1] = 1;
		mem[2] = 1;
		return populateAndReturn(mem, n);
	}
	
	public static int populateAndReturn(int[] mem, int n) {
		if(mem[n] != -1) {
			return mem[n];
		}
		mem[n] = populateAndReturn(mem, n-1) +  populateAndReturn(mem, n-2) +  populateAndReturn(mem, n-3);
		return mem[n];
	}

	public static void main(String[] args) {
		
		int n = 25;
		System.out.println(tribonacci(n));

	}

}
