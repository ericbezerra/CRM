package br.com.eric.crm.dao;

public class CredenciaisDao {

	public CredenciaisDao() {
		
	}
	
	public void create() {
		String sql = "insert into credenciais (login, senha, idUsuario) values(?,?,?)";
		System.out.println(sql);
	}
	
	public void read() {
		String sql = "select * from credenciais";
		System.out.println(sql);
	}
	
	public void update() {
		String sql = "update credenciais set login=?, senha=? where id=?";
		System.out.println(sql);
	}
	
	public void delete() {
		String sql = "delete from credenciais where id=?";
		System.out.println(sql);
	}
	
}
