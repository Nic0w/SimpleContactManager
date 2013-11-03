/**
 * 
 */
package fr.esiea.ail.ihm.scm.service;

import java.util.Collection;

import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;
import fr.esiea.ail.ihm.scm.service.validation.ValidationException;

/**
 * @author nic0w
 *
 */

public interface IService<M extends Model> {

	M getOne(Integer id) throws DAOException, ServiceException;

	void add(M model) throws DAOException, ServiceException;

	void update(M model) throws DAOException, ServiceException;
	
	void remove(Integer id) throws DAOException, ServiceException;

	Collection<M> getAll() throws DAOException, ServiceException;
}
