package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write_file {

	public static void main(String[] args) {
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt",true));
			w.write("\nHello");
			w.newLine();
			w.write("\nWelcome to JAva Learning sessions");
			w.close();
			System.out.println("write file successfully");
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}

	}

}
