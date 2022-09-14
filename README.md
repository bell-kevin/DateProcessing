# DateProcessing

Create a class named Date that stores date values and prints the date in numeric and alphabetic form. The user will enter a date in MM/DD form; the project will perform validation on the input, and if there are no errors, will print the date in alphabetic form. The errors include parsing problems trying to convert the values to integers and invalid values for month (must be 1 through 12) and day (must be appropriate for the month, so day 31 is not valid in month 2, for example).

Date class notes:

1. Use 2 integer instance variables, day and month, and one String instance variable, error, initialized with null.

2. Create a class constant String array for the names of the months, and a class constant int array for the number of days in each month. Use this data to validate that the day in the date is legal for the month in the date.

3. Use a 1-parameter Date constructor that receives a dateStr String parameter. The constructor is responsible for the error checking; if there are any errors, the error variable will have a value explaining the error.

4. Search for the slash in the dateStr parameter in the constructor; if not found, specify that in the error variable. If it is found, use substring() to separate the month and day from the string.

5. In the constructor, use a try-catch block to parse the month and day strings into the month and day integers. If an exception is thrown, specify that in the error variable.

6. In the constructor, check if the month number is valid, and check if the day is legal for that month. If either is incorrect, specify that in the error variable.

7. Create a method printResults(), which prints the date in numeric format with 2 digits for month and for day (use the zero-pad flag in a printf method call) and then prints that date in alphabetic form with the name of the month.

8. Create a method getError() which returns the value in the error variable.

Driver class notes:

1. In a loop, ask the user to enter a date or “q” to quit.

2. Call the constructor for the date entered – the constructor will perform all the error checking.

3. If the error variable is null, then print the date in numeric and alphabetic form (the printResults() method). If it is not null, then print out the error.

Run the program as outlined in the sample session, with errors, and take a screenshot. Run it again with 5 valid dates and take a screenshot of the results.

Submission:the specified screenshots and the root folder for the project

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
