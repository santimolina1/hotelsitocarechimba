package interfaz;

import java.io.IOException;
import java.util.ArrayList;

import controlador.controlador;

public class habitaciones_disponibles extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
	public String fechaInicio=null;
	public String fechaFin=null;
    public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
     * Creates new form habitaciones_disponibles
     */
    public habitaciones_disponibles() {
        initComponents();
        setSize(490, 390);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Seleccione un rango de fechas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 50, 230, 20);

        
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 100, 190, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 160, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Mostrar habitaciones");
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 240, 160, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
            		botonMostarHabitacionesActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 290, 110, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	botonVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha inicio (DD/MM/AAA)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 160, 17);

        jLabel3.setText("Fecha salida (DD/MM/AAA)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 170, 156, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
    }// </editor-fold>                        

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	dispose(); // Cerrar la ventana emergente
        ventana_usuario menu=new ventana_usuario();
        menu.setVisible(true);
    }                                           

    private void botonMostarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
    	String fechaInicio=jTextField1.getText();
    	String fechaFin= jTextField2.getText();
    	setFechaInicio(fechaInicio);
    	setFechaFin(fechaFin);
    	
    	ArrayList<String> disponibles=control.mostrarDisponiblesFechas(fechaInicio, fechaFin);
    	lista_habitaciones lista= new lista_habitaciones(disponibles,fechaInicio,fechaFin);
    	lista.setVisible(true);
    	
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(habitaciones_disponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new habitaciones_disponibles().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}