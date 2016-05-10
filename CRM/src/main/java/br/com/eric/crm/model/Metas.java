package br.com.eric.crm.model;

public class Metas {
	private int id;
	private float valor;
	private String produto;
	private String servico;
	
	public Metas() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Metas(int id, float valor, String produto, String servico) {
		super();
		this.id = id;
		this.valor = valor;
		this.produto = produto;
		this.servico = servico;
	}



	public int getId() {
		return id;
	}



	public float getValor() {
		return valor;
	}



	public String getProduto() {
		return produto;
	}



	public String getServico() {
		return servico;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public void setProduto(String produto) {
		this.produto = produto;
	}



	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
}
