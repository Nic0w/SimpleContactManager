package fr.esiea.ihm.scm.service;

import fr.esiea.ihm.scm.model.Contact;


public class ContactService implements Service<Contact> {

	@Override
	public Contact getOne(Integer id) {
		
		Contact c = new Contact();
		
		c.setForname("pwet");
		
		c.setMail("noob");
		
		c.setName("noononono");
		
		return  c ;
	}

}
