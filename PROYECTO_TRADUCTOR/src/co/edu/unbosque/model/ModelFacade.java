package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PalabraDAO;

public class ModelFacade {

	private PalabraDAO palabraDAO;
	
	
	public ModelFacade() {
		palabraDAO = new PalabraDAO();
		
	}


	public PalabraDAO getPalabraDAO() {
		return palabraDAO;
	}


	public void setPalabraDAO(PalabraDAO palabraDAO) {
		this.palabraDAO = palabraDAO;
	}
	
	
	
}
