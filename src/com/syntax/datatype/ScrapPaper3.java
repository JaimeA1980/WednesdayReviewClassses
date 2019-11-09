package com.syntax.datatype;

import java.util.Scanner;

public class ScrapPaper3 {
	public static void main(String[] args) {
//		Create an int array with the size of 5 and input values with Scanner. 
//		Create a loop and enter values into one loop (don't print prompt question for Scanner). 
//		Create the second loop to print the values and it must be multiplied by 10.
//		Print out each element of the array multiplied by ten, one element per line.

		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];

		for (int row = 0; row < array.length; row++) {
			array[row] = scan.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] * 10);
		}
	}

}
