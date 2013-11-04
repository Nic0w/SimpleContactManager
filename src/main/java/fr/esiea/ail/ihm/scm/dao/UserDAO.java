package fr.esiea.ail.ihm.scm.dao;

import java.util.HashMap;
import java.util.Map;

import fr.esiea.ail.ihm.scm.model.user.User;

public class UserDAO extends FakeDataAccessObject<User> {

	protected UserDAO() {
		super(new HashMap<Integer, User>());
		// TODO Auto-generated constructor stub
	}

}
