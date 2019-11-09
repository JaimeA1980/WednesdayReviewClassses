package com.syntax.datatype;

import java.util.Scanner;

public class DoWhileReviewClass {

	public static void main(String[] args) {

		int num = 10;
		while (num <= 7) {
			System.out.println("Hello");
			num++;
		}
		// rare
		int num1 = 10;
		do {
			System.out.println("Bye");
			num1++;
		} while (num1 <= 7);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		// print even numbers from 20 to 50 using do while
		// 1 way
		int even = 20;
		do {
			System.out.println(even);
			even += 2;
		} while (even <= 50);
		System.out.println("-------------Second way---------");
		// 2 way
		int even1 = 20;
		do {
			if (even1 % 2 == 0) {
				System.out.println(even1);
			}
			even1++;
		} while (even1 <= 50);
System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
		int i = 1;
		do {
			System.out.println(i);
			i+=2;
		}while (i<=15);
		System.out.println("__________________________________________________________________________________________________________________________________________________________________");
		
		 //   Task Two
		  //  *keep asking user to pay for candy until entered price is not equal to 3
		   //  *after user got a write amount print "Please enjoy your candy"*/
		Scanner scan=new Scanner (System.in);
		int cash;
		do {
			System.out.println("Please insert cash");
			cash=scan.nextInt();
			
			}
		while (cash!=3);
			System.out.println("Enjoy your candy");		
	}

}
