package swing;

import javax.swing.JFrame;

public class VentanaRegistro extends JFrame {
	
	private PanelRegistro panelRegistro = null;
	
	public VentanaRegistro() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Registro");
        this.setLocationRelativeTo(null);
        this.setLayout(new java.awt.GridBagLayout());
        this.iniciarComponentes();
        this.setVisible(true);
	}
	
	private void iniciarComponentes() {
		 java.awt.GridBagConstraints gridBagConstraints;
		this.panelRegistro = new PanelRegistro();
		
		this.panelRegistro.setBackground(new java.awt.Color(204, 204, 204));
		this.panelRegistro.setPreferredSize(new java.awt.Dimension(360, 322));
		this.panelRegistro.setLayout(new javax.swing.BoxLayout(this.panelRegistro, javax.swing.BoxLayout.LINE_AXIS));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 40, 40);
        this.add(this.panelRegistro, gridBagConstraints);
        this.pack();
	}
}
