package interfaz;

public class venatana_principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Principal
     */
    public venatana_principal() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

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
        jLabel1.setBounds(150, 20, 159, 17);

        jLabel2.setText("Ingrese su usuario y contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 70, 190, 40);

        jTextField1.setText("Usuario");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 150, 210, 23);

        jTextField2.setText("Contraseña");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 190, 210, 23);

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 250, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -4, 460, 330);

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
        //</editor-fold>

        /* Create and display the form */
    	
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venatana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    	
    	
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venatana_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
