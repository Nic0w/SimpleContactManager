package fr.esiea.ail.ihm.scm.service.validation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.contact.Contact;
import fr.esiea.ail.ihm.scm.service.IService;

public class ContactValidatorService implements IService<Contact> {

	@Autowired
	private IService<Contact> crudService;

    @Autowired
    private ValidatorService<Contact> validationService;

	@Override
	public Contact getOne(Integer id) throws DAOException {
		
		
		return null;
	}

	@Override
	public void add(Contact model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Contact model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer id) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Contact> getAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
}
