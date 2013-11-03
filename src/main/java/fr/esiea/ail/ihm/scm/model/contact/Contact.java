package fr.esiea.ail.ihm.scm.model.contact;

import java.util.List;
import java.util.Map;

import fr.esiea.ail.ihm.scm.model.Model;

public class Contact extends Model {

//nom, prenom, address, téléphone, mail, date de naissance, photo, 	
	
	private String name, forname;
	
	private Map<PhoneType, String> phoneNumbers;
	
	private List<String> emails;
	
	public Map<PhoneType, String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Map<PhoneType, String> phones) {
		this.phoneNumbers = phones;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	private List<String> addresses;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}
	
	
}
