package br.com.sistema.locadora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sistema.locadora.models.Aluguel;
import br.com.sistema.locadora.repo.AluguelRepository;
import br.com.sistema.locadora.service.IAluguelService;

public class AluguelServiceImpl implements IAluguelService {
	
	@Autowired
	public AluguelRepository repo;

	@Override
	public Aluguel calcularTotal(Aluguel aluguel) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
