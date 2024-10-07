package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionChecker {

	
	public static void verificarNombre(String nombre) throws InputNotValidException {
		Pattern p = Pattern.compile("/(?=.*?[#?!@$ %^&*-])/");
		Matcher m = p.matcher(nombre);
		if (m.find()) {
			throw new InputNotValidException();
		}
	}

	
}
