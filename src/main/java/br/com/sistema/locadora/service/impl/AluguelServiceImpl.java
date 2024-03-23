package br.com.sistema.locadora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.locadora.models.Aluguel;
import br.com.sistema.locadora.repo.AluguelRepository;
import br.com.sistema.locadora.service.IAluguelService;

@Service
public class AluguelServiceImpl implements IAluguelService {

	@Autowired
	public AluguelRepository repo;

	@Override
	public Aluguel salvarAluguel(Aluguel aluguel) {

		return repo.save(aluguel);
	}

}