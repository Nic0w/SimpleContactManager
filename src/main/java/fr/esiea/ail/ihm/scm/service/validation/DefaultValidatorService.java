package fr.esiea.ail.ihm.scm.service.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;




import java.util.Collections;
import java.util.Map;
import java.util.Set;

import fr.esiea.ail.ihm.scm.model.Model;

public class DefaultValidatorService<M extends Model> implements ValidatorService<M> {

	private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	
	@Override
	public Map<Object, String> validate(M model) throws ValidationException {
		
		
		Set<ConstraintViolation<M>> violations = validator.validate(model);

  
		
		
		return null;
	}
	
	
}