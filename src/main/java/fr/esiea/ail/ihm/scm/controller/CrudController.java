package fr.esiea.ail.ihm.scm.controller;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;
import fr.esiea.ail.ihm.scm.model.contact.Contact;
import fr.esiea.ail.ihm.scm.service.ServiceException;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

public interface CrudController<M extends Model> {

	public void create(M model) throws ApplicationException;
	
	public M readByID(Integer id) throws ApplicationException;
	
	public void readAll(HttpServletResponse response) throws ApplicationException, IOException;
	
	public void update(M model) throws ApplicationException;
	
	public void remove(Integer id) throws ApplicationException;

	
	
}
