package interfaz;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class VentanaEmergente extends JDialog {
    public VentanaEmergente(JFrame frame) {
        super(frame, "Error", true);

       
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(frame);

        
        JPanel panel = new JPanel();

       
        JLabel mensaje = new JLabel("Error, vuelva a intentar");
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);

        ImageIcon icono = new ImageIcon("./img/error.jpg"); 
        JButton boton = new JButton(icono);
       // boton.setPreferredSize(new Dimension(50, 50));
        boton.setOpaque(true);
        panel.setBackground(new java.awt.Color(255, 249, 132));
        panel.add(boton);
        panel.add(mensaje);

        
        getContentPane().add(panel);
    }

    
}
