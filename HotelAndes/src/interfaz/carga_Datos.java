package interfaz;


public class carga_Datos extends javax.swing.JFrame {

	    
	    public carga_Datos() {
	        initComponents();
	        setSize(490, 390);
	    }

	                       
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();
	        cerrarSesB = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        getContentPane().setLayout(null);

	        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
	        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	        jPanel1.setLayout(null);

	        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
	        jLabel1.setText("El archivo a cargar,");
	        jPanel1.add(jLabel1);
	        jLabel1.setBounds(160, 110, 156, 23);

	        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
	        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel2.setText("ha sido cargado con éxito.");
	        jPanel1.add(jLabel2);
	        jLabel2.setBounds(130, 140, 220, 23);

	        jButton1.setBackground(new java.awt.Color(255, 249, 132));
	        jButton1.setText("Volver");
	        jPanel1.add(jButton1);
	        jButton1.setBounds(100, 190, 110, 30);
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            volverActionPerformed(evt);
	            }
	        });

	        cerrarSesB.setBackground(new java.awt.Color(255, 249, 132));
	        cerrarSesB.setText("Cerrar Sesión");
	        cerrarSesB.setToolTipText("");
	        jPanel1.add(cerrarSesB);
	        cerrarSesB.setBounds(260, 190, 110, 30);
	        cerrarSesB.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	cerrarSesBActionPerformed(evt);
	            }
	        });

	        getContentPane().add(jPanel1);
	        jPanel1.setBounds(0, 0, 458, 329);

	        pack();
	        
	        
	    }
	    private void cerrarSesBActionPerformed(java.awt.event.ActionEvent evt) {                                           
	    	new venatana_principal().setVisible(true);
        }
	    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                           
	    	new ventana_admin().setVisible(true);
        }

	                       
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton cerrarSesB;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JPanel jPanel1;
	                       
	}

