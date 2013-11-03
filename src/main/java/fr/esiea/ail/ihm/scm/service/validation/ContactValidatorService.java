package fr.esiea.ail.ihm.scm.service.validation;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.contact.Contact;
import fr.esiea.ail.ihm.scm.service.IService;
import fr.esiea.ail.ihm.scm.service.ServiceException;

@Service
public class ContactValidatorService implements IService<Contact> {

	@Autowired
	@Qualifier("contactService")
	private IService<Contact> contactService;

    @Autowired
    @Qualifier("defaultValidatorService")
    private ValidatorService<Contact> validatorService;

	@Override
	public Contact getOne(Integer id) throws ApplicationException {
		
		return contactService.getOne(id);
	}

	@Override
	public void add(Contact contact) throws ApplicationException {
		
		Map<Object, String> badFields = this.validatorService.validate(contact);
		
		if(badFields.isEmpty())
			this.contactService.add(contact);
		else
			throw new ValidationException(badFields);
		
	}

	@Override
	public void update(Contact contact) throws ApplicationException {
		
		Map<Object, String> badFields = this.validatorService.validate(contact);
		
		if(badFields.isEmpty())
			this.contactService.add(contact);
		else
			throw new ValidationException(badFields);
		
	}

	@Override
	public void remove(Integer id) throws ApplicationException {
	
		this.contactService.remove(id);
	}

	@Override
	public Collection<Contact> getAll() throws ApplicationException {
		
		return this.contactService.getAll();
	}
}
