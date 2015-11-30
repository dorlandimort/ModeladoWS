package dao;

import java.sql.ResultSet;

import Entidades.Usuario;

public interface UsuarioDAO {
	
	public Usuario insertarUsuario(String usuario, String password, String rol);
	
	public int eliminarUsuario(int id);
	
	public ResultSet validar(String usuario, String password);
	
	public Usuario validarUsuario(String usuario);
	
	public Usuario validarPassword(String usuario, String password);

}
