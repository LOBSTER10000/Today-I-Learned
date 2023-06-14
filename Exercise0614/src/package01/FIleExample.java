package package01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FIleExample {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\lee\\Desktop\\Today-I-Learned\\");
		try {
			Stream<Path> stream = Files.list(path);
			stream.forEach(p->System.out.println(p.getFileName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
