package fr.esiea.ihm.scm.service;

import fr.esiea.ihm.scm.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ContactService implements IService<Contact> {

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
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Contact model) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<Contact> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
