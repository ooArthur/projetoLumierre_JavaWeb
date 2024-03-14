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
public class FilmeServiceImpl implements IFilmeService {

	@Autowired // Trás todas as informações da tabela
	private FilmeRepository repo;
	
	@Override
	public Filme salvarFilme(Filme filme) {
		// TODO Auto-generated method stub
		return repo.save(filme);
	}

	@Override
	public List<Filme> buscarTodosOsFilmes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Filme buscarFilme(Long id) {
		Optional<Filme> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		} else {
			throw new LocadoraNotFoundException("o ID: " + id + " não foi encontrado");
		}
	}

	@Override
	public void deletarFilme(Long id) {
		// TODO Auto-generated method stub
		repo.delete(buscarFilme(id));
		
	}

	@Override
	public void atualizarFilme(Filme filme) {
		// TODO Auto-generated method stub
		repo.save(filme);
		
	}
}
