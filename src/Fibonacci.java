import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		long num1 = 1L;
		long num2 = 2L;
		long sum = num1 + num2; //calculate the next term in the sequence
		long total = 2; // to count for the second term, which is even
		ArrayList<Long> evens = new ArrayList<Long>();
		while(num2 < 4000000) { //only want terms before 4 million
			if(sum%2 == 0) {
				evens.add(sum); // keeping track of all the even numbers
			}
			num1 = num2; //first number is now the second
			num2 = sum; // change the second number to the sum of the previous two
			sum = num1 + num2; // calculate the new sum
		}
		for(long y : evens) {
			total = total + y; // add all of the evens together
		}
		System.out.println(total); //ouputs the total
		System.out.println(evens);// checking my array
	}
}
