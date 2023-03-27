package xyz;
/*Q 4 wap  that ask two numbers from user and print greater number among two */

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1 number");
		int num1 =input. nextInt();
		
		System.out.println("Enter 2 number");
		int num2 =input. nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1+ ">" +num2);
		}
		else
		{
			System.out.println(num2+ ">" +num1);
		}
	}

}
