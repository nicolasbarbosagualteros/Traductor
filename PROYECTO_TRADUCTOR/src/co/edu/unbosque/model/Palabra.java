package co.edu.unbosque.model;

public class Palabra {

	private String palabra, definicion;

	public Palabra(String palabra, String definicion) {
		super();
		this.palabra = palabra;
		this.definicion = definicion;
	}
	
	
	public Palabra() {
		
		
	}


	public String getPalabra() {
		return palabra;
	}


	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}


	public String getDefinicion() {
		return definicion;
	}


	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}


	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + ", definicion=" + definicion + "]";
	}
	
}
