package telran.util.tests;

import java.util.Comparator;

public class DigitsSumComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return getDigitsSum(o1) - getDigitsSum(o2);
	}
	
	private int getDigitsSum(Integer num) {
		int sum = 0;
		int digit = 0;
		do {
			digit = Math.abs(num % 10);
			sum += digit;
			num /= 10;
		}while(num != 0);
		return sum;
	}
}
