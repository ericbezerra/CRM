package br.com.eric.crm.model;

public class Situacao {
	private int id;
	private int status;
	
	public Situacao() {
		
	}
	
	
	
	public Situacao(int id, int status) {
		super();
		this.id = id;
		this.status = status;
	}



	public int getId() {
		return id;
	}



	public int getStatus() {
		return status;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setStatus(int status) {
		this.status = status;
	}
	
}
