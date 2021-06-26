package com.Bridgelabz;

import java.util.Scanner;

public class Twoswapingnumbers {

	public static void main(String[] args) {
		int a, b, temp=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Value in a :");
		  a=sc.nextInt();
		  System.out.println("Enter Value in b :");
		  b=sc.nextInt();
		  sc.close();
		  temp=a;
		  a=b;
		  b=temp;
		  System.out.println("Values in a:" +a);
		  System.out.println("Values in b:" +b);
		 }
	
}