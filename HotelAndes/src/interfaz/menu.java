package interfaz;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

import consola.MenuAdmin;
import logica_.Servicio;
import modelo.CargadorArchivo;

public class menu extends javax.swing.JFrame {

    public menu() throws IOException {
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
        CargadorArchivo cargador= CargadorArchivo.getInstance();
        MenuAdmin MenuAdmin = new MenuAdmin();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Menú del restaurante.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 270, 23);

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
        MenuAdmin.ejecutarCargarPlatos();
        int contt=1;
        for (Servicio elemento : cargador.getListaPlatos()) {
        	 String textoActual = jTextField1.getText();
             String nuevoTexto = textoActual+" " +contt+". "+elemento.getNombre();
             jTextField1.setText(nuevoTexto);
             contt++;
        }
        jTextField1.setEditable(false);

        JScrollPane scrollPane1 = new JScrollPane(jTextField1);
        scrollPane1.setBounds(50, 180, 150, 100);
        jPanel1.add(scrollPane1);;
        
        


        
        jPanel1.add(jTextField2);
        
        MenuAdmin.ejecutarCargarBebidas();
        int cont=1;
        for (Servicio elemento : cargador.getListaBebidas()) {
        	 String textoActual = jTextField2.getText();
             String nuevoTexto = textoActual+" " +cont+". "+elemento.getNombre();
             jTextField2.setText(nuevoTexto);
             cont++;
        }
        jTextField2.setEditable(false);

        JScrollPane scrollPane2 = new JScrollPane(jTextField2);
        scrollPane2.setBounds(260, 50, 150, 100);
        jPanel1.add(scrollPane2);

        jLabel3.setIcon(new ImageIcon("./img/hamburguesa01.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 60, 100, 90);

        jLabel4.setIcon(new ImageIcon("./img/huevos-pericos-colombianos-3033.jpg")); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 180, 140, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

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
                     
}
