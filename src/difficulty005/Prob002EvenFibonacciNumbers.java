package difficulty005;

public class Prob002EvenFibonacciNumbers {
	
	public static void main(String[] args) {
		// F(n) = F(n-1) + F(n-2)		
		int fnminus2 = 0;
		int fnminus1 = 1;
		int sum = 0;
		for(int fn = 0; fn < 4000000; fn = fnminus1 + fnminus2) { 
			if(fn % 2 == 0) sum += fn;
			fnminus2 = fnminus1;
			fnminus1 = fn;
		}
		System.out.println(sum);
	}

}
