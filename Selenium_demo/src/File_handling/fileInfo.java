package File_handling;

import java.io.File;

public class fileInfo {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\dell\\Desktop\\Testfile.docx");
		if(f.exists()){
			System.out.println("NAme of File:"+f.getName());
			System.out.println("File Location:"+f.getAbsolutePath());
			System.out.println("File readable:"+f.canRead());
			System.out.println("File Writable:"+f.canWrite());
			System.out.println("File length:"+f.length());
			System.out.println("Delete file:"+f.delete());
			
			
		}
		else
		{
			System.out.println("File not found");
		}

	}

}
