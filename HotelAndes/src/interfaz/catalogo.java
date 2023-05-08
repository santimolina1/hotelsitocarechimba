package interfaz;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

import consola.MenuAdmin;
import controlador.controlador;
import logica_.Servicio;
import modelo.CargadorArchivo;

public class catalogo extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    public catalogo() throws IOException {
    	
        initComponents();
        setSize(490, 390);
    }

   
                            
    private void initComponents() throws IOException {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Catálogo de servicios del hotel.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 270, 23);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Volver");
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 280, 110, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverActionPerformed(evt);
            }
        });

        jPanel1.add(jTextField1);
        MenuAdmin.ejecutarCargarServicios();
        int contt=1;
        while (contt<5) {
        for (Servicio elemento : cargador.getListaServicios()) {
        	 String textoActual = jTextField1.getText();
             String nuevoTexto = textoActual+" " +contt+". "+elemento.getNombre();
             jTextField1.setText(nuevoTexto);
             contt++;
        }}
        jTextField1.setEditable(false);

        JScrollPane scrollPane1 = new JScrollPane(jTextField1);
        scrollPane1.setBounds(50, 180, 150, 100);
        jPanel1.add(scrollPane1);;


        jPanel1.add(jTextField2);
        //jTextField2.setBounds(260, 50, 150, 100);
        MenuAdmin.ejecutarCargarServicios();
        int cont=5;
        
        for (Servicio elemento : cargador.getListaServicios()) {
        	 String textoActual = jTextField2.getText();
             String nuevoTexto = textoActual+" " +cont+". "+elemento.getNombre()+" pro";
             jTextField2.setText(nuevoTexto);
             cont++;
        }
        jTextField2.setEditable(false);

        JScrollPane scrollPane2 = new JScrollPane(jTextField2);
        scrollPane2.setBounds(260, 50, 150, 100);
        jPanel1.add(scrollPane2);


        jLabel3.setIcon(new ImageIcon("./img/46ccf3733c648df7203c79d321b717037c62f80a.XL2.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 60, 130, 90);

        jLabel4.setIcon(new ImageIcon("./img/turismo_sostenible copia.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 160, 180, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 460, 330);

        pack();
    }
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new ventana_usuario().setVisible(true);
    }
                        
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    MenuAdmin MenuAdmin = new MenuAdmin();
    CargadorArchivo cargador= CargadorArchivo.getInstance();
                     
}