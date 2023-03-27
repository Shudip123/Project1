package xyz;

/*Q 2 using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" else store negative number
to Result variable*/

import java.util.Scanner;
import java.lang.String;


public class Que2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println ("Enter Your number");
		int number=input.nextInt();
		
		String result=(number > 0)? "Positive" : "Negative";
		System.out.println(result);
		
			
		
	}

}
