package fr.esiea.ihm.scm.controllers;

import fr.esiea.ihm.scm.model.Model;

import java.util.Collection;

public interface CrudController<M extends Model> {

	public void create(M model);
	
	public M readByID(Integer id);
	
	public Collection<M> readAll();
	
	public void update(M model);
	
	public void remove(Integer id);
	
}
