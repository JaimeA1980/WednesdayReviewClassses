package com.syntax.datatype;

public class ThirdJavaReviewHW {

	public static void main(String[] args) {
		
		//Task 1​
		//Write a program that will use a switch statement to display what month we're in.
		
		int calender =10;
		String month;
		
		switch (calender) {
		
		case 1:
			month=("January");
			break;
		case 2:
			month=("February");
			break;
		case 3:
			month=("March");
			break;
		case 4:
			month=("April");
			break;
		case 5:
			month=("May");
			break;
		case 6:
			month=("June");
			break;
		case 7:
			month=("July");
			break;
		case 8:
			month=("August");
			break;
		case 9:
			month=("September");
			break;
		case 10:
			month=("October");
			break;
		case 11:
			month=("November");
			break;
		case 12:
			month=("December");
			break;
		default:
			month=("unknown");
		break;			
		}
		System.out.println(month);

	}

}
