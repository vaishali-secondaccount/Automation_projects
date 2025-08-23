package This_keyword;
// To refer to the current class instance variables
public class Student {
	int rollno,age;
	String name, collegename, address;
	float per;
	void details(int rollno, String name, float per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		System.out.println("rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("per="+per);
	}
	void details(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("rollno="+rollno);
		System.out.println("Name="+name);
	}
	

	public static void main(String[] args) {
		Student s=new Student();
		s.details(101, "Minal", 89.90f);
		s.details(102, "Raghav");

	}

}
