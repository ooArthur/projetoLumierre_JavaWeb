package br.com.sistema.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.locadora.models.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long>{

}