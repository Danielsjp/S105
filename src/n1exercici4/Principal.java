package n1exercici4;

import java.io.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		  // Passing the path to the file as a parameter
	     FileReader fr = new FileReader(
	         "C:\\Users\\sjpda\\Documents\\example.txt");

	     // Declaring loop variable
	     int i;
	     // Holds true till there is nothing to read
	     while ((i = fr.read()) != -1)

	         // Print all the content of a file
	         System.out.print((char)i);
	
	}

}


