package interfaz;

import java.io.IOException;

import javax.swing.ImageIcon;

public class solicitar_servicio extends javax.swing.JFrame {

    public solicitar_servicio() {
        initComponents();
        setSize(490, 390);
    }

 
                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        platosb = new javax.swing.JButton();
        bebidas = new javax.swing.JButton();
        spa = new javax.swing.JButton();
        guia = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 249, 133));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("¿Qué deseas ordenar?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 360, 30);

        platosb.setBackground(new java.awt.Color(255, 249, 133));
        platosb.setText("Platos");
        jPanel1.add(platosb);
        platosb.setBounds(90, 140, 110, 30);
        platosb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					platosbActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        bebidas.setBackground(new java.awt.Color(255, 249, 133));
        bebidas.setText("Bebidas");
        jPanel1.add(bebidas);
        bebidas.setBounds(270, 140, 110, 30);
        bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					bebidasActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        spa.setBackground(new java.awt.Color(255, 249, 133));
        spa.setText("Spa");
        jPanel1.add(spa);
        spa.setBounds(90, 250, 110, 30);
        spa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					spaActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        guia.setBackground(new java.awt.Color(255, 249, 133));
        guia.setText("Guia turistico");
        guia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					guiaActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(guia);
        guia.setBounds(270, 250, 110, 30);

        volver.setBackground(new java.awt.Color(255, 249, 133));
        volver.setText("Volver");
        jPanel1.add(volver);
        volver.setBounds(330, 10, 110, 30);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new ImageIcon("./img/spa.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 160, 90, 100);

        jLabel4.setIcon(new ImageIcon("./img/plato.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 60, 80, 80);

        jLabel5.setIcon(new ImageIcon("./img/bebidas-sin-alcohol.jpg")); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 60, 60, 70);

        jLabel6.setIcon(new ImageIcon("./img/turismo.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 180, 80, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 320);

        pack();
    }                   

    private void platosbActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	new plato().setVisible(true);
    }   
    private void bebidasActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	new bebida().setVisible(true);
    }
    private void spaActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	 new spa().setVisible(true);
    }
    private void guiaActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	new turismo().setVisible(true);
    }
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new ventana_usuario().setVisible(true);
    }

                    
    private javax.swing.JButton platosb;
    private javax.swing.JButton bebidas;
    private javax.swing.JButton spa;
    private javax.swing.JButton guia;
    private javax.swing.JButton volver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
                    
}
