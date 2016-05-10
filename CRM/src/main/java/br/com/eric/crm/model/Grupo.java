package br.com.eric.crm.model;

public class Grupo {
	private int id;
	private String cargo;
	
	public Grupo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Grupo(int id, String cargo) {
		super();
		this.id = id;
		this.cargo = cargo;
	}



	public int getId() {
		return id;
	}



	public String getCargo() {
		return cargo;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
