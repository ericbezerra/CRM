package br.com.eric.crm.model;

public class Representante {
	private int id;
	private String nome;
	private String departamento;
	private int idContato;
	
	public Representante() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Representante(int id, String nome, String departamento, int idContato) {
		super();
		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
		this.idContato = idContato;
	}


	public int getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public String getDepartamento() {
		return departamento;
	}



	public int getIdContato() {
		return idContato;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	
	
}
