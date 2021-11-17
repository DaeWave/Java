import java.util.Arrays;

public class IQ_Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hard coding the testResults array.
		int[] testResults = { 80, 110, 150, 109, 180 };
		// Creating a total for the total amount in the array.
		double total = 0;
		
		// Creating a for loop that will run through the array and then calculate the total.
		for(int i = 0; i < testResults.length; i++) {		
			total += testResults[i];
			
		}
	
		// The code below is the calculated average displayed.	
		double average = total / testResults.length;
		// This will display the average.
		System.out.format("The avarage is: %.3f", average);
		// This is just to create a line between the code so its easier to read.
		System.out.println();
		System.out.println();
		
		// This if and else statement will then go through the conditions based on the average score.
		if(average >= 130) {
			System.out.println("With a average of " + average + " they get a Very Superior score!");
			
		} else if(average >= 120) {
			System.out.println("With a average of " + average +  " they get a Superior score!");
			
		} else if(average >= 110) {
			System.out.println("With a average of " + average + " they get a High Average score!");
			
		} else if(average >= 90) {
			System.out.println("With a average of " + average + " they get a Average score!");
			
		} else if(average >= 80) {
			System.out.println("With a average of " + average + " they get a Low Average score!");
			
		} else if(average >= 70) {
			System.out.println("With a average of " + average + " they get a Borderline score!");
			
		} else if(average <= 69) {
			System.out.println("With a average of " + average + " they get a Extremely Low score!");
			
			}
	}

}

// Resources:
// https://www.youtube.com/watch?v=zHsXmZCtXtI : Caleb Curry, which showed how to run through the array.
// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html : to determine numeric print format.

// Done!