package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainPanel extends JPanel {

	private JButton btnSpanish, btnEnglish, btnItalian, btnFrench, btnPortuguesse, btnLatin, btnSalir;
	private JTextArea txtInput, txtPalabra, txtDefinicion;

	public MainPanel() {

		setLayout(null);
		setBackground(new Color(248, 243, 239));
		setPreferredSize(new Dimension(800, 600));

		JLabel lblInput = new JLabel("Palabra que desea traducir:");
		lblInput.setBounds(40, 20, 200, 30);
		add(lblInput);

		txtInput = new JTextArea();
		txtInput.setBounds(40, 50, 300, 50);
		add(txtInput);

		JLabel lblPalabra = new JLabel("Traducción:");
		lblPalabra.setBounds(40, 140, 200, 30);
		add(lblPalabra);

		txtPalabra = new JTextArea();
		txtPalabra.setBounds(40, 170, 300, 50);
		txtPalabra.setEditable(false);
		add(txtPalabra);

		JLabel lblDefinicion = new JLabel("Definición:");
		lblDefinicion.setBounds(40, 220, 200, 30);
		add(lblDefinicion);

		txtDefinicion = new JTextArea();
		txtDefinicion.setBounds(40, 250, 300, 100);
		txtDefinicion.setEditable(false);
		txtDefinicion.setLineWrap(true); 
        txtDefinicion.setWrapStyleWord(true); 
		
	
	        
	        add(txtDefinicion);
	      
	        
		JLabel lblIdioma = new JLabel("Idioma al que desea traducir:");
		lblIdioma.setBounds(600, 20, 200, 30);
		add(lblIdioma);
		
		
		btnSpanish = new JButton("Español");
		btnSpanish.setBounds(600, 50, 100, 100);
		add(btnSpanish);
		
		btnEnglish = new JButton("English");
		btnEnglish.setBounds(700, 50, 100, 100);
		add(btnEnglish);
		
		btnItalian = new JButton("Italiano");
		btnItalian.setBounds(600, 150, 100, 100);
		add(btnItalian);
		
		btnFrench = new JButton("Français");
		btnFrench.setBounds(700, 150, 100, 100);
		add(btnFrench);
		
		btnPortuguesse = new JButton("Português");
		btnPortuguesse.setBounds(600, 250, 100, 100);
		add(btnPortuguesse);
		
		btnLatin = new JButton("Latinus");
		btnLatin.setBounds(700, 250, 100, 100);
		add(btnLatin);
		
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(760, 420, 130, 50);
		add(btnSalir);

	}

	public JButton getBtnSpanish() {
		return btnSpanish;
	}

	public void setBtnSpanish(JButton btnSpanish) {
		this.btnSpanish = btnSpanish;
	}

	public JButton getBtnEnglish() {
		return btnEnglish;
	}

	public void setBtnEnglish(JButton btnEnglish) {
		this.btnEnglish = btnEnglish;
	}

	public JButton getBtnItalian() {
		return btnItalian;
	}

	public void setBtnItalian(JButton btnItalian) {
		this.btnItalian = btnItalian;
	}

	public JButton getBtnFrench() {
		return btnFrench;
	}

	public void setBtnFrench(JButton btnFrench) {
		this.btnFrench = btnFrench;
	}

	public JButton getBtnPortuguesse() {
		return btnPortuguesse;
	}

	public void setBtnPortuguesse(JButton btnPortuguesse) {
		this.btnPortuguesse = btnPortuguesse;
	}

	public JButton getBtnLatin() {
		return btnLatin;
	}

	public void setBtnLatin(JButton btnLatin) {
		this.btnLatin = btnLatin;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTextArea getTxtInput() {
		return txtInput;
	}

	public void setTxtInput(JTextArea txtInput) {
		this.txtInput = txtInput;
	}

	public JTextArea getTxtPalabra() {
		return txtPalabra;
	}

	public void setTxtPalabra(JTextArea txtPalabra) {
		this.txtPalabra = txtPalabra;
	}

	public JTextArea getTxtDefinicion() {
		return txtDefinicion;
	}

	public void setTxtDefinicion(JTextArea txtDefinicion) {
		this.txtDefinicion = txtDefinicion;
	}
	
	

}
