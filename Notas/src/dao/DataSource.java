package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.mysql.jdbc.jdbc2.optional.ConnectionWrapper;

public class DataSource {
	
	private Connection connection = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	 
	public DataSource(String host, String user, String pass){
		//1. Registrar el Driver
		//2. Crear la Conexion
		
		 try{
	         //obtenemos el driver de para mysql
	         Class.forName("com.mysql.jdbc.Driver");
	         //obtenemos la conexión
	         connection = 
	        		 DriverManager.getConnection("jdbc:mysql://" + host + "?", user, pass);
	 
	         if (connection != null){
	            System.out.println("Conexión a base de datos " + host + " OK\n");
	         }
	      }
	      catch(SQLException e){
	         System.out.println(e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }catch(Exception e){
	         System.out.println(e);
	      }
	   }
	
	
	public ResultSet executeQuery(String sql) {
		
		try {
			this.stmt = this.connection.createStatement();
			this.rs = this.stmt.executeQuery(sql);
		
			
		}catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		return this.rs;
	}
	
	public int executeUpdate(String sql) {
		try {
			this.stmt = connection.createStatement();
			return this.stmt.executeUpdate(sql);
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return -1;
	}
	
}