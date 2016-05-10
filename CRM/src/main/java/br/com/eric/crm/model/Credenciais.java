package br.com.eric.crm.model;

public class Credenciais {
	private long id;
	private String login;
	private String senha;
	private long idUsuario;
	
	
	
	public long getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
