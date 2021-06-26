package com.Bridgelabz;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		// Declare and initilize the numbers
		int dividend, divisor, quo, rem;
		Scanner scanner= new Scanner(System.in);
       
        System.out.print("Enter Dividend:");
        dividend = scanner.nextInt();
        
       
        System.out.print("Enter Divisor:");
        divisor = scanner.nextInt();
        
        scanner.close();
        quo = dividend / divisor;
        
        rem = dividend % divisor;
        
        
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);	
		
		
	


	}

}
