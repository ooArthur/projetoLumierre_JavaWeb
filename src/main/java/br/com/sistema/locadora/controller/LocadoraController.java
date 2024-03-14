package br.com.sistema.locadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.locadora.sistema.exception.LocadoraNotFoundException;
import br.com.locadora.sistema.model.Cliente;
import br.com.locadora.sistema.service.IClienteService;

@Controller
@RequestMapping("/locadora")
public class LocadoraController {

	@Autowired
	private IClienteService service;

	@Autowired
	private IFilmeService service;
	
	@Autowired
	private ISerieService service;
	
	@GetMapping("/")
	public String paginaInicial() {
		return "paginaInicial";		
		
	}

	@GetMapping("/adicionar")
	public String adicionarCliente() {
		return "adicionarCliente";
	}

	@GetMapping("/adicionar")
	public String adicionarFilme() {
		return "adicionarFilme";
	}

	@GetMapping("/adicionar")
	public String adicionarSerie() {
		return "adicionarSerie";
	}


		@PostMapping("/adicionar")
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

		@PostMapping("/adicionar")
		public String salvarFilme(@ModelAttribute Filme filme, Model model) {
		// @ ModelAttribute vincula as informações do formulario a um objeto
		service.salvarFilme(filme);
		// salva novamente (redundante) retorna o id do nosso filme
		Long id = service.salvarFilme(filme).getId();
		// mensagem para o usuario
		String mensagem = "Salvo com o id: " + id + " com sucesso!";
		// adicionando mensagem na resposta
		model.addAttribute(mensagem);
		return "redirect:listar";
		}

		@PostMapping("/adicionar")
		public String salvarSerie(@ModelAttribute Serie serie, Model model) {
		// @ ModelAttribute vincula as informações do formulario a um objeto
		service.salvarSerie(serie);
		// salva novamente (redundante) retorna o id do nosso filme
		Long id = service.salvarSerie(serie).getId();
		// mensagem para o usuario
		String mensagem = "Salvo com o id: " + id + " com sucesso!";
		// adicionando mensagem na resposta
		model.addAttribute(mensagem);
		return "redirect:listar";
		}


	@PostMapping("/atualizar")
	public String atualizarCliente(@ModelAttribute Cliente cliente, RedirectAttributes attributes) {
	service.atualizarCliente(cliente);
	Long id = cliente.getId();
	attributes.addAttribute("message", "Cliente com o Id: " + id + " foi atualizado!");
	return "redirect:listar";
	}

	@PostMapping("/atualizar")
	public String atualizarFilme(@ModelAttribute Filme filme, RedirectAttributes attributes) {
	service.atualizarFilme(filme);
	Long id = filme.getId();
	attributes.addAttribute("message", "Filme com o Id: " + id + " foi atualizado!");
	return "redirect:listar";
	}

	@PostMapping("/atualizar")
	public String atualizarSerie(@ModelAttribute Serie serie, RedirectAttributes attributes) {
	service.atualizarSerie(serie);
	Long id = serie.getId();
	attributes.addAttribute("message", "Serie com o Id: " + id + " foi atualizado!");
	return "redirect:listar";
	}


		@GetMapping("/editar")
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


		@GetMapping("/editar")
		public String editarFilme(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page;
		try {
			Filme filme = service.buscarFilme(id);
			model.addAttribute("filme", filme);
			page = "editarFilme";
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:listar";
		}
		return page;

	}


		public String editarSerie(Model model, RedirectAttributes attributes, @RequestParam Long id) {
		String page;
		try {
			Serie serie = service.buscarSerie(id);
			model.addAttribute("serie", serie);
			page = "editarSerie";
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:listar";
		}
		return page;

	}


	@GetMapping("/deletar")
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

	@GetMapping("/deletar")
	public String deletarFilme(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deletarFilme(id);
			attributes.addAttribute("message", "O Filme foi deletado, id: " + id);
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listar";
	}


	@GetMapping("/deletar")
	public String deletarSerie(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deletarSerie(id);
			attributes.addAttribute("message", "O Serie foi deletado, id: " + id);
		} catch (LocadoraNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listar";
	}


	@GetMapping("/listar")
	public String listarCliente(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista dos clientes
		List<Cliente> cliente = service.buscarTodosOsCliente();
		model.addAttribute("lista", cliente);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listarClientes";
	}


	@GetMapping("/listar")
	public String listarFilme(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista dos filmes
		List<Filme> filme = service.buscarTodosOsFilme();
		model.addAttribute("lista", filme);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listarFilmes";
	}

	@GetMapping("/listar")
	public String listarSerie(@RequestParam(value = "message", required = false) String message, Model model) {
		// /user/lista? message=hello%world
		// lista das Series
		List<Serie> serie = service.buscarTodasAsSeries();
		model.addAttribute("lista", filme);
		// mensagem caso exista
		model.addAttribute("messagem", message);
		return "listarSeries";
	}
	
	
}
