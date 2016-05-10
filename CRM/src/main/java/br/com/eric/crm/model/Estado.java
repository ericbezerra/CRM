package br.com.eric.crm.model;

public class Estado {
	private int id;
	private String uf;
	private String nome;
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Estado(int id, String uf, String nome) {
		super();
		this.id = id;
		this.uf = uf;
		this.nome = nome;
	}


	public int getId() {
		return id;
	}



	public String getUf() {
		return uf;
	}



	public String getNome() {
		return nome;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
