package BAsics_of_oops;
class School
{
	School()
	{
		System.out.println("One perticular format for uniform");
		System.out.println("Follow patterns like CBSC, ICSC ,a nd State board");
		System.out.println("Follow timing  between 7 to 5");
	}
}
class SNBP extends School
{
	SNBP()
	{
	super();
	System.out.println(" 70% study  and 30% Sports orinted school");
	}
}

public class School_demo {

	public static void main(String[] args) {
		
		SNBP snbp=new SNBP();
	}

}
