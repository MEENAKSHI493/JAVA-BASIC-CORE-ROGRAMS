package com.Bridgelabz;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
			System.out.println("Enter any 4 digit Year");
			Scanner sc= new Scanner(System.in);
		    double year = sc.nextDouble();
		   sc.close();
		    if(year>999 && year<9999)
		    {
		    boolean leap = false;
		    if (year % 4 == 0) {
		      if (year % 100 == 0) {
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;
		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
		  }
	}
}