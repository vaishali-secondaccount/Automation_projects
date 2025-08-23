package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_use {

	public static void main(String[] args) {
		try {
			PrintWriter w=new PrintWriter(new FileWriter("sample.txt"));
			w.println("Hello,\nWelcome to JAva Learning sessions");
			
			w.println("Enjoy");
			w.close();
			System.out.println("write file successfully");
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}

	}

}
