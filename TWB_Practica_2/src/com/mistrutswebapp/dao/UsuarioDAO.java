package com.mistrutswebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.mistrutswebapp.model.Usuario;

public class UsuarioDAO {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement prepStatement = null;
	private ResultSet results = null;
	private static final String DATASOURCE_NAME = "java:comp/env/jdbc/ConexionHSQLDS";
	private static final String INSERT_STATEMENT = "INSERT INTO Usuario " +
			"(user_ID,password,nombre,apellidos,fe_Nac, tfno,email, userType)" +
			" VALUES (?,?,?,?,?,?,?,?)"; 
	
	public void crearUsuario(Usuario usuario){
		try{
			getConnection();
			prepStatement= connection.prepareStatement(INSERT_STATEMENT);
			prepStatement.setString(0, usuario.getUser_ID());
			prepStatement.setString(1, usuario.getPassword());
			prepStatement.setString(2, usuario.getNombre());
			prepStatement.setString(3, usuario.getApellidos());
			java.sql.Date sqlDate = new java.sql.Date(usuario.getFe_Nac().getTime());
			prepStatement.setDate(4, sqlDate);
			prepStatement.setString(5,usuario.getTfno());
			prepStatement.setString(6, usuario.getEmail());
			prepStatement.setString(7, usuario.getUserType());
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			cleanUp();
		}
	}
	
	public Collection<Usuario> leerUsuarios(String whereClause){
		Collection<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			getConnection();
			Statement st = connection.createStatement();
			ResultSet results = st.executeQuery("SELECT * FROM Usuario " + whereClause);
			String user_ID = null;
			String password= null;
			String nombre= null;
			String apellidos= null;
			Date fe_Nac= null;
			String tfno= null;
			String email= null;
			String userType= null; 
			Usuario usuario = null;
			
			while (results.next()){
				user_ID = results.getNString(user_ID);
				password = results.getString(password);
				nombre= results.getString(nombre);
				apellidos = results.getString(apellidos);
				fe_Nac= results.getDate("fe_Nac");
				tfno=results.getString(tfno);
				email=results.getString(email);
				userType = results.getString(userType);
				usuario = new Usuario();
				usuario.setUser_ID(user_ID);
				usuario.setPassword(password);
				usuario.setNombre(nombre);
				usuario.setApellidos(apellidos);
				usuario.setFe_Nac(fe_Nac);
				usuario.setTfno(tfno);
				usuario.setEmail(email);
				usuario.setUserType(userType);
				usuarios.add(usuario);
				System.out.println("leido usuario -->"+user_ID);
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		   cleanUp();
		}
		
		
		return usuarios;
	}
	
	
	
	private void getConnection(){
		if(connection == null){
			try{
				Context initialContext = new InitialContext();
			    DataSource ds = (DataSource)initialContext.lookup(DATASOURCE_NAME);
			    connection = ds.getConnection();
			}catch(NamingException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	 }
	
	
	private void cleanUp(){
		 // nos aseguramos de cerrar results, statements , connections....
		 if(results != null){
			try{
				results.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			 results = null;
		 }
		 if(statement != null){
			try{
				statement.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			 statement = null;
		 }
		 if(prepStatement != null){
			try{
				prepStatement.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			prepStatement = null;
		 }
		 if(connection != null){
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			connection = null;
		 }
	}
}
