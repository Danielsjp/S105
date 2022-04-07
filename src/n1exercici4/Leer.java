package n1exercici4;

import java.io.*;

public class Leer {

	public void archivoPath () throws Exception {
		FileReader fr = new FileReader("C:\\Users\\sjpda\\Documents\\example.txt");
		int i;
		while ((i = fr.read()) != -1)

		System.out.println((char) i);
	}
}