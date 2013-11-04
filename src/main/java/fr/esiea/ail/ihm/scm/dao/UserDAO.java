package fr.esiea.ail.ihm.scm.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import fr.esiea.ail.ihm.scm.model.user.User;

@Repository
public class UserDAO extends FakeDataAccessObject<User> {

	protected UserDAO() {
		super(new HashMap<Integer, User>());
		// TODO Auto-generated constructor stub
	}

}
