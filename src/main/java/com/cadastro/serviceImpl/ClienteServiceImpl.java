package com.cadastro.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cadastro.exception.ResourceNotFoundException;
import com.cadastro.model.Cliente;
import com.cadastro.repositories.ClienteRepository;
import com.cadastro.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Override
	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente getClienteById(long id_cliente) {
		return clienteRepository.findById(id_cliente)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente", "id_cliente", id_cliente));
	}
	
	@Override
	public Cliente updateCliente(Cliente cliente, long id_cliente) {

		
		Cliente clienteExistente = clienteRepository.findById(id_cliente)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente", "id_cliente", id_cliente));

		clienteExistente.setNome_cliente(cliente.getNome_cliente());
		clienteExistente.setEmail_cliente(cliente.getEmail_cliente());
		clienteExistente.setSenha_cliente(cliente.getSenha_cliente());

		clienteRepository.save(clienteExistente);
		return clienteExistente;
	}
	
	@Override
	public void deleteCliente(long id_cliente) {

		clienteRepository.findById(id_cliente)
				.orElseThrow(() -> new ResourceNotFoundException("cliente", "id_cliente", id_cliente));
		
		clienteRepository.deleteById(id_cliente);
	}
	
	
}
