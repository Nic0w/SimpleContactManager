package fr.esiea.ail.ihm.scm.controller;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.contact.Contact;
import fr.esiea.ail.ihm.scm.model.contact.ContactView;
import fr.esiea.ail.ihm.scm.service.IService;
import fr.esiea.ail.ihm.scm.service.ServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/contact")
public class ContactController implements CrudController<Contact> {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    @Qualifier("contactValidatorService")
    private IService<Contact> contactService;
	
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    @Override
    public Contact readByID(@PathVariable("id") Integer contactId) throws ApplicationException {

            LOGGER.info("Querying contact {}.", contactId);
            
            LOGGER.debug("contactService is {}", this.contactService);
            
            return contactService.getOne(contactId);
    }
    
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
    @ResponseStatus(HttpStatus.CREATED)
	@Override
	public void create(@RequestBody Contact contact) throws ApplicationException {
    	LOGGER.info("Add !");
    	
		this.contactService.add(contact);
	}

    @RequestMapping(value = "", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
	@Override
	public void update(@RequestBody Contact contact) throws ApplicationException {
		
    	LOGGER.info("Update !");
    	
    	this.contactService.update(contact);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
	@Override
	public void remove(@PathVariable("id") Integer id) throws ApplicationException {
		LOGGER.info("Remove !");
		
		this.contactService.remove(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
	@Override
	public void readAll(HttpServletResponse response) throws ApplicationException, IOException {
		
		ObjectMapper json = new ObjectMapper();
		
		json.writerWithView(ContactView.Minimal.class).
			writeValue(response.getOutputStream(), this.contactService.getAll());
		

	}
	
	
    public void setContactService(IService<Contact> service) {
    	
    	this.contactService = service;
    }

}
