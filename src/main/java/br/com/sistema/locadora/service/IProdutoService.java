package br.com.sistema.locadora.service;

import java.util.List;

import br.com.sistema.locadora.models.Produto;

public interface IProdutoService {
	
	public Produto salvarProduto(Produto produto);
	public List<Produto> buscarTodosProdutos();
	public Produto buscarProduto(Long id);
	public void deletarProduto(Long id);
	public void atualizarProduto(Produto produto);

}
