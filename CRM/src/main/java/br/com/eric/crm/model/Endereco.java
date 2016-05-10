package br.com.eric.crm.model;

public class Endereco {
	private int id;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private int idCidade;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Endereco(int id, String cep, String logradouro, String numero, String complemento, String bairro,
			int idCidade) {
		super();
		this.id = id;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.idCidade = idCidade;
	}


	public int getId() {
		return id;
	}



	public String getCep() {
		return cep;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public String getNumero() {
		return numero;
	}



	public String getComplemento() {
		return complemento;
	}



	public String getBairro() {
		return bairro;
	}



	public int getIdCidade() {
		return idCidade;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	
	
}
