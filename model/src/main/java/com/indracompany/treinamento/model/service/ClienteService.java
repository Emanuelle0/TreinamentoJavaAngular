package com.indracompany.treinamento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indracompany.treinamento.model.entity.Cliente;
import com.indracompany.treinamento.model.repository.ClienteRepository;

@Service
public class ClienteService extends GenericCrudService<Cliente, Long, ClienteRepository>{

	@Autowired
	private ClienteRepository clienteRepository; 
	
	public List<Cliente> findByName(String nome){
		return clienteRepository.findByNomeContaining(nome); 
	}
	  
}
