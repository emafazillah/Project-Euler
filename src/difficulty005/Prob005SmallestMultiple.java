package difficulty005;

public class Prob005SmallestMultiple {
	
	public static void main(String[] args) {
		int min = 1;
		int max = 20;
		int smallest_multiple = 0;
		int flag = 0;
		while(flag < max) {
			smallest_multiple++;
			if(smallest_multiple % 10 == 0) {
				flag = 0;
				for(int i = min; i < max + 1; i++) {
					if(smallest_multiple % i == 0) flag++;
				}
			}			
		}		
		System.out.println(smallest_multiple);
	}

}
