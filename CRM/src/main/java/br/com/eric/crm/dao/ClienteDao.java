package br.com.eric.crm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.eric.crm.model.Cliente;

@Repository
public class ClienteDao {
	private final Connection connection;
	
	@Autowired
	public ClienteDao(DataSource dataSource){
		try{
			this.connection = dataSource.getConnection();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void create() {

	}
	
	public List<Cliente> read() {
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			String sql = "select * from cliente";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				clientes.add(popular(rs));
			}
			
			rs.close();
			stmt.close();

			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public void update(){
		
	}
	
	public void delete(){
		
	}
	
	private Cliente popular(ResultSet rs) throws SQLException{
		Cliente cliente = new Cliente();
		
		cliente.setId(rs.getInt("id"));
		cliente.setCnpj(rs.getString(rs.getString("cnpj")));
		cliente.setRazaoSocial(rs.getString("razao_social"));
		cliente.setNomeFantasia(rs.getString("nome_fantasia"));
		cliente.setInscricaoEstadual(rs.getString("inscricao_estadual"));
		cliente.setInscricaoMunicipal(rs.getString("inscricao_municipal"));
		cliente.setIdEndereco(rs.getInt("id_endereco"));
		cliente.setIdContato(rs.getInt("id_contato"));
		cliente.setIdRepresentante(rs.getInt("id_representante"));
		
		return cliente;
	}
	
}
