package interfaz;

public class cancelar_reserva extends javax.swing.JFrame {

	
	public cancelar_reserva() {
		initComponents();
		setSize(490, 390);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		jPanel1.setBackground(new java.awt.Color(212, 227, 252));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel1.setLayout(null);

		jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
		jLabel1.setText("Esperamos que hayas disfrutado tu estadia. ");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(50, 20, 370, 70);

		jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
		jLabel2.setText("Ingresa tu nombre para obtener");
		jLabel2.setToolTipText("");
		jPanel1.add(jLabel2);
		jLabel2.setBounds(90, 70, 300, 60);

		jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
		jLabel3.setText("la factura final.");
		jPanel1.add(jLabel3);
		jLabel3.setBounds(160, 120, 130, 30);
		

		jTextField1.setText("Nombre");
		jPanel1.add(jTextField1);
		jTextField1.setBounds(130, 180, 200, 30);

		jButton1.setBackground(new java.awt.Color(255, 249, 133));
		jButton1.setText("Ver factura");
		jPanel1.add(jButton1);
		jButton1.setBounds(180, 230, 110, 30);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	verfActionPerformed(evt);
            }
        });

		jButton2.setBackground(new java.awt.Color(255, 249, 133));
		jButton2.setText("Volver");
		jPanel1.add(jButton2);
		jButton2.setBounds(330, 280, 110, 30);

		getContentPane().add(jPanel1);
		jPanel1.setBounds(0, 0, 450, 320);

		pack();
	}
	public void verfActionPerformed(java.awt.event.ActionEvent evt) {
		 new factura().setVisible(true);
	}
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	
}
