package fr.esiea.ail.ihm.scm.service;

import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.dao.DataAccessObject;
import fr.esiea.ail.ihm.scm.model.contact.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class ContactService implements IService<Contact> {

	@Autowired
    @Qualifier("contactDAO")
	private DataAccessObject<Contact> contactDAO;
	
	@Override
	public Contact getOne(Integer id) throws DAOException {
		
		return contactDAO.get(id);
	}

    @Override
    public void add(Contact model) throws DAOException {
        this.contactDAO.add(model);
    }

    @Override
    public void update(Contact model) throws DAOException {
        this.contactDAO.save(model);
    }

    @Override
    public Collection<Contact> getAll() throws DAOException {
  
        return this.contactDAO.getAll();  
    }

    public void setContactDAO(DataAccessObject<Contact> dao) {
    	this.contactDAO = dao;
    }

	@Override
	public void remove(Integer id) throws DAOException {
		
		this.contactDAO.remove(id);
		
	}
    
}
