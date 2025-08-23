package Control_statement_practice;

public class Nested_if_stmt {

	public static void main(String[] args) {
//		float per=96;
//		if(per>=75 && per <=100)
//		{
//			System.out.println("Dist");
//			if(per>=85 )
//			{
//				System.out.println("A+");
//				if(per>=95)
//				{
//					System.out.println("A++");
//				}
//			}
//		}
//		else if(per>=60 && per<75)
//		{
//			System.out.println("First class");
//		}
//		else if(per>=50 && per<60)
//		{
//			System.out.println("Second class");
//		}
//		else if(per>=40 && per<50)
//		{
//			System.out.println("Pass class");
//		}
//		else if(per>=0 && per<40)
//		{
//			System.out.println("Fail");
//		}
//		else
//		{
//			System.out.println("Invalid input");
//		}
		
		boolean isreg=true;
		boolean hashallticket=false;
		if(isreg)
		{
			if(hashallticket)
			{
				System.out.println("You can write your exam");
			}
			else
			{
				System.out.println("You need a hall ticket");
			}
		}
		else
		{
			System.out.println("You are not registered");
		}

	}

}

/*1.check if a user can log in
 * first check if Username is correct
 * then check if password is correct 
 * 
 * 2. write a program for loan approval
 * first check if salary>25000
 * then check if credit score >=700
 * 
 * 3. write a program for driving license eligibility
 * age must be greater than equal to 18
 * must have passed the driving test*/
