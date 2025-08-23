package Datatype_practice;

public class Student {
	String name="Neeva Sharma";
	int rollno=101;
	float per=89.08f;
	short age=20;
	long number=9876543210l;
	String course="Java Selenium";
	String collegename="JVM";
	String address="606 D,delhi";
	char div='A';

	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println("Name       ="+stud.name);
		System.out.println("Rollno     ="+stud.rollno);
		System.out.println("Percentage ="+stud.per);
		System.out.println("Age        ="+stud.age);
		System.out.println("Course     ="+stud.course);
		System.out.println("Collegename="+stud.collegename);
		System.out.println("Address    ="+stud.address);
		System.out.println("Division   ="+stud.div);

	}

}
