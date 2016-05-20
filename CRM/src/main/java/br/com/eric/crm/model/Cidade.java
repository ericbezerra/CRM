package br.com.eric.crm.model;

public class Cidade {
	private int id;
	private int idEstado;
	private String uf;
	private String nome;
	
	public Cidade() {

	}
	
	
	
	public Cidade(int id, int idEstado, String uf, String nome) {
		super();
		this.id = id;
		this.idEstado = idEstado;
		this.uf = uf;
		this.nome = nome;
	}



	public int getId() {
		return id;
	}



	public int getIdEstado() {
		return idEstado;
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



	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
