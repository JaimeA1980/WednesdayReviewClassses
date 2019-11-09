package com.syntax.datatype;

public class BreakAndContinue {
	public static void main(String[] args) {

		// Task 0ne Print numbers from 10 to 1

		// Task Two Write a program from 40 to 10 and only print the even numbers

		// Task Three Write a program from 50 to 25 and only print the odd numbers

		// Task Four Write a program from 0 to 100 and break the loop once the value
		// reaches 45

		// Task Five Write a program 1 to 10 and if the value is 10

		System.out.println(
				"______________________________________1______________________________________________________");

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println(
				"_________________________________________________2______________________________________________________");
		for (int a = 40; a >= 10; a -= 2) {
			System.out.print(a + " ");
		}
		System.out.println(
				"_________________________________________________3______________________________________________________");
		for (int b = 50; b >= 25; b--) {
			if (b % 2 == 0) {
				continue;
			}
			System.out.print(b + " ");

		}
		System.out.println(
				"__________________________________________4_____________________________________________________________");

		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
			if (i == 45) {
				break;
			}
		}
		System.out.println("______________________________5______________________________________________________________");
		
		for (int n = 0; n <= 11; n++) {
			if (n == 10) {
				continue;
			}
System.out.print(n+" ");
		}

	}

}
