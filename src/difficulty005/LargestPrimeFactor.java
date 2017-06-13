package difficulty005;

public class LargestPrimeFactor {
	
	public static void main(String[] args) {
		long input = 600851475143L;
		long temp = 4L;
		long factoral = 0L;
		boolean isBiggestPrimeFactor = false;		
		while(!isBiggestPrimeFactor) {
			// Sieve of Eratosthene or Trial division		
			if(input % 2L != 0 && input % 3L != 0) {
				while(temp * temp <= input) {
					if(input % temp == 0L) {
						if(factoral == 0L) 
							factoral = temp;
						else 
							factoral *= temp;
						break;
					}
					temp++;
				}
			}
			if(factoral == input) {
				isBiggestPrimeFactor = true;
				System.out.print(temp);
			}
			temp++;
		}		
	}

}
