
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sun.tools.javac.Main;

public class NoRepeats {

	public static void main(String[] args) {

        String string = "And I think to myself: what a wonderful world!";  
        
        // Converting string into char array.
        char str[] = string.toCharArray();
        int length = str.length;
        // Printing out the original string along with the no repart string.
        System.out.println(string);
        System.out.println(noDuplicate(str, length));
         
  	}
	
	// Making a method to remove the duplicates.
    static String noDuplicate(char str[], int length) {

        int index = 0;
        int j;
        boolean space = false;
 
        // Run through all the char sets.
        for (int i = 0; i < length; i++) {
 
            // This for loop will identify if a char has apperead before and match.
            for (j = 0; j < i; j++) {
            	
                if (str[i] == str[j]) {
                    break;
                }
            }
 
            // This then adds to the array if it has not been duplicated.
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
	
	
}

// References:
// https://www.javatpoint.com/java-string-tochararray : to understand toCharArray
// https://www.javatpoint.com/java-string-valueof#:~:text=The%20java%20string%20valueOf(),and%20char%20array%20to%20string. To understand valueOf
// https://www.geeksforgeeks.org/arrays-copyof-in-java-with-examples/#:~:text=copyOf()%20method%20is%20in,copy%20has%20the%20specified%20length. to understand copyOf.
