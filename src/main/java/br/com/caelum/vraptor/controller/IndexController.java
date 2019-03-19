package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Cliente;
import br.com.caelum.vraptor.model.Contato;
import br.com.caelum.vraptor.model.Endereco;
import br.com.caelum.vraptor.model.Telefone;

import static br.com.caelum.vraptor.view.Results.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		result.include("variable", "VRaptor!");
	}
	
	
	@Consumes(value="application/json")
	@Get("/cadastrar/{tipoPessoa}")
	public void cadastrarCliente(Cliente cliente, String tipoPessoa) {
		
		//mock(cliente);
		
		result.use(json()).from(cliente)
		.include("endereco")
		.include("contato", "contato.telefones")
		.serialize();
		
		
	}

	private void mock(Cliente cliente) {
		
		cliente.setEndereco(new Endereco("rua do pargos"));
		
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(new Telefone("21", "99999999"));
		telefones.add(new Telefone("22", "88888888"));
		
		Contato contato = new Contato("email@email.com", telefones);
		cliente.setContato(contato);
		
		
	}
	
	
}