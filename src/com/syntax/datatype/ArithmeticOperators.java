package com.syntax.datatype;

public class ArithmeticOperators {// identifiers
	
	static int myNumber;
	static boolean myBoolean;
	static char myChar;
	static String myString;
	
public static void main(String[] args) {
	
	
	String name="John";
	// Here I am printing my name. <-ex
	System.out.println("My name is:\n John Smith"); // \n gives the next characters and puts then on the next line
	
	//String is a class present in java.lang package and it 
	// represents sequence of characters.
	
	//everything is executed in main method ie. public static void main
	
	
	System.out.println(myChar);//char default is  \u0000  , it does not execute or run, its the only one that does not do that
	System.out.println(myNumber);
	System.out.println(myBoolean);
	System.out.println(myString);
	
	//Automatic Operators are
	//Arithmetic ops
	//Assignment operators
	// +-/*%
	
	int firstNum=10;
	int secondNum=5;
	int sum=firstNum+secondNum;
	
	int firstDigit=2;
	int secondDigit=5;
	int resultOfMult=firstDigit*secondDigit;
	System.out.println(firstNum+secondNum);
	System.out.println(resultOfMult);
	
	int a=10;
	int b=3;
	//when you know that a number will not divide into another evenly , use the double variable command
	int result=a%b;
	System.out.println(result);
	
	
	
	
	
 }
}
