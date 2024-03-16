package br.com.sistema.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.locadora.exception.LocadoraNotFoundException;
import br.com.sistema.locadora.models.Cliente;
import br.com.sistema.locadora.models.Serie;
import br.com.sistema.locadora.repo.ClienteRepository;
import br.com.sistema.locadora.repo.SerieRepository;
import br.com.sistema.locadora.service.IClienteService;
import br.com.sistema.locadora.service.ISerieService;

@Service
public class SerieServiceImpl implements ISerieService {

	@Autowired // Trás todas as informações da tabela
	private SerieRepository repo;
	
	@Override
	public Serie salvarSerie(Serie serie) {
		// TODO Auto-generated method stub
		return repo.save(serie);
	}

	@Override
	public List<Serie> buscarTodasAsSeries() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Serie buscarSerie(Long id) {
		Optional<Serie> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		} else {
			throw new LocadoraNotFoundException("o ID: " + id + " não foi encontrado");
		}
	}

	@Override
	public void deletarSerie(Long id) {
		// TODO Auto-generated method stub
		repo.delete(buscarSerie(id));
		
	}

	@Override
	public void atualizarSerie(Serie serie) {
		// TODO Auto-generated method stub
		repo.save(serie);
		
	}
}


