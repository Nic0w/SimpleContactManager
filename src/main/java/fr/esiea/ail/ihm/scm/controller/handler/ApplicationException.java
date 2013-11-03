package fr.esiea.ail.ihm.scm.controller.handler;

import org.springframework.http.HttpStatus;

public abstract class ApplicationException extends Exception {

	private final HttpStatus errorCode;
	
	private final Object errorBody;
	
	protected ApplicationException(HttpStatus code, Object o) {
		
		this.errorBody = o;
		
		this.errorCode = code;
		
	}
	
	public HttpStatus getErrorCode() {
		return errorCode;
	}

	public Object getErrorBody() {
		return errorBody;
	}

	
}
