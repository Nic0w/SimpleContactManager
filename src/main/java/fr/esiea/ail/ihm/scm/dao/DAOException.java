package fr.esiea.ail.ihm.scm.dao;

import org.springframework.http.HttpStatus;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;

public class DAOException extends ApplicationException {

	public DAOException(Exception e) {
		super(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
	}

	public DAOException(String msg) {
		super(HttpStatus.INTERNAL_SERVER_ERROR, msg);
	}

}
