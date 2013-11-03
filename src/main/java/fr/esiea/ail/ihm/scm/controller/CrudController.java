package fr.esiea.ail.ihm.scm.controller;

import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;
import fr.esiea.ail.ihm.scm.service.ServiceException;

import java.util.Collection;

public interface CrudController<M extends Model> {

	public void create(M model) throws DAOException, ServiceException;
	
	public M readByID(Integer id) throws DAOException, ServiceException;
	
	public Collection<M> readAll()throws DAOException, ServiceException;
	
	public void update(M model) throws DAOException, ServiceException;
	
	public void remove(Integer id) throws DAOException, ServiceException;
	
}
