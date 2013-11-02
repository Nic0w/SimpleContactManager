package fr.esiea.ihm.scm.controllers;

import java.util.Collection;

import fr.esiea.ihm.scm.model.Model;

public interface CrudController<M extends Model> {

	public void create(M model);
	
	public M readByID(Integer id);
	
	public Collection<M> readAll();
	
	public void update(M model);
	
	public void remove(Integer id);
	
}
