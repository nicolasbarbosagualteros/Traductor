package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {

	private ModelFacade mf;
	private ViewFacade vf;
	private Properties propSpanish, propEnglish, propFrench, propItalian, propLatin, propPortuguesse;

	public Controller() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		// propiedades

		propSpanish = FileHandler.loadProperties("spanish.properties");
		propEnglish = FileHandler.loadProperties("english.properties");
		propFrench = FileHandler.loadProperties("french.properties");
		propItalian = FileHandler.loadProperties("italian.properties");
		propLatin = FileHandler.loadProperties("latin.properties");
		propPortuguesse = FileHandler.loadProperties("portuguesse.properties");

		vf.getWindow().getMainPanel().getBtnEnglish().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnSpanish().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnFrench().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnItalian().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnLatin().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnPortuguesse().addActionListener(this);
		vf.getWindow().getMainPanel().getBtnSalir().addActionListener(this);

	}

	public static boolean existeEnProp(String key, Properties properties) {
		return properties.containsKey(key);
	}

	public void buscarPalabraEnglish() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada;

		 if (existeEnProp(propiedad, propEnglish)) {
			vf.getWindow().getMainPanel().getTxtPalabra().setText(propEnglish.getProperty(propiedad));
		 }else {
			 vf.getWindow().getPopUpWindow().palabraNoEncontrada();
		 }
		 
	}

	
	public void buscarPalabraSpanish() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada;

		 if (existeEnProp(propiedad, propSpanish)) {
			vf.getWindow().getMainPanel().getTxtPalabra().setText(propSpanish.getProperty(propiedad));
		 }else {
			 vf.getWindow().getPopUpWindow().palabraNoEncontrada();
		 }
		 
	}
	
	public void buscarPalabraFrench() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada;

		 if (existeEnProp(propiedad, propFrench)) {
			vf.getWindow().getMainPanel().getTxtPalabra().setText(propFrench.getProperty(propiedad));
		 }else {
			 vf.getWindow().getPopUpWindow().palabraNoEncontrada();
		 }
		 
	}
	
	public void buscarPalabraItalian() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada;

		 if (existeEnProp(propiedad, propItalian)) {
			vf.getWindow().getMainPanel().getTxtPalabra().setText(propItalian.getProperty(propiedad));
		 }else {
			 vf.getWindow().getPopUpWindow().palabraNoEncontrada();
		 }
		 
	}
	public void buscarPalabraPortuguesse() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada;

		 if (existeEnProp(propiedad, propPortuguesse)) {
			vf.getWindow().getMainPanel().getTxtPalabra().setText(propPortuguesse.getProperty(propiedad));
		 }else {
			 vf.getWindow().getPopUpWindow().palabraNoEncontrada();
		 }
		 
	}
	public void buscarPalabraLatin() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada;

		 if (existeEnProp(propiedad, propLatin)) {
			vf.getWindow().getMainPanel().getTxtPalabra().setText(propLatin.getProperty(propiedad));
		 }else {
			 vf.getWindow().getPopUpWindow().palabraNoEncontrada();
		 }
		 
	}
	
	public void buscarDefinicionEnglish() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada+".definicion";

		 if (existeEnProp(propiedad, propEnglish)) {
			vf.getWindow().getMainPanel().getTxtDefinicion().setText(propEnglish.getProperty(propiedad));
		 }
		 
	}

	
	public void buscarDefinicionSpanish() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada+".definicion";

		 if (existeEnProp(propiedad, propSpanish)) {
			vf.getWindow().getMainPanel().getTxtDefinicion().setText(propSpanish.getProperty(propiedad));
		 }
		 
	}
	
	public void buscarDefinicionFrench() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada+".definicion";

		 if (existeEnProp(propiedad, propFrench)) {
			vf.getWindow().getMainPanel().getTxtDefinicion().setText(propFrench.getProperty(propiedad));
		 }
		 
	}
	
	public void buscarDefinicionItalian() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada+".definicion";

		 if (existeEnProp(propiedad, propItalian)) {
			vf.getWindow().getMainPanel().getTxtDefinicion().setText(propItalian.getProperty(propiedad));
		 }
		 
	}
	public void buscarDefinicionPortuguesse() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada+".definicion";

		 if (existeEnProp(propiedad, propPortuguesse)) {
			vf.getWindow().getMainPanel().getTxtDefinicion().setText(propPortuguesse.getProperty(propiedad));
		 } 
		 
	}
	public void buscarDefinicionLatin() {
		String entrada = vf.getWindow().getMainPanel().getTxtInput().getText().toLowerCase().trim();
		String propiedad = "palabra." + entrada+".definicion";

		 if (existeEnProp(propiedad, propLatin)) {
			vf.getWindow().getMainPanel().getTxtDefinicion().setText(propLatin.getProperty(propiedad));
		 }
		 
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vf.getWindow().getMainPanel().getBtnEnglish()) {
			buscarPalabraEnglish();
			buscarDefinicionEnglish();
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		} else if (e.getSource() == vf.getWindow().getMainPanel().getBtnSalir()) {
			System.exit(0);
		} else if(e.getSource() == vf.getWindow().getMainPanel().getBtnSpanish()) {
			buscarPalabraSpanish();
			buscarDefinicionSpanish();
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		}else if(e.getSource() == vf.getWindow().getMainPanel().getBtnFrench()) {
			buscarPalabraFrench();
			buscarDefinicionFrench();
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		}else if(e.getSource() == vf.getWindow().getMainPanel().getBtnItalian()) {
			buscarPalabraItalian();
			buscarDefinicionItalian();
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		}else if(e.getSource() == vf.getWindow().getMainPanel().getBtnPortuguesse()) {
			buscarPalabraPortuguesse();
			buscarDefinicionPortuguesse();
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		}else if(e.getSource() == vf.getWindow().getMainPanel().getBtnLatin()) {
			buscarPalabraLatin();
			buscarDefinicionLatin();
			vf.getWindow().revalidate();
			vf.getWindow().repaint();
		}

	}

}
