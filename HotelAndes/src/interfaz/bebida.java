package interfaz;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import consola.MenuAdmin;
import controlador.controlador;
import logica_.Bebida;
import logica_.Servicio;
import modelo.CargadorArchivo;

public class bebida extends javax.swing.JFrame {
	controlador control= controlador.getInstance();

   
    public bebida() throws IOException {
        initComponents();
        setSize(490, 390);
   
    }

                             
    private void initComponents() throws IOException {

        jPanel1 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(440, 310));
        jPanel1.setLayout(null);

        volver.setBackground(new java.awt.Color(255, 249, 132));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver);
        volver.setBounds(340, 290, 110, 30);

        jButton3.setBackground(new java.awt.Color(255, 249, 132));
        jButton3.setText("Pedir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(180, 250, 110, 30);
        
  
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>( ));
        MenuAdmin.ejecutarCargarBebidas();
        for (Servicio elemento : cargador.getListaBebidas()) {
        	jComboBox1.addItem(elemento.getNombre());
        }
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					seleccionActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(150, 130, 180, 40);
        jRadioButton1.setText("Llevar a la habitación");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(150, 180, 150, 21);

        jRadioButton2.setText("Consumir en el restaurante");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(150, 210, 190, 21);

        

        imagen.setIcon(new ImageIcon("./img/bebidas-sin-alcohol.jpg")); // NOI18N
        jPanel1.add(imagen);
        imagen.setBounds(170, 10, 130, 110);

        
        
        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 460, 330);

        pack();
    }                       

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new solicitar_servicio().setVisible(true);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	
    	String pedido=jComboBox1.getSelectedItem().toString();
    	Servicio servicio=null;
    	for(Servicio i :cargador.getListaBebidas()) {
    		if(pedido.equals(i.getNombre())) {
    			servicio=i;
    		}
    	}
    	control.cargarConsumo(servicio);
    }   
    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
    	
    	
    }

   
                        
    private javax.swing.JButton volver;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    CargadorArchivo cargador= CargadorArchivo.getInstance();
    MenuAdmin MenuAdmin = new MenuAdmin();
    
                     
}