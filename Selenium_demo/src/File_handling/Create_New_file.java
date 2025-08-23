package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create_New_file {

	public static void main(String[] args) {
		//Create new file
//		File f=new File("sample.txt");
//		try
//		{
//			f.createNewFile();
//			System.out.println(f.setWritable(true));
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("File not found");
//			System.out.println(e);
//		}
		
		//Write file
		try {
			FileWriter filewrite=new FileWriter("sample.txt");
			filewrite.write("This is our first java io file");
			filewrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
