import java.awt.Dimension;

import javax.swing.JPanel;


public class PanelEdicion extends JPanel {
	
	private int tamano = 0;
	
	public PanelEdicion(int n) {
		this.tamano = n;
	}
	
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(560, (this.tamano + 2) * 30);
    }

}
