package File_handling;

import java.io.Serializable;

public class Student implements Serializable {
	int rollno;
	String name;
	Student(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void display()
	{
		System.out.println("Rollno="+rollno+"   "+"NAme="+name);
		
	}

}
