package com.nombreempresa.springboot.app.models.service;

import java.util.List;

import com.nombreempresa.springboot.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente save(Cliente cliente);

	public void delete(Long id);

	public Cliente findByid(Long id);

}
