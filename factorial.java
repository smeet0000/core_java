//Q2. Write a Java program to calculate factorial of given number. eg.3!=3*2*1=6
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        
        // Variable to store factorial result, initialized to 1
        int factorial = 1;
        
        // Check if the entered number is negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            
            // Loop to calculate factorial using multiplication
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            
            // Display the result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
/*
output
Enter a number to find its factorial: 5
Factorial of 5 is: 120

*/
