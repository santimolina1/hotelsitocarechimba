package interfaz;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import consola.MenuAdmin;
import logica_.Servicio;
import modelo.CargadorArchivo;

public class catalogo extends JFrame {

    private JPanel jPanel1;
    private JLabel jLabel1;
    private JButton jButton1;
    private JList<String> jList1;
    private JList<String> jList2;
    private JLabel jLabel2;

    public catalogo() throws IOException {
        initComponents();
        setSize(490, 390);
    }

    private void initComponents() throws IOException {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton1 = new JButton("Volver");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        jLabel1.setText("Catálogo de servicios del hotel.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 270, 23);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setBounds(310, 280, 110, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        DefaultListModel<String> listModel1 = new DefaultListModel<>();
        jList1 = new JList<>(listModel1);
        jList1.setBounds(50, 180, 150, 100);
        JScrollPane scrollPane1 = new JScrollPane(jList1);
        scrollPane1.setBounds(50, 180, 150, 100);
        jPanel1.add(scrollPane1);

        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        jList2 = new JList<>(listModel2);
        jList2.setBounds(260, 50, 150, 100);
        JScrollPane scrollPane2 = new JScrollPane(jList2);
        scrollPane2.setBounds(260, 50, 150, 100);
        jPanel1.add(scrollPane2);

        CargadorArchivo cargador = CargadorArchivo.getInstance();
        MenuAdmin MenuAdmin = new MenuAdmin();

        MenuAdmin.ejecutarCargarServicios();
        int contt = 1;
        while (contt < 5) {
            for (Servicio elemento : cargador.getListaServicios()) {
                listModel1.addElement(contt + ". " + elemento.getNombre());
                contt++;
            }
        }

        MenuAdmin.ejecutarCargarServicios();
        int cont = 5;
        for (Servicio elemento : cargador.getListaServicios()) {
            listModel2.addElement(cont + ". " + elemento.getNombre() + " pro");
            cont++;
        }

        jLabel1.setIcon(new ImageIcon("./img/spa1.jpg"));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 60, 130, 90);

        jLabel2.setIcon(new ImageIcon("./img/turismo_sostenible copia.jpg"));
        //jLabel1.setText("jLabel4");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 160, 180, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 460, 330);

        pack();
    }

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {
        new ventana_usuario().setVisible(true);
    }

    
}