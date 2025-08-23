package File_handling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_demo {

	public static void main(String[] args) {
		Path path=Paths.get("sample12.txt");
		System.out.println("Name of file:"+path.getFileName());
		System.out.println("Absolute Path:"+path.toAbsolutePath());
		System.out.println("Parent directory:"+path.getParent());
		System.out.println("Path(current):"+Files.exists(path));

	}

}
