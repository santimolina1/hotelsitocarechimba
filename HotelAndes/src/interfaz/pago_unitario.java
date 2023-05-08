package interfaz;

import controlador.controlador;
import logica_.Consumo;
import logica_.Servicio;

public class pago_unitario extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    
    public pago_unitario() {
    	
        initComponents();
        setSize(490, 390);
    }
                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

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
        jButton3.setText("Pagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(170, 240, 110, 30);
        
        
        
        for (Consumo elemento : control.getConsumos()) {
        	jComboBox1.addItem(elemento.getNombre());
        }

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(120, 80, 210, 40);

        jRadioButton1.setText("Pagar online");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(120, 130, 150, 21);

        jRadioButton2.setText("Solicitar datafono al cuarto");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(120, 160, 190, 21);

        jRadioButton3.setText("Solicitar pago en efectivo");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(120, 190, 170, 21);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Pago unitario");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 30, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
    }                       

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new ventana_usuario().setVisible(true);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	String pedido=jComboBox1.getSelectedItem().toString();
    	Consumo cons=null;
    	for(Consumo i : control.getConsumos()) {
    		if(pedido.equals(i.getNombre())) {
    			cons=i;
    		}
    	}
    	cons.setPagado(true);
    }                                        
                    
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
                     
}