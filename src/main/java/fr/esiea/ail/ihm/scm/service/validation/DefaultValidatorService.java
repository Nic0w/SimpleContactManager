package fr.esiea.ail.ihm.scm.service.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import fr.esiea.ail.ihm.scm.model.Model;

@Service
public class DefaultValidatorService<M extends Model> implements ValidatorService<M> {

	private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	
	@Override
	public Map<Object, String> validate(M model) {
		
		Set<ConstraintViolation<M>> violations = validator.validate(model);
  
		Map<Object, String> problems = new HashMap<>(violations.size());
		
		for(ConstraintViolation<M> problem : violations)
			problems.put(problem.getInvalidValue(), problem.getMessage());
		
		return problems;
	}
	
	
}