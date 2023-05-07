package interfazGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public VentanaPrincipal() {
        setTitle("Ejemplo de cambio de ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        JButton button1 = new JButton("Cambiar a ventana 2");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Ventana 2");
            }
        });
        panel1.add(button1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        JButton button2 = new JButton("Cambiar a ventana 1");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Ventana 1");
            }
        });
        panel2.add(button2);

        cardPanel.add(panel1, "Ventana 1");
        cardPanel.add(panel2, "Ventana 2");

        getContentPane().add(cardPanel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal();
            }
        });
    }
}