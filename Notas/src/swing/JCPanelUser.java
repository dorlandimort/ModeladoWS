package swing;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCPanelUser extends JPanel {
	
	private JCButton btnNext;
    private CLabel cLabel1;
    private JLabel jLabel1;
    private JLabel lbError;
    private JCTextField txtUser;
   
    public JCPanelUser() {
        initComponents();
        Dimension d = new Dimension(360,322);
        setSize(d);
        setVisible(true);
        btnNext.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lbError.setText("");
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtUser = new JCTextField();
        btnNext = new JCButton();
        jLabel1 = new JLabel();
        cLabel1 = new CLabel();
        lbError = new JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new java.awt.GridBagLayout());

        txtUser.setPlaceholder("Introduce tu nombre de usuario");
        txtUser.setPreferredSize(new java.awt.Dimension(278, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(28, 40, 7, 40);
        add(txtUser, gridBagConstraints);

        btnNext.setText("Siguiente");
        btnNext.setPreferredSize(new java.awt.Dimension(278, 40));
        btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(btnNext, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(71, 135, 237));
        jLabel1.setText("Registrarse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 25, 40);
        add(jLabel1, gridBagConstraints);

        cLabel1.setIcon(new ImageIcon(getClass().getResource("/res/ic_people.jpg")));
        cLabel1.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        add(cLabel1, gridBagConstraints);

        lbError.setForeground(new java.awt.Color(221, 75, 57));
        lbError.setText("Error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(lbError, gridBagConstraints);
    }

    
    public JButton getButtonNext()
    {
        return this.btnNext;
    }
    
    public String getUser()
    {
        return this.txtUser.getText();
    }
    
    public void showError(String value)
    {        
        lbError.setText(value);
    }

	public JCButton getBtnNext() {
		return btnNext;
	}

	public void setBtnNext(JCButton btnNext) {
		this.btnNext = btnNext;
	}

	public CLabel getcLabel1() {
		return cLabel1;
	}

	public void setcLabel1(CLabel cLabel1) {
		this.cLabel1 = cLabel1;
	}

	public JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public JLabel getLbError() {
		return lbError;
	}

	public void setLbError(JLabel lbError) {
		this.lbError = lbError;
	}

	public JCTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JCTextField txtUser) {
		this.txtUser = txtUser;
	}
    
    
}
