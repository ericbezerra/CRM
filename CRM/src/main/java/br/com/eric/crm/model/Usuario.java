package br.com.eric.crm.model;

import java.util.Date;

public class Usuario {
	private int id;
	private String cpf;
	private String nome;
	private Date dataCadastro;
	private Date dataAlteracao;
	private int idGrupo;
	private int idContato;
	private int idEndereco;
	private int idCredenciais;

	public Usuario() {
		
	}

	public Usuario(int id, String cpf, String nome, Date dataCadastro, Date dataAlteracao, int idGrupo, int idContato,
			int idEndereco, int idCredenciais) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.dataAlteracao = dataAlteracao;
		this.idGrupo = idGrupo;
		this.idContato = idContato;
		this.idEndereco = idEndereco;
		this.idCredenciais = idCredenciais;
	}

	public int getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public int getIdContato() {
		return idContato;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public int getIdCredenciais() {
		return idCredenciais;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public void setIdCredenciais(int idCredenciais) {
		this.idCredenciais = idCredenciais;
	}

}
