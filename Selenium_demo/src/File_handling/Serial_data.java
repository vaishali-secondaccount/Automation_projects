package File_handling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Serial_data {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Minisha shah");
		try
		{
			FileWriter fw=new FileWriter("employee.txt");
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write(emp.toString());
			bf.newLine();
			bf.close();
			fw.close();
			System.out.println("Done");
		}
		catch(IOException e)
		{
			System.out.println("Failed");
			System.out.println(e);
		}

	}

}
