package fr.esiea.ail.ihm.scm.model.user;

import fr.esiea.ail.ihm.scm.model.Model;

public class User extends Model {

	private String mail;
	
	private String password;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
