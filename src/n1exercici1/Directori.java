package n1exercici1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Directori {
	String[] pathnames;

    // Creates a new File instance by converting the given pathname string
    // into an abstract pathname
    File f = new File("C:\\Adobe Photoshop CS6 Portable");{
    // Populates the array with names of files and directories
    pathnames = f.list();
    // For each pathname in the pathnames array
    for (String pathname : pathnames) {
    	String caracter = ".";
        // Print the names of files and directories
        //System.out.println(pathname);
        if (f.isDirectory()) {
        	System.out.println(f.listFiles().toString());
        	System.out.println(pathname+" Es un archivo");
        	
        }
        else {System.out.println(pathname+" Es una carpeta");}
    }
}
}
