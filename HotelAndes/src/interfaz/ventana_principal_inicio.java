package interfaz;

import javax.swing.ImageIcon;

public class ventana_principal_inicio extends javax.swing.JFrame {

	private javax.swing.JButton jButton1;
	private javax.swing.JButton inicSes;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;

	public ventana_principal_inicio() {
		initComponents();
		setSize(490, 390);
	}


	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		inicSes = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(212, 227, 252));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel1.setSize(new java.awt.Dimension(440, 310));
		jPanel1.setLayout(null);

		jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
		jLabel2.setText("Bienvenido a Hotel Andes");
		jPanel1.add(jLabel2);
		jLabel2.setBounds(150, 20, 159, 17);

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setIcon(new ImageIcon("./img/hoteles_espaa_lujo-U301387819834kHH--1234x900@abc.jpg")); // NOI18N
		jLabel1.setText("jLabel1");
		jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel1.add(jLabel1);
		jLabel1.setBounds(70, 50, 340, 210);

		jButton1.setBackground(new java.awt.Color(255, 249, 132));
		jButton1.setText("Estadisticas");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(80, 270, 110, 30);

		inicSes.setBackground(new java.awt.Color(255, 249, 132));
		inicSes.setText("Iniciar Sesión");
		jPanel1.add(inicSes);
		inicSes.setBounds(290, 270, 110, 30);
		inicSes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inicSesActionPerformed(evt);}
		});

				javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
				getContentPane().setLayout(layout);
				layout.setHorizontalGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
						);
				layout.setVerticalGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
						);

				pack();
			}// </editor-fold>                        

			private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
				// TODO add your handling code here:
			}                                        
			private void inicSesActionPerformed(java.awt.event.ActionEvent evt) {                                         
				// TODO add your handling code here:
			} 
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
					java.util.logging.Logger.getLogger(ventana_principal_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}





				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						new ventana_principal_inicio().setVisible(true);
					}
				});
			}



		}
