//Q1. Write Java Program to find maximum number using ternary operator.
import java.util.Scanner;


public class maximum {
    public static void main(String[] args) {
        
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        
        // Taking first number as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        // Taking second number as input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Using ternary operator to find maximum number
        int max = (num1 > num2) ? num1 : num2;
        
        // Display the result
        System.out.println("The maximum number is: " + max);
    }
}
/*
output
Enter first number: 15
Enter second number: 25
The maximum number is: 25

*/