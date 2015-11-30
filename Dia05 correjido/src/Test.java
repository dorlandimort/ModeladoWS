import javax.swing.JFrame;


public class Test {
	
	public static void main(String ... args) {
		Ventana ventana = new Ventana();
		ventana.setSize(1280, 768);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
}