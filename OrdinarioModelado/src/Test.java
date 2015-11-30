import ventanas.Ventana;

public class Test {
	public static void main(String ... args) {
		Ventana v = new Ventana("puntos.txt");
		try {
			// Esperar 200 milisegundos para empezar la animación
			Thread.sleep(200);
			// Dibujar la figura
			v.dibujar(v.getFigura());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
