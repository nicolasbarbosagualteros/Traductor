package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	private static Scanner sc;
	private static PrintWriter pw;
	private static File archivo;
	private static final String CONFIG_FOLDER_NAME = "config";

	
	public static void checkFolder() {

		
		archivo = new File(CONFIG_FOLDER_NAME);
		if(archivo.exists() && archivo.isDirectory()) {
			return;
		}else {
			archivo.mkdir();
		}
	}
	
	
	public static Properties loadProperties(String url) {

		Properties prop = null;

		prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_FOLDER_NAME + "/" + url));
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
			System.out.println(CONFIG_FOLDER_NAME + "/" + url);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Contenido incorrecto");
			System.out.println(CONFIG_FOLDER_NAME + "/" + url);
			e.printStackTrace();
		}

		return prop;
	}
	
}
