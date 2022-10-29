package com.cadastro.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cadastro.exception.ResourceNotFoudException;
import com.cadastro.model.Cliente;
import com.cadastro.repositories.ClienteRepository;
import com.cadastro.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	private ClienteRepository clienteRepository;

	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}
	
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}
	
	
	public Cliente getClienteById(long id_cliente) {
		return clienteRepository.findById(id_cliente)
				.orElseThrow(() -> new ResourceNotFoudException("Cliente", "id_cliente", id_cliente));
	}
	
	
	public Cliente updatecliente(Cliente cliente, long id_cliente) {

		Cliente clienteExistente = clienteRepository.findById(id_cliente)
				.orElseThrow(() -> new ResourceNotFoudException("Cliente", "id_cliente", id_cliente));

		clienteExistente.setNome_cliente(cliente.getNome_cliente());
		clienteExistente.setNome_cliente(cliente.getEmail_cliente());
		clienteExistente.setNome_cliente(cliente.getSenha_cliente());

		clienteRepository.save(clienteExistente);
		return clienteExistente;
	}
	
	
	public void deleteCliente(long id_cliente) {

		clienteRepository.findById(id_cliente)
				.orElseThrow(() -> new ResourceNotFoudException("cliente", "id_cliente", id_cliente));
		clienteRepository.deleteById(id_cliente);
	}
}
