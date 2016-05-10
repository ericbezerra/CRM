package br.com.eric.crm.model;

import java.util.Date;

public class Visita {
	private int id;
	private String descricao;
	private Date dataAbertura;
	private Date dataInicio;
	private Date dataPrevisao;
	private String usuarioOrigem;
	private int idSituacao;
	private int idCliente;
	private int idUsuario;
	
	public Visita() {
		
	}

	public Visita(int id, String descricao, Date dataAbertura, Date dataInicio, Date dataPrevisao, String usuarioOrigem,
			int idSituacao, int idCliente, int idUsuario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataInicio = dataInicio;
		this.dataPrevisao = dataPrevisao;
		this.usuarioOrigem = usuarioOrigem;
		this.idSituacao = idSituacao;
		this.idCliente = idCliente;
		this.idUsuario = idUsuario;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataPrevisao() {
		return dataPrevisao;
	}

	public String getUsuarioOrigem() {
		return usuarioOrigem;
	}

	public int getIdSituacao() {
		return idSituacao;
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

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataPrevisao(Date dataPrevisao) {
		this.dataPrevisao = dataPrevisao;
	}

	public void setUsuarioOrigem(String usuarioOrigem) {
		this.usuarioOrigem = usuarioOrigem;
	}

	public void setIdSituacao(int idSituacao) {
		this.idSituacao = idSituacao;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
