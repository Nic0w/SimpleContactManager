package fr.esiea.ail.ihm.scm.controller;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;
import fr.esiea.ail.ihm.scm.service.ServiceException;

import java.util.Collection;

public interface CrudController<M extends Model> {

	public void create(M model) throws ApplicationException;
	
	public M readByID(Integer id) throws ApplicationException;
	
	public Collection<M> readAll()throws ApplicationException;
	
	public void update(M model) throws ApplicationException;
	
	public void remove(Integer id) throws ApplicationException;
	
}
