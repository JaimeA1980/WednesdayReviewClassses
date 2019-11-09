package com.syntax.datatype;

public class ReverseArrayWithoutScanner {

	public static void main(String[] args) {
		//the last index of the array is one less than the length!!! VERY IMPORTANT
		
		// String[] animals= {"dog","cat","mouse","bird","donkey","horse"};
		String[] animals = { "dog", "cat", "bird" };

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println(
				"__________________________________REVERSE________________________________________________________________________________________________________________________");
		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.println(animals[i]);
			
			
		}

	}

}
