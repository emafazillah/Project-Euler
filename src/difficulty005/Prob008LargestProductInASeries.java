package difficulty005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prob008LargestProductInASeries {
	
	public static void main(String[] args) {
		StringBuffer input = new StringBuffer("73167176531330624919225119674426574742355349194934");
		input.append("96983520312774506326239578318016984801869478851843");
		input.append("85861560789112949495459501737958331952853208805511");
		input.append("12540698747158523863050715693290963295227443043557");
		input.append("66896648950445244523161731856403098711121722383113");
		input.append("62229893423380308135336276614282806444486645238749");
		input.append("30358907296290491560440772390713810515859307960866");
		input.append("70172427121883998797908792274921901699720888093776");
		input.append("65727333001053367881220235421809751254540594752243");
		input.append("52584907711670556013604839586446706324415722155397");
		input.append("53697817977846174064955149290862569321978468622482");
		input.append("83972241375657056057490261407972968652414535100474");
		input.append("82166370484403199890008895243450658541227588666881");
		input.append("16427171479924442928230863465674813919123162824586");
		input.append("17866458359124566529476545682848912883142607690042");
		input.append("24219022671055626321111109370544217506941658960408");
		input.append("07198403850962455444362981230987879927244284909188");
		input.append("84580156166097919133875499200524063689912560717606");
		input.append("05886116467109405077541002256983155200055935729725");
		input.append("71636269561882670428252483600823257530420752963450");
		String sInput = input.toString(); 
		char[] cInput = sInput.toCharArray();		
		List<Long> results = new ArrayList<Long>();
		int i = 0;
		while(i <= cInput.length - 13) {
			String ss = sInput.substring(i, i + 13);
			int j = 0;			
			long result = 1L;
			while(j < ss.length()) {				
				result *= Long.parseLong(ss.substring(j, j + 1));
				j++;
			}
			results.add(result);
			i++;
		}
		Collections.sort(results, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(results.get(0));
	}

}
