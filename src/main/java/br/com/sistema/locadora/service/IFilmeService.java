package br.com.sistema.locadora.service;

import java.util.List;

import br.com.sistema.locadora.models.Filme;

public interface IFilmeService {

	public Filme salvarFilme(Filme filme);
	public List<Filme> buscarTodosOsFilmes();
	public Filme buscarFilme(Long id);
	public void deletarFilme(Long id);
	public void atualizarFilme(Long id);
	
}
