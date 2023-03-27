package xyz;

import java.util.Scanner;
import java.lang.String;

/*Q wap to demonstrate ternary operator .define a variable marks  .ask its value from 
user and using ternary operator check if marks > 40 store "Pass" in result varible else store "Fail"*/

public class Que1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Marks");
		
		int Marks=input.nextInt();
		String result=(Marks >= 40)? "Pass" : "Fail";
		System.out.println(result);
	}

}
