package br.com.eric.crm.model;

public class Vendas {
	private int id;
	private String descricao;
	private int idCliente;
	private int idUsuario;
	
	public Vendas() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Vendas(int id, String descricao, int idCliente, int idUsuario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.idCliente = idCliente;
		this.idUsuario = idUsuario;
	}



	public int getId() {
		return id;
	}



	public String getDescricao() {
		return descricao;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public int getIdUsuario() {
		return idUsuario;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
