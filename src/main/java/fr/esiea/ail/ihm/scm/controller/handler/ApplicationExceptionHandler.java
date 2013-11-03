package fr.esiea.ail.ihm.scm.controller.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import fr.esiea.ail.ihm.scm.controller.ContactController;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	private final static Logger LOGGER = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

	@ExceptionHandler(value = {ApplicationException.class})
	protected ResponseEntity<Object> handleException(ApplicationException e, WebRequest request) {
		
		LOGGER.warn("Caughth an exception !", e);
		
		return new ResponseEntity<Object>(
				e.getErrorBody(),
				e.getErrorCode()
			);
	}
}