package Control_statement_practice;

public class if_else_if_stmt {

	public static void main(String[] args) {
		float per=1000f;
		if(per>=75 && per <=100)
		{
			System.out.println("Dist");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First class");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Second class");
		}
		else if(per>=40 && per<50)
		{
			System.out.println("Pass class");
		}
		else if(per>=0 && per<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid input");
		}
		

	}

}
/*write a program to check temperature and display message like
 * 40c --> "Very hot-- >=40
 * 30-40c-->HOt >=30 and <40
 * 20-29c-->warm
 * 10-19c-->Cool
 * <10c-->very cool
 * 
 * write a program to calculate bill category based on units used
 * units<100-->"Low usage"
 * 100-299-->"Medium usage"
 * 300-499-->"High usage"
 * 500+-->"Very high usage"
 * 
 * Write a program to display a message based on signal color
Red=🡪stop
Yellow🡪Ready
Green 🡪GO
Any other🡪”Invalid color ”*/



