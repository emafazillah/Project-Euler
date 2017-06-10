package difficulty005;

public class MultiplesOf3And5 {
	
	public static void main(String[] args) {
		int count = 3;
		int sum = 0;
		while(count < 1000) {
			if(count % 3 == 0 || count % 5 == 0) sum += count;
			count++;
		}
		System.out.println(sum);
	}

}
