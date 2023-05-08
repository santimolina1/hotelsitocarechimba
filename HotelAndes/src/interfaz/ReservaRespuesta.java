package interfaz;

import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReservaRespuesta extends javax.swing.JFrame {
	
	
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private HashMap<String, Float> valores;
    

    public ReservaRespuesta(HashMap<String, Float> valores) {
        this.valores = valores;
        initComponents();
        setSize(490, 390);
        String texto = "Sus habitaciones son: \n";
        for(String habitacion : valores.keySet()) {
            texto += habitacion + " - " + valores.get(habitacion) + "\n";
        }
        jLabel1.setText(texto);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBounds(0, 0, 400, 200);
        jPanel1.add(jLabel1);

        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(150, 220, 100, 30);
        jPanel1.add(jButton1);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        new ventana_usuario().setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaRespuesta(null).setVisible(true);
            }
        });
    }

}
