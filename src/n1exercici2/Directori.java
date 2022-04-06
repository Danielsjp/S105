package n1exercici2;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;

public class Directori {

    public static void main(String[] args) throws IOException {
    	
        try (Stream<Path> paths = Files.walk(Paths.get("C:\\Adobe Photoshop CS6 Portable"))) {
        	for (Path ruta : paths.toList()) { 
        		
        		File file = new File(ruta.toString());

            	boolean exists =      file.exists();      // Check if the file exists
            	boolean isDirectory = file.isDirectory(); // Check if it's a directory
            	boolean isFile =      file.isFile();      // Check if it's a regular file
            	long fecha = file.lastModified();
            	Date date = new Date(fecha);
            	if (isDirectory) {System.out.println("D: "+ ruta+" // Fecha Modificación: "+date);}
            	else {System.out.println("F: "+ ruta+ " // Fecha Modificación: "+date);}
        		}
        	
            //paths.filter(Files::isRegularFile).forEach(System.out::println); 
        }
    }
}