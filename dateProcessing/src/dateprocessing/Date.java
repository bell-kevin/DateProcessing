/** ****************************************************************************
 * Date.java
 * Kevin Bell
 *
 * This stores date values and prints the date in numeric and alphabetic form
 **************************************************************************** */
package dateprocessing;

public class Date {

    int day, month; //instance variables
    String error = null; //instance variables
    static final String[] MONTHS = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November",
        "December"}; // class constant
    static final int[] DAYSPERMONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
        31, 30, 31}; // class constant
//******************************************************************************

    public Date(String dateStr) {
        int slashIndex;
        try {

        } catch (NumberFormatException e) {
            System.out.println("Invalid format - For input string: ");
        } // end try/catch exception handling
    } // end Constructor method
//******************************************************************************

    public void printResults() {

    } // end printResults method
//******************************************************************************

    public String getError() {
        return error;
    } // end getError method

    public String substring() {
        return "hello";
    }
} // end Date class
