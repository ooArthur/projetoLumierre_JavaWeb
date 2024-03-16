package br.com.sistema.locadora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.locadora.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
