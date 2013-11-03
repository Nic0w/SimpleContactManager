/**
 * 
 */
package fr.esiea.ail.ihm.scm.service;

import java.util.Collection;

import fr.esiea.ail.ihm.scm.controller.handler.ApplicationException;
import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;
import fr.esiea.ail.ihm.scm.service.validation.ValidationException;

/**
 * @author nic0w
 *
 */

public interface IService<M extends Model> {

	M getOne(Integer id) throws ApplicationException;

	void add(M model) throws ApplicationException;

	void update(M model) throws ApplicationException;
	
	void remove(Integer id) throws ApplicationException;

	Collection<M> getAll() throws ApplicationException;
}
