package fr.esiea.ail.ihm.scm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.model.user.User;
import fr.esiea.ail.ihm.scm.service.IService;
import fr.esiea.ail.ihm.scm.service.ident.IdentificationService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private IService<User> userService;
	
	@Autowired
	@Qualifier("defaultIdentService")
	private IdentificationService identService;

	@RequestMapping(value = "/signin", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.OK)
	public void signIn() {
		
		
		
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.CREATED)
	public void signUp(User newUser) throws ApplicationException {
		
		this.userService.add(newUser);
	}


}
