package fr.esiea.ail.ihm.scm.service.validation;

import java.util.Map;

import org.springframework.http.HttpStatus;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.service.ServiceException;

public class ValidationException extends ApplicationException {

	protected ValidationException(Map<Object, String> problems) {
		super(HttpStatus.BAD_REQUEST, problems);
	}

}
