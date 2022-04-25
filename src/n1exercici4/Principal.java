package n1exercici4;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
 // no he podido hacer la llamada a la clase leer desde aqui, he puesto el codigo en el main.
// no he sabido devolver por el return toda la linea de texto. me devolvia caracter por caracter. asi funciona.
	public static void main(String[] args) throws Exception {
		String ruta = args[0];
		FileReader fr = new FileReader(ruta);
		int i;
		while ((i = fr.read()) != -1)
			//System.out.print(i);
			System.out.print((char) i);
			

//Leer hola = new Leer();
//hola.archivoPath();;

	}

}
