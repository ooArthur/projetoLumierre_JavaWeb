package br.com.sistema.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sistema.locadora.exception.LocadoraNotFoundException;
import br.com.sistema.locadora.models.Cliente;
import br.com.sistema.locadora.models.Produto;
import br.com.sistema.locadora.service.IClienteService;
import br.com.sistema.locadora.service.IProdutoService;

@Controller
@RequestMapping("/locadora")
public class LocadoraController {

	@Autowired
	private IClienteService service;
	
	@Autowired
	private IProdutoService serviceP;
	
	
	@GetMapping("/")
	public String paginaInicial() {
		return "paginaInicial";
	}
	
	
	@GetMapping("/adicionarCliente")
	public String adicionarCliente() {
		return "adicionarCliente";
	}

	@GetMapping("/adicionarProduto")
	public String adicionarProduto() {
		return "adicionarProduto";
	}



		@PostMapping("/adicionarCliente")
		public String salvarCliente(@ModelAttribute Cliente cliente, Model model) {
		// @ ModelAttribute vincula as informações do formulario a um objeto
		service.salvarCliente(cliente);
		// salva novamente (redundante) retorna o id do nosso cliente
		Long id = service.salvarCliente(cliente).getId();
		// mensagem para o usuario
		String mensagem = "Salvo com o id: " + id + " com sucesso!";
		// adicionando mensagem na resposta
		model.addAttribute(mensagem);
		return "redirect:listar";
		}

		@PostMapping("/adicionarProduto")
		public String salvarProduto(@ModelAttribute Produto produto, Model model) {
		// @ ModelAttribute vincula as informações do formulario a um objeto
		serviceP.salvarProduto(produto);
		// salva novamente (redundante) retorna o id do nosso filme
		Long id = serviceP.salvarProduto(produto).getId();
		// mensagem para o usuario
		String mensagem = "Salvo com o id: " + id + " com sucesso!";
		// adicionando mensagem na resposta
		model.addAttribute(mensagem);
		return "redirect:listar";
		}


	@PostMapping("/atualizarCliente")
	public String atualizarCliente(@ModelAttribute Cliente cliente, RedirectAttributes attributes) {
	service.atualizarCliente(cliente);
	Long id = cliente.getId();
	attributes.addAttribute("message", "Cliente com o Id: " + id + " foi atualizado!");
	return "redirect:listar";
	}


	@PostMapping("/atualizarProduto")
	public String atualizarProduto(@ModelAttribute Produto produto, RedirectAttributes attributes) {
	serviceP.atualizarProduto(produto);
	Long id = produto.getId();
	attributes.addAttribute("message", "Serie com o Id: " + id + " foi atualizado!");
	return "redirect:listar";
	}


		@GetMapping("/editarCliente")
		public String editarCliente(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page;
		try {
			Cliente cliente = service.buscarCliente(id);
			model.addAttribute("cliente", cliente);
			page = "editarCliente";
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:listar";
		}
		return page;

	}

		@GetMapping("/editarProduto")
		public String editarProduto(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page;
		try {
			Produto produto = serviceP.buscarProduto(id);
			model.addAttribute("Produto", produto);
			page = "editarProduto";
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:listar";
		}
		return page;

	}


	@GetMapping("/deletarCliente")
	public String deletarCliente(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deletarCliente(id);
			attributes.addAttribute("message", "O Cliente foi deletado, id: " + id);
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listar";
	}


	@GetMapping("/deletarProduto")
	public String deletarProduto(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			serviceP.deletarProduto(id);
			attributes.addAttribute("message", "O Serie foi deletado, id: " + id);
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listar";
	}


	@GetMapping("/listarCliente")
	public String listarCliente(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista dos clientes
		List<Cliente> cliente = service.buscarTodosOsClientes();
		model.addAttribute("lista", cliente);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listarClientes";
	}


	@GetMapping("/listarProdutos")
	public String listarProdutos(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista das Series
		List<Produto> produto = serviceP.buscarTodosProdutos();
		model.addAttribute("lista", produto);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listarProdutos";
	}
	
	
}
