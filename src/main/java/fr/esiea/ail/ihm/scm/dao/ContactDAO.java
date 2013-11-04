package fr.esiea.ail.ihm.scm.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import static java.util.Arrays.asList;
import fr.esiea.ail.ihm.scm.controller.ContactController;
import fr.esiea.ail.ihm.scm.model.contact.Address;
import fr.esiea.ail.ihm.scm.model.contact.Contact;
import fr.esiea.ail.ihm.scm.model.contact.PhoneType;

@Repository
public class ContactDAO extends FakeDataAccessObject<Contact> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContactDAO.class);

	public ContactDAO() {
		super(new HashMap<Integer, Contact>());
		
		try {
			
			super.add(Contact.builder(
					"Nicolas", "Broquet", 
					asList(new String[] {
							
							"broquet@et.esiea.fr"
							
					}), 
					asList(new Address[] {
							
							Address.builder("15 rue Vésale", "75005", "Paris", null, "France")
							
					}), 
					new EnumMap<PhoneType, String>(PhoneType.class) {{
						
						put(PhoneType.MOBILE, "0102030405");
						
					}}
				)
			);
			
			super.add(Contact.builder(
					"Thomas", "Béjuit", 
					asList(new String[] {
							
							"bejuit@et.esiea.fr"
							
					}), 
					asList(new Address[] {
						
							Address.builder("74 avenue Maurice Thorez", "94200", "Ivry-Sur-Seine", null, "France")
							
					}), 
					new EnumMap<PhoneType, String>(PhoneType.class) {{
						
						put(PhoneType.MOBILE, "0607080901");
						
					}}
				)
			);
			
		} catch (DAOException e) {
			
			LOGGER.warn("Failed to insert test data.", e);
		}
	}
}
