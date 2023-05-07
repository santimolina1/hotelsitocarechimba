package interfaz;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class VentanaEmergente extends JDialog {
    public VentanaEmergente(JFrame frame) {
        super(frame, "Error", true);

        // Configuración de la ventana emergente
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(frame);

        // Crear un panel para contener los componentes
        JPanel panel = new JPanel();

        // Crear una etiqueta con el mensaje de error
        JLabel mensaje = new JLabel("Error, vuelva a intentar");
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);

        // Agregar la etiqueta al panel
        ImageIcon icono = new ImageIcon("./img/error.jpg"); // Reemplaza "ruta_de_la_imagen.png" con la ruta de tu imagen
        JButton boton = new JButton(icono);
       // boton.setPreferredSize(new Dimension(50, 50));
        boton.setOpaque(true);
        panel.setBackground(new java.awt.Color(255, 249, 132));
        panel.add(boton);
        panel.add(mensaje);

        // Agregar el panel a la ventana emergente
        getContentPane().add(panel);
    }

    
}
