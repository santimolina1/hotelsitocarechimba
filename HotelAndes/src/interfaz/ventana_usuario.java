package interfaz;

public class ventana_usuario extends javax.swing.JFrame {

	/**
	 * Creates new form Ventana_Usuario
	 */
	public ventana_usuario() {
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
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		jPanel1.setBackground(new java.awt.Color(212, 227, 252));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel1.setLayout(null);

		jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
		jLabel1.setText("¡Hola!");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(10, 10, 100, 40);

		jButton1.setBackground(new java.awt.Color(255, 249, 132));
		jButton1.setText("Cerrar Sesión");
		jPanel1.add(jButton1);
		jButton1.setBounds(340, 10, 110, 30);

		jButton2.setText("Ingresar Datos");
		jPanel1.add(jButton2);
		jButton2.setBounds(10, 110, 130, 30);

		jButton3.setText("Realizar una reserva");
		jPanel1.add(jButton3);
		jButton3.setBounds(160, 110, 148, 30);

		jButton4.setText("Realizar Check-in");
		jPanel1.add(jButton4);
		jButton4.setBounds(320, 110, 132, 30);

		jButton5.setText("Catalogo de Servicios");
		jPanel1.add(jButton5);
		jButton5.setBounds(10, 200, 157, 30);

		jButton6.setText("Menú");
		jPanel1.add(jButton6);
		jButton6.setBounds(210, 200, 70, 30);

		jButton7.setText("Solicitar Servicio");
		jPanel1.add(jButton7);
		jButton7.setBounds(320, 200, 130, 30);

		jButton8.setText("Cancelar Reserva");
		jPanel1.add(jButton8);
		jButton8.setBounds(80, 290, 140, 30);

		jButton9.setText("Pagar Servicio");
		jPanel1.add(jButton9);
		jButton9.setBounds(280, 290, 120, 30);

		jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
		jPanel1.add(jLabel2);
		jLabel2.setBounds(60, 60, 40, 40);

		jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva.png"))); // NOI18N
		jPanel1.add(jLabel3);
		jLabel3.setBounds(220, 60, 50, 50);

		jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa.png"))); // NOI18N
		jPanel1.add(jLabel4);
		jLabel4.setBounds(350, 40, 70, 70);

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo.png"))); // NOI18N
		jPanel1.add(jLabel5);
		jLabel5.setBounds(60, 147, 50, 50);

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
		jPanel1.add(jLabel6);
		jLabel6.setBounds(230, 150, 50, 50);

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contratacion.png"))); // NOI18N
		jPanel1.add(jLabel7);
		jLabel7.setBounds(360, 150, 40, 40);

		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo.png"))); // NOI18N
		jPanel1.add(jLabel8);
		jLabel8.setBounds(130, 240, 40, 40);

		jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodo-de-pago.png"))); // NOI18N
		jPanel1.add(jLabel9);
		jLabel9.setBounds(320, 240, 50, 40);

		getContentPane().add(jPanel1);
		jPanel1.setBounds(0, 0, 460, 330);

		pack();
	}// </editor-fold>

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */

		// </editor-fold>

		/* Create and display the form */
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


		
		
		
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ventana_usuario().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration
}
