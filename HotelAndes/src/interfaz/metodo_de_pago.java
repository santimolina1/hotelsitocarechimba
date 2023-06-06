package interfaz;

import logica_.Consumo;

public class metodo_de_pago extends javax.swing.JFrame {
	private Consumo c;
    public metodo_de_pago(Consumo c) {
        initComponents();
        this.c=c;
    }

                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Por favor, seleccione el método de pago.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 450, 40);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Volver");
        //jButton1.setActionCommand("Volver");
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 310, 110, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverActionPerformed(evt);
            }
        });
        

        jButton2.setText("PayPal");
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 160, 130, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	payPalActionPerformed(evt);
            }
        });
        

        jButton4.setText("Master Card");
        jPanel1.add(jButton4);
        jButton4.setBounds(280, 230, 130, 30);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	tarjetaMActionPerformed(evt);
            }
        });

        jButton5.setText("Visa");
        jPanel1.add(jButton5);
        jButton5.setBounds(70, 230, 130, 30);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	tarjetaVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }
    public static void main(String args[]) {
        
            new metodo_de_pago(null).setVisible(true);
        
    }
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	//new ventana_usuario().setVisible(true);
    }
    private void payPalActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new metodo_Paypal(c).setVisible(true);
    }
    private void tarjetaMActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new metodo_credito(c,"master").setVisible(true);
    }
    private void tarjetaVActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new metodo_credito(c,"visa").setVisible(true);
    }

                        
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
                      
}
