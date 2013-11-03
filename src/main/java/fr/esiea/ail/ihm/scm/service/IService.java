/**
 * 
 */
package fr.esiea.ail.ihm.scm.service;

import java.util.Collection;

import fr.esiea.ail.ihm.scm.dao.DAOException;
import fr.esiea.ail.ihm.scm.model.Model;

/**
 * @author nic0w
 *
 */

public interface IService<M extends Model> {

	M getOne(Integer id) throws DAOException;

	void add(M model) throws DAOException;

	void update(M model) throws DAOException;
	
	void remove(Integer id) throws DAOException;

	Collection<M> getAll() throws DAOException;
}
