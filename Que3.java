package xyz;

import java.util.Scanner;
import java.lang.String;



/*Q 3 WAP to ask name ,age and salary of an employee and print 
on console.*/

public class Que3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name =input.next();
		
		System.out.println("Enter your salary");
		int salary=input.nextInt();
		
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		System.out.println( name);
		System.out.println(salary);
		System.out.println(age);

	}

}
