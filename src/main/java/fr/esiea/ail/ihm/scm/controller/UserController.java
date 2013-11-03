package fr.esiea.ail.ihm.scm.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;

public class UserController implements CrudController {

	@Override
	public void create(Model model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Model readByID(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(Model model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAll(HttpServletResponse response)
			throws ApplicationException, IOException {
		// TODO Auto-generated method stub
		
	}

}
