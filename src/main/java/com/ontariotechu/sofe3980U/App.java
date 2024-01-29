package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);

        System.out.println("Enter the second binary number:");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);

        // Perform the operations
        Binary sum = Binary.add(binary1, binary2);
        Binary orResult = Binary.or(binary1, binary2);
        Binary andResult = Binary.and(binary1, binary2);
        Binary multiplyResult = Binary.multiply(binary1, binary2);

        // Print the results
        System.out.println("First binary number is " + binary1.getValue());
        System.out.println("Second binary number is " + binary2.getValue());
        System.out.println("Their summation is " + sum.getValue());
        System.out.println("Their OR result is " + orResult.getValue());
        System.out.println("Their AND result is " + andResult.getValue());
        System.out.println("Their multiplication result is " + multiplyResult.getValue());

        scanner.close();
    }
}
