package File_handling;

import java.io.File;

public class fileDetails {
// access existing file and print file name ,location , length
	public static void main(String[] args) {
		File f=new File("sample.txt");
		if(f.exists())
		{
			System.out.println("File name:"+f.getName());// print filename
			System.out.println("File Location:"+f.getAbsolutePath());// file path
			System.out.println("File size:"+f.length());// print length of file
			System.out.println("File readable:"+f.canRead());
			System.out.println("File Writable:"+f.canWrite());
			
		}
		else
		{
			System.out.println("File not found");
		}

	}

}
