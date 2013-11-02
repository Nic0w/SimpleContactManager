package fr.esiea.ihm.scm.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void helloWorld() {

		System.out.println("OK !!");
	}

}
