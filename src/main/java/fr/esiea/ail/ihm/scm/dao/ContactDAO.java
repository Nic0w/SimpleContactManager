package fr.esiea.ail.ihm.scm.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.esiea.ail.ihm.scm.controller.ContactController;
import fr.esiea.ail.ihm.scm.model.Contact;

public class ContactDAO extends FakeDataAccessObject<Contact> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContactDAO.class);

	public ContactDAO() {
		super(new HashMap<Integer, Contact>());

	}

	




}
