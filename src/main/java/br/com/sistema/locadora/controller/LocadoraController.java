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

	// Visualizando a Página Inicial
	@GetMapping("/")
	public String home() {
		return "home";
	}

	// Visualizando a Página de Dashboard
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	// Visualizando a Página de Adicionar Filme do Dashboard
	@GetMapping("/dashboard/addMovie")
	public String addMovie() {
		return "addMovie";
	}

	// Adicionando Filme (POST)
	@PostMapping("/dashboard/addMovie") 
	public String salvarProduto(@ModelAttribute Produto produto, Model model) {
		// Salvando o produto no banco de dados
		Produto produtoSalvo = serviceP.salvarProduto(produto);
		// Obtendo o ID do produto salvo para exibição na mensagem de sucesso
		Long id = produtoSalvo.getId();
		// Criando uma mensagem de sucesso para exibir ao usuário
		String mensagem = "Salvo com o id: " + id + " com sucesso!";
		model.addAttribute("mensagem", mensagem);
		// Redireciona para a página de listagem de filmes
		return "redirect:listMovie";
	}

	// Atualizando Filme (POST)
	@PostMapping("/updateMovie")
	public String atualizarProduto(@ModelAttribute Produto produto, RedirectAttributes attributes) {
		serviceP.atualizarProduto(produto);
		Long id = produto.getId();
		attributes.addAttribute("message", "Filme com o Id: " + id + " foi atualizado!");
		return "redirect:dashboard";
	}

	// Visualizando a Página de Editar Filme
	@GetMapping("/dashboard/editMovie")
	public String editarProduto(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page;
		try {
			Produto produto = serviceP.buscarProduto(id);
			model.addAttribute("Produto", produto);
			page = "editMovie";
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:listMovie";
		}
		return page;

	}

	// Visualizando a Página de Deletar Filme
	@GetMapping("/deleteMovie")
	public String deletarProduto(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			serviceP.deletarProduto(id);
			attributes.addAttribute("message", "O Filme foi deletado, id: " + id);
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listMovie";
	}

	// Visualizando a Página de Listar Filmes do Dashboard
	@GetMapping("/dashboard/listMovie")
	public String listarProdutos(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista dos Produtos
		List<Produto> produto = serviceP.buscarTodosProdutos();
		model.addAttribute("lista", produto);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listMovie";
	}

	// Visualizando a Página de Adicionar Usuário do Dashboard
	@GetMapping("/dashboard/addUser")
	public String addUser() {
		return "addUser";
	}

	// Adicionando Usuário (POST)
	@PostMapping("/dashboard/addUser")
	public String salvarCliente(@ModelAttribute Cliente cliente, Model model) {
		// @ ModelAttribute vincula as informações do formulario a um objeto
		service.salvarCliente(cliente);
		// salva novamente (redundante) retorna o id do nosso cliente
		Long id = service.salvarCliente(cliente).getId();
		// mensagem para o usuario
		String mensagem = "Salvo com o id: " + id + " com sucesso!";
		// adicionando mensagem na resposta
		model.addAttribute(mensagem);
		return "redirect:listUser";
	}

	// Atualizando Usuário (POST)
	@PostMapping("/updateUser")
	public String atualizarCliente(@ModelAttribute Cliente cliente, RedirectAttributes attributes) {
		service.atualizarCliente(cliente);
		Long id = cliente.getId();
		attributes.addAttribute("message", "User com o Id: " + id + " foi atualizado!");
		return "redirect:listUser";
	}

	// Visualizando a Página de Editar Usuário
	@GetMapping("/dashboard/editUser")
	public String editarCliente(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page;
		try {
			Cliente cliente = service.buscarCliente(id);
			model.addAttribute("cliente", cliente);
			page = "editUser";
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:listUser";
		}
		return page;

	}

	// Visualizando a Página de Deletar Usuário
	@GetMapping("/dashboard/deleteUser")
	public String deletarCliente(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deletarCliente(id);
			attributes.addAttribute("message", "O Usuário foi deletado, id: " + id);
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listUser";
	}

	// Visualizando a Página de Listar Usuários do Dashboard
	@GetMapping("/dashboard/listUser")
	public String listarClientes(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista dos clientes
		List<Cliente> cliente = service.buscarTodosOsClientes();
		model.addAttribute("lista", cliente);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listUser";
	}

	// Visualizar a Página de Lista de Produtos do User
	@GetMapping("/home")
	public String visualizarProdutos(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista dos Produtos
		List<Produto> produto = serviceP.buscarTodosProdutos();
		model.addAttribute("lista", produto);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "homeCliente";
	}

}
