package interfaz;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class reserva_exito extends JDialog {
	
    public reserva_exito(JFrame frame) {
        super(frame, "Exito", true);

        // Configuración de la ventana emergente
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(frame);

        // Crear un panel para contener los componentes
        JPanel panel = new JPanel();

        // Crear una etiqueta con el mensaje de error
        JLabel mensaje = new JLabel("La reserva fue realizada exitosamente");
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);

        // Agregar la etiqueta al panel
        ImageIcon icono = new ImageIcon("./img/jeje.png"); // Reemplaza "ruta_de_la_imagen.png" con la ruta de tu imagen
        JButton boton = new JButton(icono);
        boton.setPreferredSize(new Dimension(100, 100));
        boton.setBackground(new java.awt.Color(255, 249, 132));
        boton.setOpaque(true);
        panel.setBackground(new java.awt.Color(255, 249, 132));
        panel.add(boton);
        panel.add(mensaje);

        // Agregar el panel a la ventana emergente
        getContentPane().add(panel);
    }
   

    
}
