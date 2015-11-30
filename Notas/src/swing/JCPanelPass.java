package swing;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCPanelPass extends JPanel {
	
	private JCButton btnPass;
    private JLabel cmdPrev;
    private JLabel jLabel4;
    private JLabel lbError;
    private JLabel lbMail;
    private CLabel lbPhoto;
    private JLabel lbUser;
    private JCPasswordField txtPass;
    
    public JCPanelPass() {
        initComponents();
        
       Dimension d = new Dimension(360,322);
       setSize(d);
       setVisible(true);
       lbError.setText("");
       cmdPrev.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       btnPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

   
    
   
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnPass = new JCButton();
        lbPhoto = new CLabel();
        txtPass = new JCPasswordField();
        lbUser = new javax.swing.JLabel();
        //lbMail = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmdPrev = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new java.awt.GridBagLayout());

        btnPass.setText("Iniciar sesión");
        btnPass.setPreferredSize(new java.awt.Dimension(278, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        add(btnPass, gridBagConstraints);

        lbPhoto.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        add(lbPhoto, gridBagConstraints);

        txtPass.setPlaceholder("Contraseña");
        txtPass.setPreferredSize(new java.awt.Dimension(278, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 40, 0, 40);
        add(txtPass, gridBagConstraints);

        lbUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(22, 22, 2));
        lbUser.setText("USUARIO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(lbUser, gridBagConstraints);

       /* lbMail.setForeground(new java.awt.Color(22, 22, 22));
        lbMail.setText("usuario@correo.com");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        add(lbMail, gridBagConstraints);
*/
        lbError.setForeground(new java.awt.Color(221, 75, 57));
        lbError.setText("error");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(lbError, gridBagConstraints);

        jLabel4.setForeground(new java.awt.Color(71, 135, 237));
        jLabel4.setText("Registrarse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 16, 40);
        add(jLabel4, gridBagConstraints);

        cmdPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic_arrow.png")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        add(cmdPrev, gridBagConstraints);
    }
    
    public JButton getButtonPass()
    {
        return this.btnPass;
    }
    
    public JLabel getCommand()
    {
        return this.cmdPrev;
    }
    
    public String getPassword()
    {
        return this.txtPass.getText();
    }
    
    public void showError(String value)
    {        
        lbError.setText(value);
    }
     
    public void setPhoto(String icono)
    {
        this.lbPhoto.setIcon(new ImageIcon(getClass().getResource(icono)));
    } 
    
    public void setMail(String mail)
    {
        this.lbMail.setText(mail);
    }
    
    public void setUser(String name)
    {
        this.lbUser.setText(name);
        txtPass.setText("");
    }




	public JCButton getBtnPass() {
		return btnPass;
	}




	public void setBtnPass(JCButton btnPass) {
		this.btnPass = btnPass;
	}




	public JLabel getCmdPrev() {
		return cmdPrev;
	}




	public void setCmdPrev(JLabel cmdPrev) {
		this.cmdPrev = cmdPrev;
	}




	public JLabel getjLabel4() {
		return jLabel4;
	}




	public void setjLabel4(JLabel jLabel4) {
		this.jLabel4 = jLabel4;
	}




	public JLabel getLbError() {
		return lbError;
	}




	public void setLbError(JLabel lbError) {
		this.lbError = lbError;
	}




	public JLabel getLbMail() {
		return lbMail;
	}




	public void setLbMail(JLabel lbMail) {
		this.lbMail = lbMail;
	}




	public CLabel getLbPhoto() {
		return lbPhoto;
	}




	public void setLbPhoto(CLabel lbPhoto) {
		this.lbPhoto = lbPhoto;
	}




	public JLabel getLbUser() {
		return lbUser;
	}




	public void setLbUser(JLabel lbUser) {
		this.lbUser = lbUser;
	}




	public JCPasswordField getTxtPass() {
		return txtPass;
	}




	public void setTxtPass(JCPasswordField txtPass) {
		this.txtPass = txtPass;
	}
    
    
}
