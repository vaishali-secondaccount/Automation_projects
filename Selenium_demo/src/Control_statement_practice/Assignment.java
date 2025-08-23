package Control_statement_practice;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		//check if number is even or odd using if else(using Scanner class)
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number");
//		
//		int num=sc.nextInt();
//		if (num%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else
//			System.out.println("odd number");
		
		//Create registration form for user using scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Full name");
		String name=sc.nextLine();
		System.out.println("Enter mobile number");
		long number=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email Address");
		String email=sc.nextLine();
		System.out.println("Enter username");
		String username=sc.nextLine();
		System.out.println("Enter password");
		String password=sc.nextLine();
		System.out.println("confirm password");
		String conpass=sc.nextLine();
		
		System.out.println("Registration details are:..");
		System.out.println("Name                  ="+name);
		System.out.println("Mobile number         ="+number);
		System.out.println("Email                 ="+email);
		System.out.println("username              ="+username);
		System.out.println("password              ="+password);
		System.out.println("confirm password      ="+conpass);
		

	}

}
