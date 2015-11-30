package Entidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import encriptacion.StringEncrypter;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;
	private String rol;
	
	public static boolean validarUsuario(String usuario, String password) {
		UsuarioDAO dao = new UsuarioDAOImpl();
		ResultSet result = dao.validar(usuario, password);
		try {
			if (result.next())
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static Usuario validarUsuario(String usuario) {
		UsuarioDAO dao = new UsuarioDAOImpl();
		return dao.validarUsuario(usuario);
	}
	
	public static Usuario validarPassword(String usuario, String password) {
		UsuarioDAO dao = new UsuarioDAOImpl();
		//String pass = StringEncrypter.encriptarCadena(password);
		return dao.validarPassword(usuario, password);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	

}
