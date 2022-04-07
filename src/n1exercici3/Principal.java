package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;

//He puesto todo el codigo en el main para ahorrar tiempo ya que la clase directori no devuelve nada y he preferido ponerlo aqui.
public class Principal {

	public static void main(String[] args) throws IOException {

		try (Stream<Path> paths = Files.walk(Paths.get("C:\\Adobe Photoshop CS6 Portable"))) {
			for (Path ruta : paths.toList()) {

				File file = new File(ruta.toString());

				boolean exists = file.exists(); // Check if the file exists
				boolean isDirectory = file.isDirectory(); // Check if it's a directory
				boolean isFile = file.isFile(); // Check if it's a regular file
				long fecha = file.lastModified();
				Date date = new Date(fecha);
				File file2 = new File("C:\\Users\\sjpda\\Documents\\example.txt");
				if (!file2.exists()) {
					file2.createNewFile();
				}
				if (isDirectory) {
					System.out.println("D: " + ruta + " // Fecha Modificación: " + date);
					FileWriter fw = new FileWriter(file2.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("D: " + ruta + " // Fecha Modificación: " + date);
					bw.close();
				} else {
					System.out.println("F: " + ruta + " // Fecha Modificación: " + date);
					FileWriter fw = new FileWriter(file2.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("F: " + ruta + " // Fecha Modificación: " + date);
					bw.close();
				}
			}

			// paths.filter(Files::isRegularFile).forEach(System.out::println);
		}
	}
}
