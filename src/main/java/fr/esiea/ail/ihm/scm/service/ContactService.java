package fr.esiea.ail.ihm.scm.service;

import fr.esiea.ail.ihm.scm.dao.DataAccessObject;
import fr.esiea.ail.ihm.scm.model.Contact;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class ContactService implements IService<Contact> {

	private DataAccessObject<Contact> contactDAO;
	
	@Override
	public Contact getOne(Integer id) {
		
		Contact c = new Contact();
		
		c.setForname("pwet");
		
		c.setMail("noob");
		
		c.setName("noononono");
		
		return  c ;
	}

    @Override
    public void add(Contact model) {
        
    }

    @Override
    public void update(Contact model) {
        
    }

    @Override
    public Collection<Contact> getAll() {
    	
    	List<Contact> all = Arrays.asList(getOne(0), getOne(1),getOne(2));
    	
    	
        return all;  
    }

}
