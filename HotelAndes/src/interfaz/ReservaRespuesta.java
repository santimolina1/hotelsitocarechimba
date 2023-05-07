package interfaz;

import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ReservaRespuesta extends javax.swing.JFrame {
	

	    /**
	     * Creates new form VerValores
	     */
	
	
	
	
	
	    public ReservaRespuesta(HashMap<String, Float> valores) {
	        initComponents();
	        // Mostrar los valores recibidos en el HashMap
	        String texto = "Sus habitaciones son:\n";
	        for(String habitacion : valores.keySet()) {
	            texto += habitacion + " - " + valores.get(habitacion) + "\n";
	        }
	        jLabel1.setText(texto);
	    }

	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        jLabel1.setText("jLabel1");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(12, Short.MAX_VALUE))
	        );

	        pack();
	    }

	    public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ReservaRespuesta(null).setVisible(true);
	            }
	        });
	    }

	    private javax.swing.JLabel jLabel1;

	}
