2.Write a program to check leap year using if else. How to check whether a given year
 is a leap year or not.
 [Hint:Take an input of any number. Store it in some variable say year.
 If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year. Or if a
 year is exactly divisible by 400 then it is a leap year.]
 Sample Input 1:
 2004

Code:-
package leapyear;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check for a leap year using the if-else condition
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year. 🥳");
        } else {
            System.out.println(year + " is not a leap year. 😔");
        }

        // Close the scanner
        scanner.close();
    }
}

Output:-
Enter a year: 2004
2004 is a leap year.
