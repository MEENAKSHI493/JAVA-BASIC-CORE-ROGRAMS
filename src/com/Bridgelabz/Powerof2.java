package com.Bridgelabz;
import java.util.Scanner;
public class Powerof2 {

public static void main(String [] args) {
	    
	Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter N: ");
	    int pow = scanner.nextInt();

	    if( pow <= 0 || pow <=31){

	      
	      for(int i=0; i<=pow ; i++){
	    	  System.out.println("Power of 2: "+(int)Math.pow(2,i));
	      }

	    }else{

	      System.out.println("Value overflows int value, try again!");

	    }
	  }

}
