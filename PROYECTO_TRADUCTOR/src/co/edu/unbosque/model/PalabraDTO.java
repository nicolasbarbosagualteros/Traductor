package co.edu.unbosque.model;

public class PalabraDTO {

	
	private String palabra, definicion;

	public PalabraDTO(String palabra, String definicion) {
		super();
		this.palabra = palabra;
		this.definicion = definicion;
	}

	
	public PalabraDTO() {
		
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
		return "PalabraDTO [palabra=" + palabra + ", definicion=" + definicion + "]";
	}
	
	
	
	
}
