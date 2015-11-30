import javax.swing.JFrame;

import Entidades.Usuario;


public class VentanaNotas extends JFrame {
	
	public VentanaNotas(Usuario usuario) {
		this.setTitle("Notas Secretas");
		this.setSize(900, 700);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
