package fr.esiea.ail.ihm.scm.controller;

import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;

import java.util.Collection;

public interface CrudController<M extends Model> {

	public void create(M model) throws DAOException;
	
	public M readByID(Integer id) throws DAOException;
	
	public Collection<M> readAll()throws DAOException;
	
	public void update(M model) throws DAOException;
	
	public void remove(Integer id) throws DAOException;
	
}
