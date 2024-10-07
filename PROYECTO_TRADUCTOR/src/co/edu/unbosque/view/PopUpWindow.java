package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class PopUpWindow {

	
	private JOptionPane noPalabra;
	
	
	public void palabraNoEncontrada() {
		noPalabra.showMessageDialog(null, "Palabra no encontrada");
	}
	
}
