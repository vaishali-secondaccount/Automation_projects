package BAsics_of_oops;
class SoftwareTesting
{
	void Syllabus()
	{
		System.out.println("Software testing course details");
		System.out.println("Syllabus=Manual testing,Core Java ,Selenium Webdriver,Jira(PRoject Management),Mysql(Database)");
		System.out.println("Fees 50000");
	}
	
}
class Manual extends SoftwareTesting
{
	void manual_testing()
	{
	super.Syllabus();
	System.out.println("If it is manual testing only \nthen it includes Manual testing concepts ,jira, mysql, postman and the fees is 30000");
}
}
class Automation extends SoftwareTesting
{
	void automation_testing()
	{
		super.Syllabus();
		System.out.println("If it is Automation testing only \nthen it includes Core java, selenium webdriver,jira, mysql, postman and the fees is 30000");
	
	}
}

public class JAva_selenium {

	public static void main(String[] args) {
		System.out.println("*********MAnual testing course details******");
		Manual mn=new Manual();
		mn.manual_testing();
		System.out.println("*********Automation testing course details******");
		Automation auto=new Automation();
		auto.automation_testing();

	}

}
