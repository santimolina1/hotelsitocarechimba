package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import controlador.controlador;

public class check_in extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    
    public check_in() {
        initComponents();

       

        setSize(490, 390);

    }

                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1=new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("CHECK-IN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 80, 156, 23);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresa tu nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 110, 220, 23);
        
        
        jTextField1.setBounds(170, 150, 190, 30);
        jPanel1.add(jTextField1);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 200, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Agregar huésped");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(90, 200, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 320);

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException { 
    	String nombre = jTextField1.getText();
    	control.checkIn(nombre);
    	new agregar_huesped().setVisible(true);}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
    	new ventana_usuario().setVisible(true);
    }
    

                      
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
                      
}
