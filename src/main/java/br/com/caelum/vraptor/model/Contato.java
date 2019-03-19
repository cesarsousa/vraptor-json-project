package br.com.caelum.vraptor.model;

import java.util.List;

public class Contato {
	
	private String email;
	
	private List<Telefone> telefones;
	
	
	public Contato() {
		super();
	}
	
	public Contato(String email, List<Telefone> telefones) {
		super();
		this.email = email;
		this.telefones = telefones;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
}
