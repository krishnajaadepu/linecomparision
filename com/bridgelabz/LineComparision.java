package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparision Computation");
//		line 1
	    int x1,x2,y1,y2;
	    double length_of_Line1;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the value of x1 :");
	    x1 = sc.nextInt();
	    System.out.println("Enter the value of y1 :");
	    y1 = sc.nextInt();
	    System.out.println("Enter the value of x2 :");
	    x2 = sc.nextInt();
	    System.out.println("Enter the value of y2 :");
	    y2 = sc.nextInt();

	    length_of_Line1 =  Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	    System.out.println("The length of a line = " +length_of_Line1);
	//   line 2
	 
	    double x3,x4,y3,y4;
	    double length_of_Line2;
	  
	    System.out.println("Enter the value of x3 :");
	    x3 = sc.nextInt();
	    System.out.println("Enter the value of y3 :");
	    y3 = sc.nextInt();
	    System.out.println("Enter the value of x4 :");
	    x4 = sc.nextInt();
	    System.out.println("Enter the value of y4 :");
	    y4 = sc.nextInt();
	    length_of_Line2 = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));


	    System.out.println("Length of line two = " +length_of_Line2);

	    if(length_of_Line1==length_of_Line2)
	        System.out.println("Length of the lines are equal");
	    else
	        System.out.println("Lengths are not equal ");
//	    comparision of line
	    if(length_of_Line1 > length_of_Line2){
	        System.out.println("Length of line1 is greater then from line2");
	    }
	    else if(length_of_Line2 > length_of_Line1) {
	        System.out.println("Lengths of line1 is lesser then from line2 ");
	    }
	    else {
	        System.out.println("Length of lines are equal");
	    }
	}
	
	}


