import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		long num1 = 1L;
		long num2 = 2L;
		long sum = num1 + num2;
		long total = 2; // to count for the second term, which is even
		ArrayList<Long> evens = new ArrayList<Long>();
		while(num2 < 4000000) {
			if(sum%2 == 0) {
				evens.add(sum);
			}
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		for(long y : evens) {
			total = total + y;
		}
		System.out.println(total);
		System.out.println(evens);
	}
}
