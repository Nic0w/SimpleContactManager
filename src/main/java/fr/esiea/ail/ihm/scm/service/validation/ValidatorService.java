package fr.esiea.ail.ihm.scm.service.validation;

import java.util.Map;

import fr.esiea.ail.ihm.scm.model.Model;

public interface ValidatorService<M extends Model> {

	public Map<Object, String> validate(M model) throws ValidationException;
	
}
