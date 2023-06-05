package interfaz;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class ventana_usuario extends javax.swing.JFrame {

	public ventana_usuario() {
		initComponents();
		setSize(490, 390);
	}

	
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		cerrarSesionBut = new javax.swing.JButton();
		ingresarDatosBut = new javax.swing.JButton();
		reservarBut = new javax.swing.JButton();
		checkInBut = new javax.swing.JButton();
		catalogoBut = new javax.swing.JButton();
		menuBut = new javax.swing.JButton();
		solicitarServBut = new javax.swing.JButton();
		cacelarReservBut = new javax.swing.JButton();
		pagarServBut = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		a=new javax.swing.JLabel();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		jPanel1.setBackground(new java.awt.Color(212, 227, 252));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanel1.setLayout(null);

		jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
		jLabel1.setText("¡Hola!");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(10, 10, 100, 40);

		cerrarSesionBut.setBackground(new java.awt.Color(255, 249, 132));
		cerrarSesionBut.setText("Cerrar Sesión");
		jPanel1.add(cerrarSesionBut);
		cerrarSesionBut.setBounds(340, 10, 110, 30);
		cerrarSesionBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cerrarSesBActionPerformed(evt);
            }
        });

		ingresarDatosBut.setText("Ingresar Datos");
		jPanel1.add(ingresarDatosBut);
		ingresarDatosBut.setBounds(10, 110, 130, 30);
		ingresarDatosBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ingresarDatosActionPerformed(evt);
            }
        });

		reservarBut.setText("Realizar una reserva");
		jPanel1.add(reservarBut);
		reservarBut.setBounds(160, 110, 148, 30);
		reservarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	reservarButActionPerformed(evt);
            }
        });

		checkInBut.setText("Realizar Check-in");
		jPanel1.add(checkInBut);
		checkInBut.setBounds(320, 110, 132, 30);
		checkInBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	checkInButActionPerformed(evt);
            }
        });

		catalogoBut.setText("Catalogo de Servicios");
		jPanel1.add(catalogoBut);
		catalogoBut.setBounds(10, 200, 157, 30);
		catalogoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					catalogoButActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

		menuBut.setText("Menú");
		jPanel1.add(menuBut);
		menuBut.setBounds(210, 200, 70, 30);
		menuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					menuButActionPerformed(evt);
				} catch (IOException e) {
					new VentanaEmergente(null).setVisible(true);
					e.printStackTrace();
				}
            }
        });

		solicitarServBut.setText("Solicitar Servicio");
		jPanel1.add(solicitarServBut);
		solicitarServBut.setBounds(320, 200, 130, 30);
		solicitarServBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	solicitarServButActionPerformed(evt);
            }
        });

		cacelarReservBut.setText("Cancelar Reserva");
		jPanel1.add(cacelarReservBut);
		cacelarReservBut.setBounds(80, 290, 140, 30);
		cacelarReservBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cacelarReservButActionPerformed(evt);
            }
        });

		pagarServBut.setText("Pagar Servicio");
		jPanel1.add(pagarServBut);
		pagarServBut.setBounds(280, 290, 120, 30);
		pagarServBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	pagarServButActionPerformed(evt);
            }
        });

		jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N "./img/error.jpg"
		jLabel2.setIcon(new ImageIcon("./img/usuario.jpg")); // NOI18N
		jPanel1.add(jLabel2);
		jLabel2.setBounds(60, 40, 100, 100);

		jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
		jLabel3.setIcon(new ImageIcon("./img/reserva.jpg")); // NOI18N
		jPanel1.add(jLabel3);
		jLabel3.setBounds(220, 60, 50, 50);

		jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
		jLabel4.setIcon(new ImageIcon("./img/mapa.jpg")); // NOI18N
		jPanel1.add(jLabel4);
		jLabel4.setBounds(350, 40, 70, 70);

		jLabel5.setIcon(new ImageIcon("./img/cama.jpg")); // NOI18N
		jPanel1.add(jLabel5);
		jLabel5.setBounds(60, 147, 50, 50);

		jLabel6.setIcon(new ImageIcon("./img/catalogo.jpg")); // NOI18N
		jPanel1.add(jLabel6);
		jLabel6.setBounds(230, 150, 50, 50);
		
		a.setIcon(new ImageIcon("./img/menu.jpg")); // NOI18N
		jPanel1.add(a);
		a.setBounds(60, 150, 50, 50);

		jLabel7.setIcon(new ImageIcon("./img/contratacion.jpg")); // NOI18N
		jPanel1.add(jLabel7);
		jLabel7.setBounds(360, 150, 40, 40);

		jLabel8.setIcon(new ImageIcon("./img/archivo.jpg")); // NOI18N
		jPanel1.add(jLabel8);
		jLabel8.setBounds(130, 240, 40, 40);

		jLabel9.setIcon(new ImageIcon("./img/metodo-de-pago.jpg")); // NOI18N
		jPanel1.add(jLabel9);
		jLabel9.setBounds(320, 240, 50, 40);

		getContentPane().add(jPanel1);
		jPanel1.setBounds(0, 0, 460, 330);

		pack();
	}
	private void cerrarSesBActionPerformed(java.awt.event.ActionEvent evt) {
		new venatana_principal().setVisible(true);
	}
	private void ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {
		new ingresar_datos().setVisible(true);
	}
	private void cacelarReservButActionPerformed(java.awt.event.ActionEvent evt) {
		new cancelar_reserva().setVisible(true);
	}
	private void solicitarServButActionPerformed(java.awt.event.ActionEvent evt) {
		new solicitar_servicio().setVisible(true);
	}
	private void catalogoButActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
		new catalogo().setVisible(true);
	}
	private void menuButActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
		new menu().setVisible(true);
	}
	private void reservarButActionPerformed(java.awt.event.ActionEvent evt) {
		new habitaciones_disponibles().setVisible(true);
	}
	private void checkInButActionPerformed(java.awt.event.ActionEvent evt) {
		new check_in().setVisible(true);
	}
	private void pagarServButActionPerformed(java.awt.event.ActionEvent evt) {
		new pago_unitario().setVisible(true);
	}
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ventana_usuario().setVisible(true);
            }
        });
    }
	
	private javax.swing.JButton cerrarSesionBut;
	private javax.swing.JButton ingresarDatosBut;
	private javax.swing.JButton reservarBut;
	private javax.swing.JButton checkInBut;
	private javax.swing.JButton catalogoBut;
	private javax.swing.JButton menuBut;
	private javax.swing.JButton solicitarServBut;
	private javax.swing.JButton cacelarReservBut;
	private javax.swing.JButton pagarServBut;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel a;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	
}
