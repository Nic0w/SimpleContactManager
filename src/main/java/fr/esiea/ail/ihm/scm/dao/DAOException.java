package fr.esiea.ail.ihm.scm.dao;

public class DAOException extends Exception {

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String string) {
		super(string);
	}

}
