package com.syntax.datatype;

public class ThirdJavaReviewTask4 {

	//Write a program to find the largest Number of three numbers
       //Print out  System.out.println("Largest number is " + largestNumber);
        // Must use if then a else if and lastly else 
	public static void main(String[] args) {
		
		int a,b,c;
		a=2;
	    b=3;
		c=5;
				
		if(a>b && a>c) {
			System.out.println("Largest number is "+a);
		}else if (b>c && b>a) {
			System.out.println("Largest number is "+b);
		}else {
			System.out.println("Largest number is "+c);
		}
	}

}
