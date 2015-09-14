import javax.swing.JFrame;

public class Test {

	public static void main(String ... args) {
		Ventana v = new Ventana();
		v.setSize(1024, 768);
		v.setTitle("Modelado por Computadora");
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
	}
}
