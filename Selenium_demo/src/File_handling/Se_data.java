package File_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Se_data {

	public static void main(String[] args) throws IOException {
		
		Student s1=new Student(101,"Neeva Sharma");
		FileOutputStream fos=new FileOutputStream("student.class");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(s1);
		oos.close();
		fos.close();
		System.out.println("Serialization done sucessfully");
	}

}
