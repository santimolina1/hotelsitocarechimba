package interfaz;

import javax.swing.ImageIcon;

public class error_carga extends javax.swing.JFrame {

    public error_carga() {
        initComponents();
        setSize(490, 390);
    }

                           
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(212, 227, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Error en la carga de datos");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 180, 190, 60);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Volver");
        jPanel2.add(jButton1);
        jButton1.setBounds(180, 250, 110, 30);

        jLabel2.setIcon(new ImageIcon("./img/disgusto.jpg")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 90, 100, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 458, 329);

        pack();
    }                    
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
                   
}
