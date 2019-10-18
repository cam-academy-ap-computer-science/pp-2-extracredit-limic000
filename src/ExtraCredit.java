/*
 * make a constant
make a needle
	make a for loop for spaces
		spaces on either side = SIZE + 4
	make another loop for ||
		make one || for each line
make the repeated part
	outside of loop do one __/
	then in the loop make amount of lines * 3 worth of :
	outside of loop do ||
	then do the loop again
	outside of loop do \__
	make the dashed line
		make a line |
		then make a loop that does 3 * SIZE worth of "
		make a line |
make the bottom of th top
	outside of loop do \_
	then loop and print size*3 - 1 wort of /\
	outside of loop do _/
call the needle part again
then make the tower
	|%%||%%| for 4*size
call repeated part again

 */

public class ExtraCredit {
	public static final int SIZE = 4;
	public static void main(String[]args) {
		needle();
	}
	public static void needle() {
		for (int lines = 1; lines <= SIZE; lines++) {
			for (int space = 1; space <= 3*SIZE; space++) {
				System.out.print(" ");
			}	
			System.out.println("||");
		
		}
	}
}
