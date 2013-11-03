/**
 * 
 */
package fr.esiea.ail.ihm.scm.dao;

import java.util.Collection;

import fr.esiea.ail.ihm.scm.model.Model;

/**
 * @author Nic0w
 *
 */
public interface DataAccessObject<M extends Model> {

  
    public Collection<M> getAll() throws DAOException;

    public void remove(Integer id) throws DAOException;

    public void save(M model) throws DAOException;

    public void add(M model) throws DAOException;

    public M get(Integer id) throws DAOException;
	
}
