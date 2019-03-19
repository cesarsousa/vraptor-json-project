package br.com.caelum.vraptor.model;

public class Cliente {

	private String nome;
	private Endereco endereco;
	private Contato contato;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, Endereco endereco, Contato contato) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
