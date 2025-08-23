package File_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("sampleDemo1.txt");
		//Create file
		Files.createFile(path);
		System.out.println("File created");
		//Copy file
		Path copypath=Paths.get("Samplecopy.txt");
		Files.copy(path, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File Copied");
		 // Move file
//        Path movedPath = Paths.get("movedfile1.txt");
//        Files.move(copypath, movedPath, StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("File moved.");

        // Delete file
//        Files.deleteIfExists(path);
//        Files.deleteIfExists(movedPath);
//        System.out.println("Files deleted.");
		
		
		}

}
//Write a program to write data into a file using Files.write() and append 
//using StandardOpenOption.APPEND.


