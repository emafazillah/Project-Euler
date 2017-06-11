package difficulty005;

import java.math.BigInteger;

public class LargestPrimeFactor {
	
	// nanti sambung
	public static void main(String[] args) {
		BigInteger input = new BigInteger("13195"); // 600851475143		
		long biggest_prime_factor = input.longValue();
		while(input.isProbablePrime(1) && (input.longValue() % biggest_prime_factor == 0)) {	
			biggest_prime_factor--;
		}
		System.out.print(biggest_prime_factor);
	}

}
