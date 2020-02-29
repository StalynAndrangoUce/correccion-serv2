package com.distribuida.servicio;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Users;

@ApplicationScoped
@Transactional
public class ServicioUsersImpl implements ServicioUsers {

	@PersistenceContext(unitName = "usersPU")
	private EntityManager entityManager;

	@Override
	public Users getUsersById(Integer id) {
		Users users = entityManager.find(Users.class, id);

		return users;
	}

	@Override
	public List<Users> getUsers() {
		// List<Users> lista = entityManager.createNamedQuery("Users.findAll",
		// Users.class).getResultList();
		List<Users> lista = entityManager.createQuery("Select t from " + Users.class.getName() + " t").getResultList();
		return lista;
	}

}
