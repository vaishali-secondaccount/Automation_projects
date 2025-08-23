package File_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_data {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fos=new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA_Selinium\\Java_practice\\bin\\Basic_module\\FirstScript.class");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Student s1=(Student)oos.readObject();
		//oos.writeObject(s1);
		s1.display();
		oos.close();
		fos.close();
		System.out.println("DeSerialization done sucessfully");
	}

}
