package br.com.sistema.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.locadora.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
