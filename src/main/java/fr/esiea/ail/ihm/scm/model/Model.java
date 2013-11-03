package fr.esiea.ail.ihm.scm.model;

public abstract class Model {

	private Integer id;
	
	public final void setID(Integer id) {
		
		this.id = id;
	}
	
	public final Integer getID() {
		
		return this.id;
	}
	
	
}
