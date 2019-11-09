package com.syntax.datatype;

public class ScrapPaper4 {
	public static void main(String[] args) {
		
//		For you to do: 
//			Write a program that creates an array of integers that stores the following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
//			Print the values using a for loop starting at index 1 and increment by 3, and then print value divided by its index.
//
//			Output:
//			78 13 11 
		
		int[] array= {45,78,12,67,55,89,23,77,88};
		for (int i=1; i<array.length; i+=3) {
			System.out.println(array[i]/i);
		}
		
	}

}
