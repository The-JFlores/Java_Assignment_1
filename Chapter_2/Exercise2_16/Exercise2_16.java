
// Exercise2_16.java
// Compare two integers and display the larger one or if they are equal.

import java.util.Scanner; // program uses class Scanner

public class Exercise2_16 {
    public static void main(String[] args) {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt for first number
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt for second number
        int number2 = input.nextInt(); // read second number from user

        // compare the two numbers
        if (number1 > number2) {
            System.out.printf("%d is larger%n", number1);
        } else if (number2 > number1) {
            System.out.printf("%d is larger%n", number2);
        } else {
            System.out.println("These numbers are equal");
        }
    } // end method main
} // end class Exercise2_16