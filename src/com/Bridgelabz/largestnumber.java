package com.Bridgelabz;
import java.util.Scanner; 
public class largestnumber {

	public static void main(String[] args) {
		int a, b, c;
	      System.out.println("Please enter three numbers: ");
	      Scanner scanner= new Scanner(System.in);
	      a = scanner.nextInt();
	      b = scanner.nextInt();
	      c = scanner.nextInt();
	      if(a >= b && a >= c)
	         System.out.println(a + " is the largest number.");
	      else if(b >= a && b >= c)
	         System.out.println(b + " is the largest number.");
	      else
	         System.out.println(c + " is the largest number.");
	      scanner.close();
	   }
}


		