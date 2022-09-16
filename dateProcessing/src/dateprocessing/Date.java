/** ****************************************************************************
 * Date.java
 * Kevin Bell
 *
 * This stores date values and prints the date in numeric and alphabetic form
 **************************************************************************** */
package dateprocessing;

public class Date {

    private String dateStr; // do not delete this variable
    int day, month; //instance variables
    String error = null; //instance variables
    static final String[] MONTHS = {"", "January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November",
        "December"}; // class constant
    static final int[] DAYSPERMONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
        31, 30, 31}; // class constant
//******************************************************************************

    public void printResults() {
        System.out.println("Date " + month + "/" + day + " is "
                + MONTHS[month] + " " + day);
    } // end printResults method
//******************************************************************************

    public Date(String dateStr) {
        int slashIndex;
        String currentStringToProcess = "";
        try {
            this.dateStr = dateStr;
            slashIndex = dateStr.indexOf('/');
            currentStringToProcess = dateStr.substring(0, slashIndex);
            month = Integer.parseInt(currentStringToProcess);
            currentStringToProcess = dateStr.substring(slashIndex + 1);
            day = Integer.parseInt(currentStringToProcess);
            if (month > 12 || month < 1) {
                error = ("Invalid month " + month + " for day " + day
                        + ", try again");
            } else if (day > DAYSPERMONTH[month] || day < 1) {
                error = ("Invalid day " + day + " for month " + month
                        + ", try again");
            }// end if/else if conditions
        } catch (NumberFormatException e) {
            System.out.println("Invalid format - For input string: "
                    + "\"" + currentStringToProcess + "\"");
        } // end try/catch exception handling
    } // end Date constructor
//******************************************************************************

    public String getError() {
        return error;
    } // end getError method
//******************************************************************************
} // end Date class
