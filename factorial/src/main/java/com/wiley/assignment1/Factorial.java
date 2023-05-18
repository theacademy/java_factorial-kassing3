package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		 
		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE
                
                
                
                //Captured input in try/catch in case User doesn't provide an interger
                try {
                    //Stores User's value in an instance variable `num`.  
                    num = scanner.nextInt();
                
                    //Conditional statement to check if number is in range.
                    if (num < 0 || num > 10) {
                    //if input is our of range, provide a eorr messing and return -1
                    this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
                    return -1;
                    
                    } else {
                       //if input is in range, return input value
                        return num;
                        
                    
                    }
                    
                } catch(Exception e) {
                    //if input is invalid and provides an error, an error message will be printed and -1 will be returned
                    this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
                    return -1;
                    
                }
                
                
		//YOUR CODE ENDS HERE
		 
			
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		  /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/
		 
		int result = 1;
		//YOUR CODE STARTS HERE
                
                // loop created to calucaltor the of factorial of the number provided by user
                for ( int factorial = 1; factorial <= num; factorial++) {
                    
                    result = result * factorial;
                    
                }
 

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive");
		fact.calculateFactorial();	
	 }

	
}
