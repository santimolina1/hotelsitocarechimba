package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import controlador.controlador;

public class ingresar_datos extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    
    public ingresar_datos() {
        initComponents();

        
     

        setSize(490, 390);

    }

                           
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Ingresa tus datos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 130, 20);

        jTextField1.setText("Nombre");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(140, 60, 190, 30);

        jTextField2.setText("Número de identificación");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(140, 100, 190, 30);

        jTextField3.setText("Celular");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(140, 140, 190, 30);

        jTextField4.setText("Correo electrónico");
        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(140, 180, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Ingresar");
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 240, 110, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					botonIngresarActionPerformed(evt);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
            }
        });

        

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 290, 110, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
        
    }
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
    	 String nombreUsuario = jTextField1.getText();
         String documento = jTextField2.getText();
         String celular = jTextField3.getText();
         String correo = jTextField4.getText();
         
         
         boolean valor=control.ingresarDatos(nombreUsuario, documento, correo, celular);
         new ventana_usuario().setVisible(true);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	new ventana_usuario().setVisible(true);
    } 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
                     
}
