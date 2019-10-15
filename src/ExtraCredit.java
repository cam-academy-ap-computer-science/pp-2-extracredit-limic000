/*
 * make a constant
make a needle
	make a for loop for spaces
		spaces on either side = SIZE + 4
	make another loop for ||
		make one || for each line
make the top part of the top
	outside of loop do one __/
	then in the loop make amount of lines * 3 worth of :
	outside of loop do ||
	then do the loop again
	outside of loop do \__
	make the dashed line
		make a line |
		then make a loop that does 3 * SIZE worth of "
		make a line |


 */

public class ExtraCredit {
	public static final int SIZE = 4;
	public static void main(String[]args) {
		
	}
	public static void needle() {
		for (int i = 1; i < SIZE; i++) {
			System.out.println("||");
		}
	}
}
