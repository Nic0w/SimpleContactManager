/**
 * 
 */
package fr.esiea.ihm.scm.service;

import java.util.Collection;

import fr.esiea.ihm.scm.model.Contact;
import fr.esiea.ihm.scm.model.Model;

/**
 * @author nic0w
 *
 */

public interface Service<M extends Model> {

	M getOne(Integer id);

	void add(M model);

	void update(M model);

	Collection<M> getAll();
}
