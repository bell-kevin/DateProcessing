/** ****************************************************************************
 * Date.java
 * Kevin Bell
 *
 * This stores date values and prints the date in numeric and alphabetic form
 **************************************************************************** */
package dateprocessing;

public class Date {

    private String dateStr;
    int day, month; //instance variables
    String error = null; //instance variables
    static final String[] MONTHS = {"January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November",
        "December"}; // class constant
    static final int[] DAYSPERMONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
        31, 30, 31}; // class constant
//******************************************************************************

    public void printResults() {
        System.out.println("ending program now");
    } // end printResults method
//******************************************************************************

    public void Date(String dateStr) {
        int slashIndex;
        String currentStringToProcess = "";
        try {
            this.dateStr = dateStr;
            slashIndex = dateStr.indexOf('/');
            currentStringToProcess = dateStr.substring(0, slashIndex);
            month = Integer.parseInt(currentStringToProcess);
            currentStringToProcess = dateStr.substring(slashIndex + 1);
            day = Integer.parseInt(currentStringToProcess);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format - For input string: "
                    + "\"" + currentStringToProcess + "\"");
        } // end try/catch exception handling
    } // end Date constructor method
//******************************************************************************

    public void getError() {
    } // end getError method
//******************************************************************************
} // end Date class
