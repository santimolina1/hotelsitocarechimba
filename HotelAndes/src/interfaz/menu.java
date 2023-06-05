package interfaz;

import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import consola.MenuAdmin;
import logica_.Servicio;
import modelo.CargadorArchivo;

public class menu extends JFrame {

    private JPanel jPanel1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JButton jButton1;
    private JList<String> jList1;
    private JList<String> jList2;

    public menu() throws IOException {
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
        jLabel1.setText("Menú del restaurante.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 270, 23);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setBounds(310, 280, 110, 30);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        DefaultListModel<String> listModel1 = new DefaultListModel<>();
        jList1 = new JList<>(listModel1);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList1.setBounds(50, 180, 150, 100);
        JScrollPane scrollPane1 = new JScrollPane(jList1);
        scrollPane1.setBounds(50, 180, 150, 100);
        jPanel1.add(scrollPane1);

        DefaultListModel<String> listModel2 = new DefaultListModel<>();
        jList2 = new JList<>(listModel2);
        jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList2.setBounds(260, 50, 150, 100);
        JScrollPane scrollPane2 = new JScrollPane(jList2);
        scrollPane2.setBounds(260, 50, 150, 100);
        jPanel1.add(scrollPane2);

        CargadorArchivo cargador = CargadorArchivo.getInstance();
        MenuAdmin MenuAdmin = new MenuAdmin();

        MenuAdmin.ejecutarCargarPlatos();
        int contt = 1;
        for (Servicio elemento : cargador.getListaPlatos()) {
            listModel1.addElement(contt + ". " + elemento.getNombre());
            contt++;
        }

        MenuAdmin.ejecutarCargarBebidas();
        int cont = 1;
        for (Servicio elemento : cargador.getListaBebidas()) {
            listModel2.addElement(cont + ". " + elemento.getNombre());
            cont++;
        }

        jLabel1.setIcon(new ImageIcon("./img/hamburguesa01.jpg"));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 60, 100, 90);

        jLabel2.setIcon(new ImageIcon("./img/huevos-pericos-colombianos-3033.jpg"));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 180, 140, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
    }

    private void volverActionPerformed(ActionEvent evt) {
        new ventana_usuario().setVisible(true);
    }

  
}
