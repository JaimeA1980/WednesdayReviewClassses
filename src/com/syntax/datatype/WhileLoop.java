package com.syntax.datatype;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time = 8;
		if (time < 12) {// condition is true
		System.out.println("Good morning");// code executes 1
		}
		System.out.println("-------------------------");
		while (time < 12) {// while condition is true
		System.out.println("Good morning");
		time++;
		}
		//I want to print GA 5 times
		int i=-1;
		while(i<4) {
		System.out.println("Good afternoon");
		i++;
		}
		System.out.println("Outside of while loop");

System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
/*
* Create a boolean variable workDay and assign tru
e create
int variable day and
* assign it to 1 As long as it is workDay print
and
increase
* day. Once day is 6 print
*/
boolean workDay = true;
int day = 1;
while (workDay) {
if (day == 6 || day==7) {
workDay = false;
System.out.println("I do not need a day of anymore");
}else {
System.out.println("I need a day off");
}
day++;
}
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

Scanner scan = new Scanner(System.in);

int b = 1;

while(b<=3) {
	System.out.println("Please enter your name");
	String name=scan.nextLine();
	System.out.println("Hello "+name);
	b++;
}
System.out.println("__________________________________________________________________________________________________________________________________________________________________________");



	}

}
