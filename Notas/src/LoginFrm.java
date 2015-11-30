
import swing.JCSlidePanel;
import swing.VentanaRegistro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidades.Usuario;

public class LoginFrm extends JFrame {
    
    private Usuario user;
    
    private JCSlidePanel jCSlidePanel1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    
   
    public LoginFrm() {
        initComponents();
        
        setTitle("Iniciar sesión");
        setLocationRelativeTo(null);
        
        //acciones para el slider ------------------------------------------     
        //boton "validar usuario"
        jCSlidePanel1.userPanel.getButtonNext().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {     
                        //realiza autenticacion de nick de usuario
                    	if (! jCSlidePanel1.userPanel.getTxtUser().getText().equals("")) {
                    		user = Usuario.validarUsuario(jCSlidePanel1.userPanel.getTxtUser().getText());
                    		if ( user != null ) {
                    			jCSlidePanel1.userPanel.showError("");
                                jCSlidePanel1.passPanel.showError("");                            
                                jCSlidePanel1.passPanel.setPhoto("/res/ic_people.jpg");
                                jCSlidePanel1.passPanel.setUser(user.getUsuario());
                                //jCSlidePanel1.passPanel.setMail(user);
                                jCSlidePanel1.moveLeft();
                    		} else {
                    			jCSlidePanel1.userPanel.showError("Usuario incorrecto");
                    		}
                    	}
                        
                    }
                });
        
        //validar password
        jCSlidePanel1.passPanel.getButtonPass().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(final ActionEvent e) {   
                    	
                    	if (! jCSlidePanel1.passPanel.getTxtPass().getText().equals("")) { 
                    		Usuario usuario = Usuario.validarPassword(user.getUsuario(), jCSlidePanel1.passPanel.getTxtPass().getText());
                    		if (usuario != null) {
                    			dispose();
                    			new VentanaNotas(usuario);
                    		} else
                    			jCSlidePanel1.passPanel.showError("Password incorrecto");
                    	}
                    }
                });
        
        jCSlidePanel1.userPanel.getjLabel1().addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				new VentanaRegistro();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        //retroceed a panel USUARIO
        jCSlidePanel1.passPanel.getCommand().addMouseListener( new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {               
                jCSlidePanel1.moveRight();
            }

            @Override
            public void mousePressed(MouseEvent e) {/*...*/}

            @Override
            public void mouseReleased(MouseEvent e) {/*...*/}

            @Override
            public void mouseEntered(MouseEvent e) {/*...*/}

            @Override
            public void mouseExited(MouseEvent e) {/*...*/}
            
        });
    }

   
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCSlidePanel1 = new swing.JCSlidePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 322));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jCSlidePanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 40, 40);
        jPanel2.add(jPanel1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel1.setForeground(new java.awt.Color(85, 85, 85));
        jLabel1.setText("Notas Secretas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel2.setForeground(new java.awt.Color(85, 85, 85));
        jLabel2.setText("iniciar sesión para comenzar a ganarse el pan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        getContentPane().add(jPanel2);
        
        

        pack();
    }
   
}
