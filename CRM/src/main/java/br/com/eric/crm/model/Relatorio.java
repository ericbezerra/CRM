package br.com.eric.crm.model;

public class Relatorio {
	private int id;
	private int idMeta;
	private int idVenda;
	private int idUsuario;
	
	public Relatorio() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Relatorio(int id, int idMeta, int idVenda, int idUsuario) {
		super();
		this.id = id;
		this.idMeta = idMeta;
		this.idVenda = idVenda;
		this.idUsuario = idUsuario;
	}

	public int getId() {
		return id;
	}



	public int getIdMeta() {
		return idMeta;
	}



	public int getIdVenda() {
		return idVenda;
	}



	public int getIdUsuario() {
		return idUsuario;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setIdMeta(int idMeta) {
		this.idMeta = idMeta;
	}



	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
