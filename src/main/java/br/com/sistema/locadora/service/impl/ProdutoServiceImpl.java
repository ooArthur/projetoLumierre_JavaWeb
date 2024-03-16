package br.com.sistema.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.locadora.exception.LocadoraNotFoundException;
import br.com.sistema.locadora.models.Produto;
import br.com.sistema.locadora.repo.ProdutoRepository;
import br.com.sistema.locadora.service.IProdutoService;

@Service
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired // Trás todas as informações da tabela
	private ProdutoRepository repo;
	
	@Override
	public Produto salvarProduto(Produto produto) {
		// TODO Auto-generated method stub
		return repo.save(produto);
	}

	@Override
	public List<Produto> buscarTodosProdutos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Produto buscarProduto(Long id) {
		Optional<Produto> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		} else {
			throw new LocadoraNotFoundException("o ID: " + id + " não foi encontrado");
		}
	}

	@Override
	public void deletarProduto(Long id) {
		// TODO Auto-generated method stub
		repo.delete(buscarProduto(id));
		
	}
	
	@Override
	public void atualizarProduto(Produto produto) {
		repo.save(produto);
	}

}


