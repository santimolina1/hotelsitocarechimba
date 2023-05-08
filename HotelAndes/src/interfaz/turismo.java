package interfaz;

import java.io.IOException;

import javax.swing.ImageIcon;

import consola.MenuAdmin;
import controlador.controlador;
import logica_.Servicio;
import modelo.CargadorArchivo;

public class turismo extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    public turismo() throws IOException {
        initComponents();
        setSize(490, 390);
    }

                 
    private void initComponents() throws IOException {

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
        jButton2.setBounds(330, 280, 110, 30);

        jButton3.setBackground(new java.awt.Color(255, 249, 132));
        jButton3.setText("Pedir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(180, 240, 110, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>( ));
        MenuAdmin.ejecutarCargarServicios();
        for (Servicio elemento : cargador.getListaServicios()) {
        	jComboBox1.addItem(elemento.getNombre());
        }
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 160, 180, 40);

        jLabel1.setIcon(new ImageIcon("./img/turismo.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 60, 80, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 450, 320);

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new solicitar_servicio().setVisible(true);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    	String pedido=jComboBox1.getSelectedItem().toString();
    	Servicio servicio=null;
    	for(Servicio i :cargador.getListaServicios()) {
    		if(pedido.equals(i.getNombre())) {
    			servicio=i;
    		}
    	}
    	control.cargarConsumo(servicio);
    }                                        
                  
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    CargadorArchivo cargador= CargadorArchivo.getInstance();
    MenuAdmin MenuAdmin = new MenuAdmin();                  
}
