package dao;

import java.util.List;

import Entidades.Nota;
import encriptacion.StringEncrypter;

public class NotaDAOImpl implements NotaDAO {

	@Override
	public List<Nota> obtenerNotas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nota insertarNota(String titulo, String contenido, int usuario_id) {
		StringEncrypter e = new StringEncrypter();
		DataSource ds = new DataSource("encriptar", "root", "toor");
		String tituloE = e.encriptarCadena(titulo);
		String contenidoE = e.encriptarCadena(contenido);
		Nota n = new Nota();
		n.setTitulo(tituloE);
		n.setContenido(contenidoE);
		n.setUsuario_id(usuario_id);
		String sql = "INSERT INTO nota (titulo, contenido, usuario_id)";
		ds.executeUpdate(sql);
		return null;
	}

	@Override
	public Nota eliminarNota(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
