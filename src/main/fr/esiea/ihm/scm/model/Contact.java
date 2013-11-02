package fr.esiea.ihm.scm.model;

public class Contact extends Model {

//nom, prenom, address, téléphone, mail, date de naissance, photo, 	
	
	private String name, forname;
	
	private String mail;

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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
