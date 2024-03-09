package br.com.sistema.locadora.service;

import java.util.List;

import br.com.sistema.locadora.models.Serie;

public interface ISerieService {
	
	public Serie salvarSerie(Serie serie);
	public List<Serie> buscarTodasAsSeries();
	public Serie buscarSerie(Long id);
	public void deletarSerie(Long id);
	public void atualizarSerie(Long id);

}
