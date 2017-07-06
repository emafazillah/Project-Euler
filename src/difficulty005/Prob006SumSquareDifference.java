package difficulty005;

public class Prob006SumSquareDifference {
	
	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		long sum_of_squares = 0L;
		long square_of_sums = 0L;
		for(int i = min; i < max + 1; i++) {
			double sumofsquares = Math.pow(Double.parseDouble(Long.toString(i)), 2);
			sum_of_squares += Math.round(sumofsquares);
			square_of_sums += Long.parseLong(Integer.toString(i));
		}
		double squareofsums = Math.pow(Double.parseDouble(Long.toString(square_of_sums)), 2);
		square_of_sums = Math.round(squareofsums);
		System.out.println(square_of_sums - sum_of_squares);
	}

}
