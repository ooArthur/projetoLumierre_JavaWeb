package br.com.sistema.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.locadora.exception.LocadoraNotFoundException;
import br.com.sistema.locadora.models.Cliente;
import br.com.sistema.locadora.repo.ClienteRepository;
import br.com.sistema.locadora.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired // Trás todas as informações da tabela
	private ClienteRepository repo;
	
	@Override
	public Cliente salvarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return repo.save(cliente);
	}

	@Override
	public List<Cliente> buscarTodosOsClientes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cliente buscarCliente(Long id) {
		Optional<Cliente> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		} else {
			throw new LocadoraNotFoundException("o ID: " + id + " não foi encontrado");
		}
	}

	@Override
	public void deletarCliente(Long id) {
		// TODO Auto-generated method stub
		repo.delete(buscarCliente(id));
		
	}

	@Override
	public void atualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		repo.save(cliente);
		
	}
}


