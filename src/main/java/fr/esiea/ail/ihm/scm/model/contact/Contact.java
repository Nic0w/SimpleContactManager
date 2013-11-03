package fr.esiea.ail.ihm.scm.model.contact;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonView;

import fr.esiea.ail.ihm.scm.model.Model;

public class Contact extends Model {

	//nom, prenom, address, téléphone, mail, date de naissance, photo, 	

	@JsonView(ContactView.Minimal.class)
	@Pattern(regexp="[a-zA-Z-]+", message="Invalid characters in Firstname !")
	@Size(max = 50, message = "Firstname is too long !")
	private String firstname;
	
	@JsonView(ContactView.Minimal.class)
	@Pattern(regexp="[a-zA-Z-]+", message="Invalid characters in Lastname !")
	@Size(max = 50, message = "Lastname is too long !")
	private String lastname;
	
	@JsonView(ContactView.Full.class)
	@Pattern(regexp="19[0-9]{2}-[0-9]{2}-[0-9]{2}", message="Invalid date !")
	private String birthdate;
	
	@JsonView(ContactView.Full.class)
	private List<Address> addresses;
	
	@JsonView(ContactView.Full.class)
	private List<String> emails;

	@JsonView(ContactView.Full.class)
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

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


}
