package br.com.eric.crm.model;

import java.util.Date;

public class Cliente {
	private int id;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private Date dataCadastro;
	private Date dataAlteracao;
	private int idEndereco;
	private int idContato;
	private int idRepresentante;


	public int getId() {
		return id;
	}



	public String getCnpj() {
		return cnpj;
	}



	public String getRazaoSocial() {
		return razaoSocial;
	}



	public String getNomeFantasia() {
		return nomeFantasia;
	}



	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}



	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}



	public Date getDataCadastro() {
		return dataCadastro;
	}



	public Date getDataAlteracao() {
		return dataAlteracao;
	}



	public int getIdEndereco() {
		return idEndereco;
	}



	public int getIdContato() {
		return idContato;
	}



	public int getIdRepresentante() {
		return idRepresentante;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}



	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}



	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}



	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}



	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}



	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}



	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}



	public void setIdRepresentante(int idRepresentante) {
		this.idRepresentante = idRepresentante;
	}
	
}
