package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class agregar_huesped extends javax.swing.JFrame {

    
    public agregar_huesped() {
        initComponents();

        
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	String nombre=jTextField1.getText();
            	String cedula=jTextField2.getText();
            	check_in check_in=new check_in();
            	check_in.setVisible(true);
            	
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	
            	check_in check_in=new check_in();
            	check_in.setVisible(true);
            	
            }
        });

        setSize(490, 390);

    }

                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Agregar huésped:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 30, 130, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 100, 190, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 160, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Agregar");
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 240, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 290, 110, 30);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 110, 46, 17);

        jLabel3.setText("Cédula");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 170, 41, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
    }                       

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_huesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new agregar_huesped().setVisible(true);
        });
    }

                        
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
                      
}
