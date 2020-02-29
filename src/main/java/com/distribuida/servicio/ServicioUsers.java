package com.distribuida.servicio;

import java.util.List;

import com.distribuida.dto.Users;

public interface ServicioUsers {
	public Users getUsersById(Integer id);

	public List<Users> getUsers();

}
