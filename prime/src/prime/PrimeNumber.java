package prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This Scanner will allow for the user to input a integer. 
		Scanner scan = new Scanner( System.in );
		System.out.print("Enter a number: ");
		int inputNum = scan.nextInt();
		
		//This if and else statement will then be under the condition of a boolean and send weather the command is a prime or not.
		if( isPrime( inputNum ) ) {
		System.out.println( inputNum + " is a prime number." );
		} else {
		System.out.println( inputNum + " is not a prime number." );
		}
		
	}
		// Creating a static boolean to calculate if the input number from the user is a prime or not.
		// This is also to create a if and else statement as to the fact that input number cannot be less than 1.
		public static boolean isPrime( int inputNum ) {
			// A if statement for if the input number is less than 1, as 1 and 0 are not prime numbers.
			if ( inputNum <= 1 ) {
				return false;
			}
			
			// Creating a for loop will run through the users input number and calculate weather it is a prime number or not.
			// The Math.sqrt can also be replaced with inputNum / 2 as this is need to see if it can divide by itself.
			// The modulus (%) is the to show that it can not divide itself by 0.
			for ( int i = 2; i < Math.sqrt( inputNum ); i++ ) {
				if ( inputNum % i == 0 ) {
					return false;
				}
			}
			
			return true;
		}
}

// Resources:
// https://www.youtube.com/watch?v=sizFeSlGMt4&t=357s : Mike Dane youtube video to help get the user input. 
// https://www.youtube.com/watch?v=CHVVEGRGiJU  : Alex Lee, to help understand booleans.
// https://www.youtube.com/watch?v=Hk9n0cWE2OI  : Alex Lee, to help give the idea on how to go about writing the programme.