package interfaz;

import java.util.ArrayList;

public class lista_habitaciones extends javax.swing.JFrame {

    /**
     * Creates new form lista_habitaciones
     */
    public lista_habitaciones(ArrayList<String>disponibles,String fechaInicio,String fechaFin ) {
        initComponents(disponibles,fechaInicio,fechaFin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(ArrayList<String>disponibles,String fechaInicio,String fechaFin) {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(440, 310));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 290, 110, 30);

        jButton3.setBackground(new java.awt.Color(255, 249, 132));
        jButton3.setText("Ver información de la habitación");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,fechaInicio,fechaFin,disponibles);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(110, 220, 240, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(disponibles.toArray(new String[0])));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(110, 120, 240, 50);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Lista de habitaciones");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 40, 190, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 340);

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        habitaciones_disponibles dispo=new habitaciones_disponibles();
        dispo.setVisible(true);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt,String fechaInicio,String fechaFin,ArrayList<String>disponibles) {                                         
    	String id =  (String) jComboBox1.getSelectedItem();
    	info_habitacion info=new info_habitacion(id,fechaInicio,fechaFin,disponibles);
    	info.setVisible(true);
    }                                        

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
