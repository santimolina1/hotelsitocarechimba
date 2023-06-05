package interfaz;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import consola.MenuAdmin;
import modelo.CargadorArchivo;

public class ventana_admin extends javax.swing.JFrame {
	CargadorArchivo cargador = CargadorArchivo.getInstance();
    
    public ventana_admin() {
        initComponents();
        setSize(490, 390);}
                         
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        volverb = new javax.swing.JButton();
        siguienteb = new javax.swing.JButton();
        JLabel jLabel3 = new javax.swing.JLabel();
        JButton jButton3 = new javax.swing.JButton();
        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(466, 371));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Hola Administrador.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 180, 23);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setText("Por favor seleccione el archivo que desea cargar.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 50, 360, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el archivo a cargar","Cargar Todo", "Cargar Camas", "Cargar Habitaciones", "Cargar Bebidas", "Cargar Platos", "Cargar Servicios", "Cargar Tarifas" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 110, 220, 23);

        volverb.setBackground(new java.awt.Color(255, 249, 132));
        volverb.setText("Volver");
        jPanel1.add(volverb);
        volverb.setBounds(90, 200, 110, 30);
        volverb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverbActionPerformed(evt);
            }
        });

        siguienteb.setBackground(new java.awt.Color(255, 249, 132));
        siguienteb.setText("Siguiente");
        siguienteb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	siguientebActionPerformed(evt);
            }
        });
        
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel3.setText("Si desea ver los reportes, presione el botón ver reportes ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 240, 410, 20);

        jButton3.setBackground(new java.awt.Color(255, 249, 132));
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }

			private void jButton3ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        
        
        
        
        jPanel1.add(siguienteb);
        siguienteb.setBounds(270, 200, 110, 30);
        

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 460, 330);

        pack();
    }// </editor-fold>                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // F
    } 
    private void siguientebActionPerformed(java.awt.event.ActionEvent evt)  {                                           
    	MenuAdmin MenuAdmin = new MenuAdmin();
    	CargadorArchivo cargador =CargadorArchivo.getInstance();
    	try {
			MenuAdmin.ejecutarCargarBebidas();
			MenuAdmin.ejecutarCargarPlatos();
	    	MenuAdmin.ejecutarCargarServicios();
	    	cargador.cargarFechas("./data/fechas.txt");

	    	MenuAdmin.ejecutarCargarCamas();
	    	MenuAdmin.ejecutarCargarHabitaciones();
	    	

		} catch (IOException e) {
			new error_carga().setVisible(true);
			e.printStackTrace();
		}
    	
    	
    	new carga_Datos().setVisible(true);
    } 
    private void volverbActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	new venatana_principal().setVisible(true);
    	
    }

                        
    private javax.swing.JButton volverb;
    private javax.swing.JButton siguienteb;
    private javax.swing.JLabel jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
                     
}
