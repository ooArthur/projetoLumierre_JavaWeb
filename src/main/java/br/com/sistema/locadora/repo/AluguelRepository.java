package br.com.sistema.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.locadora.models.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Long>{

}
