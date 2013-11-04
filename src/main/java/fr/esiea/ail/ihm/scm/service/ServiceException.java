package fr.esiea.ail.ihm.scm.service;

import org.springframework.http.HttpStatus;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;

public class ServiceException extends ApplicationException {

	protected ServiceException(String message) {
		super(HttpStatus.SERVICE_UNAVAILABLE, message);
		// TODO Auto-generated constructor stub
	}

}
