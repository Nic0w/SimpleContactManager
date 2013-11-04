package fr.esiea.ail.ihm.scm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DataAccessObject;
import fr.esiea.ail.ihm.scm.dao.FakeDataAccessObject;
import fr.esiea.ail.ihm.scm.model.user.User;

@Service
public class UserService implements IService<User> {
	
	@Autowired
	@Qualifier("userDAO")
	private DataAccessObject<User> userDAO;
	
	@Override
	public User getOne(Integer id) throws ApplicationException {
		
		return this.userDAO.get(id);
	}

	@Override
	public void add(User user) throws ApplicationException {
		
		this.userDAO.add(user);
	}

	@Override
	public void update(User model) throws ApplicationException {
		
		this.userDAO.save(model);
	}

	@Override
	public void remove(Integer id) throws ApplicationException {
		
		this.userDAO.remove(id);
	}

	@Override
	public Collection<User> getAll() throws ApplicationException {
		
		return this.userDAO.getAll();
	}

	public void setUserDAO(DataAccessObject<User> dao) {
		
		this.userDAO = dao;
	}
}
