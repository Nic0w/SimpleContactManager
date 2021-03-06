package fr.esiea.ail.ihm.scm.dao;

import java.util.Collection;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.esiea.ail.ihm.scm.model.Model;
import fr.esiea.ail.ihm.scm.model.contact.Contact;

public abstract class FakeDataAccessObject<M extends Model> implements DataAccessObject<M> {

	private static final Logger LOGGER = LoggerFactory.getLogger(FakeDataAccessObject.class);
	
	private final Map<Integer, M> fakeDatabase;
	
	private int nextID;
	
	protected FakeDataAccessObject(Map<Integer, M> map) {
		
		this.fakeDatabase = map;
		
		nextID = 0;
		
	}
	
	@Override
	public Collection<M> getAll() throws DAOException {

		return this.fakeDatabase.values();
	}

	@Override
	public void remove(Integer id) throws DAOException {

		try {

			this.fakeDatabase.remove(id);

		} catch (Exception e) {
			
			throw new DAOException(e);
		}
	}

	@Override
	public void save(M m) throws DAOException {

		M old = null;
		
		String className = m.getClass().getSimpleName();

		if(m.getID() == null)
			throw new DAOException("ID is null !");
		
		try {
			
			if(!this.fakeDatabase.containsKey(m.getID())) {
				
				LOGGER.warn("{} {} is not present in Database !", className, m.getID());
				
				throw new DAOException("Element not present in database !");
			}

			old = this.fakeDatabase.put(m.getID(), m);

		} catch (Exception e) {

			LOGGER.warn("Failed to save {} {} !", className, m.getID());

			throw new DAOException(e);
		}

		LOGGER.info("Successfully replaced {} by [} !", old, m);
	}

	@Override
	public void add(M m) throws DAOException {
		
		String className = m.getClass().getSimpleName();
		
		if(m.getID() == null) 
			m.setID(this.getNextID());
		
		try {
			
			if(this.fakeDatabase.containsKey(m.getID()))
				throw new DAOException("Database already contains "+ className +" "+ m.getID()+ " !");
			
			this.fakeDatabase.put(m.getID(), m);
			
			
		} catch (Exception e) {
			
			if(e instanceof DAOException)
				throw e;
			else {
				
				LOGGER.warn("Failed to check if {} {} is already in database.", className, m.getID());
				
				throw new DAOException(e);
			}
		}

	}

	private Integer getNextID() {
		return this.nextID++;
	}

	@Override
	public M get(Integer id) throws DAOException {
		
		try {
			return this.fakeDatabase.get(id);
			
		} catch (Exception e) {
			
			throw new DAOException(e);
		}
	}
}
