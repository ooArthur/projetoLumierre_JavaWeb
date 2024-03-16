package br.com.sistema.locadora.service;

import java.util.List;

import br.com.sistema.locadora.models.Aluguel;
import br.com.sistema.locadora.models.Cliente;

public interface IClienteService {

	public Cliente salvarCliente(Cliente cliente);
	public List<Cliente> buscarTodosOsClientes();
	public Cliente buscarCliente(Long id);
	public void deletarCliente(Long id);
	public void atualizarCliente(Cliente cliente);
	
}
