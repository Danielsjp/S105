package n1exercici1;
import java.io.File;

public class Principal {

	public static void main(String[] args) {
		String[] pathnames;
	    File f = new File(args[0]);{
	    pathnames = f.list();
	    for (String pathname : pathnames) {
	        	System.out.println(pathname);
	}
}}}
