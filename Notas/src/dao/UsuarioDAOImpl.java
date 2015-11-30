package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entidades.Usuario;
import encriptacion.StringEncrypter;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	

	@Override
	public Usuario insertarUsuario(String usuario, String password, String rol) {
		DataSource ds = new DataSource("localhost/encriptar", "root", "toor");
		StringEncrypter e = new StringEncrypter();
		String usuarioE = e.encriptarCadena(usuario);
		String passE = e.encriptarCadena(password);
		String rolE = e.encriptarCadena(rol);
		Usuario usi = new Usuario();
		usi.setPassword(passE);
		usi.setUsuario(usuarioE);
		usi.setRol(rolE);
		String sql = "INSERT INTO usuario (usuario, password, rol) VALUES ('" + usuarioE + "', '" + passE + "', '" + rolE + "');"; 
		ds.executeUpdate(sql);
		return usi;
	}

	@Override
	public int eliminarUsuario(int id) {
		DataSource ds = new DataSource("localhost/encriptar", "root", "toor");
		String sql = "DELETE FROM usuario WHERE id=" + id;
		return ds.executeUpdate(sql);
	}

	@Override
	public ResultSet validar(String usuario, String password) {
		DataSource ds = new DataSource("localhost/encriptar", "root", "toor");
		String sql = "Select * from usuario WHERE usuario = '" + usuario + "' AND password = '" + password + ";";
		return ds.executeQuery(sql);
	}

	@Override
	public Usuario validarUsuario(String usuario) {
		Usuario user = new Usuario();
		DataSource ds = new DataSource("localhost/encriptar", "root", "toor");
		String sql = "Select * from usuario WHERE usuario = '" + usuario + "';";
		ResultSet rs = ds.executeQuery(sql);
		try {
			if (rs.next()) {
				try {
					user.setId(Integer.parseInt(rs.getString(1)));
					user.setUsuario(rs.getString(2));
					user.setRol(rs.getString(4));
					return user;
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Usuario validarPassword(String usuario, String password) {
		Usuario user = new Usuario();
		DataSource ds = new DataSource("localhost/encriptar", "root", "toor");
		String sql = "Select * from usuario WHERE usuario = '" + usuario + "' AND password = '" + password + "';";
		ResultSet rs = ds.executeQuery(sql);
		try {
			if (rs.next()) {
				try {
					user.setId(Integer.parseInt(rs.getString(1)));
					user.setUsuario(rs.getString(2));
					user.setRol(rs.getString(4));
					return user;
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

}
