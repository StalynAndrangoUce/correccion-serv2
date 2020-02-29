package com.distribuida.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.dto.Users;
import com.distribuida.servicio.ServicioUsers;

@Path("users")
@ApplicationScoped
public class ServicioUsersRest {

	@Inject
	private ServicioUsers servicio;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Users> listarUsers() {
		List<Users> lista = servicio.getUsers();
		return lista;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Users usersPorId(@PathParam("id") Integer id) {
		Users users = servicio.getUsersById(id);
		return users;
	}

}
