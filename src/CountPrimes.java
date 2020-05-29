import java.util.Arrays;

class CountPrimes {
	
	 public static int countPrimes(int n) {
	        int count = 0;
	        boolean[] primes = new boolean[n];

	        for(int i = 2; i<Math.sqrt(n); i++){
	        	if(!primes[i]) {
		            for(int j = i; j*i < n; j++){
		            	primes[i*j] = true;
		            }
	        	}

	        }
	        for(int i =2; i< n; i++){
	            if(!primes[i]) {
	                count ++;
	            }
	        }
	        return count;
	 }
	 
	 public static int countprime(int n) {
			boolean[] primes = new boolean[n]; //all initialized to false
			/*starting at 2 because all numbers are divisible by 1 and undivisble by 0.
			We do i*i and j*i because mathematecally there are no primers greater than the current number and its square*/
			for(int i = 2; i*i < primes.length; i++){
				if(!primes[i]){
					for(int j = i; j*i < primes.length; j++){
						primes[i*j] = true;
					}
				}
			}
			int result = 0;
			for(int i = 2; i < primes.length; i++){
				if(!primes[i]){
					result++; //count all primes
				}
			}
			return result;
		}

	public static void main(String[] args) {

		System.out.println(countPrimes(999983));

	}

}
