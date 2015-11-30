package dao;

import java.util.List;

import Entidades.Nota;

public interface NotaDAO {
	
	public List<Nota> obtenerNotas();
	
	public Nota insertarNota(String titulo, String contenido, int usuario_id);
	
	public Nota eliminarNota(int id);

}
