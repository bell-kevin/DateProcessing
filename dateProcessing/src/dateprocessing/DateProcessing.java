/** ****************************************************************************
 * DateProcessing.java
 * Kevin Bell
 *
 * This driver program changes number months to letter/name months
 **************************************************************************** */
package dateprocessing;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Locale; // Import the Locale class
import java.util.Scanner; // Import the Scanner class

public class DateProcessing {

    public static void main(String[] args) {
        System.out.println("Ch 15 Date Processing Project by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        String userInput;
        double x = 0;
        do {
            System.out.print("Enter a date in format mm/dd (\"q\" to quit): ");
            userInput = computerKeyboardInput.nextLine();
            if ("q".equalsIgnoreCase(userInput)) {
                break;
            } else {
                // string
                String myString = userInput;
                // Create a date object
                LocalDateTime myObject = LocalDateTime.parse(myString);
                DateTimeFormatter myFormatObj
                        = DateTimeFormatter.ofPattern("MMMM dd", Locale.US);
                String formattedDate = myObject.format(myFormatObj);
                System.out.println("Date is " + formattedDate);
            } // end if/else condition
        } while (!userInput.equalsIgnoreCase("q")); // end while loop
    } // end main method  
} // end DateProcessing class
