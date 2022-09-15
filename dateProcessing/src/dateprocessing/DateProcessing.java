/** ****************************************************************************
 * DateProcessing.java
 * Kevin Bell
 *
 * This driver program changes number months to letter/name months
 **************************************************************************** */
package dateprocessing;

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

            } // end if/else condition
        } while (!userInput.equalsIgnoreCase("q")); // end while loop
    } // end main method  
} // end DateProcessing class
