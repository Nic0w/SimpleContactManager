package fr.esiea.ail.ihm.scm.model.contact;

import java.util.List;
import java.util.Map;

import fr.esiea.ail.ihm.scm.model.Model;

public class Contact extends Model {

	//nom, prenom, address, téléphone, mail, date de naissance, photo, 	

	private String firstname, lastname;
	private List<Address> addresses;
	private List<String> emails;

	private Map<PhoneType, String> phoneNumbers;



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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String name) {
		this.firstname = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String forname) {
		this.lastname = forname;
	}


}
