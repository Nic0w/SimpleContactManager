package fr.esiea.ihm.scm.controllers;

import fr.esiea.ihm.scm.model.Contact;
import fr.esiea.ihm.scm.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/contact")
public class ContactController implements CrudController<Contact> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    @Qualifier("contactService")
    private IService<Contact> contactService;
	
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    @Override
    public Contact readByID(@PathVariable("id") Integer contactId) {

            LOGGER.info("Querying contact {}.", contactId);
            
            LOGGER.debug("contactService is {}", this.contactService);
            
            return contactService.getOne(contactId);
    }
    
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.CREATED)
	@Override
	public void create(@RequestBody Contact contact) {
		
		this.contactService.add(contact);
	}

    @RequestMapping(value = "", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
	@Override
	public void update(@RequestBody Contact contact) {
		
    	this.contactService.update(contact);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
	@Override
	public void remove(@PathVariable("id") Integer id) {
		
		
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
	@Override
	public Collection<Contact> readAll() {
		
		return this.contactService.getAll();
	}
	
	
    public void setContactService(IService<Contact> service) {
    	
    	this.contactService = service;
    }
}
