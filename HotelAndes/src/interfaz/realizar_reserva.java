package interfaz;

public class realizar_reserva extends javax.swing.JFrame {

    /**
     * Creates new form Realizar_Reserva
     */
    public realizar_reserva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Datos de reserva:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 130, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 60, 190, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 100, 190, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 140, 190, 30);

        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 180, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Ingresar");
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 240, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 290, 110, 30);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 46, 17);

        jLabel3.setText("# Acompañantes");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 98, 17);

        jLabel4.setText("Fecha Inicio");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 150, 80, 17);

        jLabel5.setText("Fecha salida");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 74, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(realizar_reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new realizar_reserva().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}
