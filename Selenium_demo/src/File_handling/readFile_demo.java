package File_handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile_demo {

	public static void main(String[] args) throws IOException {
		List<String> lines=new ArrayList<String>();
		FileInputStream r=new FileInputStream("C:\\Users\\dell\\Desktop\\Hellodoc.docx");
       int line;
      while((line=r.read())!=-1)
       {
    	 System.out.println((char)line);
    	   
       }
      
      for(String l:lines)
      {
    	  System.out.println(l);
      }
      r.close();
	}

}
