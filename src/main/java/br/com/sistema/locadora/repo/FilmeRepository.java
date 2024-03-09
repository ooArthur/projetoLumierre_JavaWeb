package br.com.sistema.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.locadora.models.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
