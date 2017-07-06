package difficulty005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prob004LargestPalindromeProduct {
	
	public static void main(String[] args) {
		int max = 999;
		int min = 99;
		int first = 0;
		int second = 0;
		List<Integer> palindromes = new ArrayList<Integer>();
		for(first = max; first > min; first--) {
			for(second = max; second > min; second--) {
				char[] arr = (Integer.toString(first * second)).toCharArray();
				String str = "";
				for(int i = 0; i < arr.length; i++) {
					str += arr[arr.length - 1 - i];
				}
				int reverse = Integer.parseInt(str);
				if(first * second == reverse) palindromes.add(reverse);
			}
		}
		Collections.sort(palindromes, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(palindromes.get(0));
	}

}
