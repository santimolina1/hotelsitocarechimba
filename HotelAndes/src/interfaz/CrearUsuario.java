package interfaz;

import java.io.IOException;

import consola.Hotel;

public class CrearUsuario  extends javax.swing.JFrame {

	private javax.swing.JButton botonIngresar;
	private javax.swing.JButton volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuarioField;
    private javax.swing.JTextField contraseñaField;
    
    public CrearUsuario() {
        initComponents();
        setSize(490, 390);
    }

    
    private void initComponents() {
    	
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        contraseñaField = new javax.swing.JTextField();
        botonIngresar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Andes. Pagina Principal");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(440, 310));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Bienvenido a Hotel Andes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 40, 200, 40);

        jLabel2.setText("Ingrese su usuario y contraseña nuevos:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 70, 190, 40);

        usuarioField.setText("Usuario");
        
        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioField);
        usuarioField.setBounds(120, 150, 210, 23);

        contraseñaField.setText("Contraseña");
        jPanel1.add(contraseñaField);
        contraseñaField.setBounds(120, 190, 210, 23);

        botonIngresar.setBackground(new java.awt.Color(255, 249, 132));
        botonIngresar.setText("Crear Usuario");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					botonIngresarActionPerformed(evt);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(botonIngresar);
        botonIngresar.setBounds(170, 250, 110, 30);
        
        volver.setBackground(new java.awt.Color(255, 249, 132));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver);
        volver.setBounds(340, 290, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -4, 460, 330);

        pack();
    }   
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) { 
    	new venatana_principal().setVisible(true);
    	
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	String nombreUsuario= usuarioField.getText();
    	String contraseñaU= contraseñaField.getText();
    	Hotel hotel= Hotel.getInstance();
    	String desicion=hotel.crearUsuario(nombreUsuario, contraseñaU);
    	System.out.println(desicion);
		
		if (desicion.equals("")) {
			new venatana_principal().setVisible(true);
			
		}
		else {
			UsuarioCreadoExito ventana = new UsuarioCreadoExito(null);
	        ventana.setVisible(true);
		}
    }                                        

    
            
}
