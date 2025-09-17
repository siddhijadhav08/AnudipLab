1.Write a program to check whether a number is a Strong number or not.
 Strong number is a special number whose sum of factorial of digits is equal to the
 original number.
 For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 [Hint: conditional operator,method,use parameterized method to take input]
 Sample Input 1:
 145

Code:-
package strongnumber;

import java.util.Scanner;

public class StrongNumberChecker {

    // Method to calculate the factorial of a number
    public static long factorial(int n) {
        if (n < 0) {
            return -1; // Factorial is not defined for negative numbers
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        long sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Strong number: ");
        int inputNumber = scanner.nextInt();

        // Using a conditional operator (ternary operator)
        String result = isStrongNumber(inputNumber) ? "is a Strong number." : "is not a Strong number.";
        System.out.println(inputNumber + " " + result);

        scanner.close();
    }
}

Output:-
Enter a number to check if it's a Strong number: 0
0 is a Strong number.