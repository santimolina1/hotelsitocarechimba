package interfaz;

public class metodo_credito extends javax.swing.JPanel {

    /**
     * Creates new form metodo_credito
     */
    public metodo_credito() {
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

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Ingresa tus datos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 130, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 60, 190, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 100, 190, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 140, 190, 30);

        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(210, 180, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Confirmar");
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 240, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 290, 110, 30);

        jLabel2.setText("Número Tarjeta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 88, 17);

        jLabel3.setText("Cédula Propietario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 110, 17);

        jLabel4.setText("Código de Seguridad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 150, 123, 17);

        jLabel5.setText("Fecha Vencimiento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 110, 17);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);
    }// </editor-fold>                        

    public static void main(String args[]) {
    	new metodo_credito().setVisible(true);
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
