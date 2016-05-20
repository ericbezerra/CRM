package br.com.eric.crm.model;

public class Contato {
	private int id;
	private String telefone;
	private String celular;
	private String fax;
	private String email;
	private String site;
	
	public Contato() {
		
	}
	
	
	
	public Contato(int id, String telefone, String celular, String fax, String email, String site) {
		super();
		this.id = id;
		this.telefone = telefone;
		this.celular = celular;
		this.fax = fax;
		this.email = email;
		this.site = site;
	}



	public int getId() {
		return id;
	}



	public String getTelefone() {
		return telefone;
	}



	public String getCelular() {
		return celular;
	}



	public String getFax() {
		return fax;
	}



	public String getEmail() {
		return email;
	}



	public String getSite() {
		return site;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public void setFax(String fax) {
		this.fax = fax;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setSite(String site) {
		this.site = site;
	}
	
	
}
