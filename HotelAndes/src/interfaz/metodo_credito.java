package interfaz;

import java.io.IOException;
import java.util.Date;

import javax.swing.JOptionPane;

import Excepciones.PagoException;
import logica_.Consumo;
import logica_.PagoOnline;
import logica_.PasarelasDePagos;
import logica_.Transaccion;
import logica_.VerificarPago;

public class metodo_credito extends javax.swing.JFrame {
	private Consumo c;
	private String metodo;
	public VerificarPago verificador =VerificarPago.getInstance();
    public metodo_credito(Consumo c,String metodo) {
        initComponents();
        setSize(490, 390);
        this.c=c;
        this.metodo=metodo;
    }

                             
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Ingresa tus datos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 130, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 60, 190, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 100, 190, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(210, 140, 190, 30);

        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(210, 180, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Confirmar");
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 240, 110, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	try {
					ConfirmarActionPerformed(evt);
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
            	volverActionPerformed(evt);
            }
        });

        jLabel2.setText("Número Tarjeta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 88, 17);

        jLabel3.setText("Cédula Propietario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 110, 17);

        jLabel4.setText("Código de Seguridad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 150, 123, 17);

        jLabel5.setText("Fecha Vencimiento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 190, 110, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 330);

        pack();
    }// </editor-fold>                        


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
            java.util.logging.Logger.getLogger(metodo_credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new metodo_credito(null,null).setVisible(true);
        });
    }
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new metodo_de_pago(null).setVisible(true);
    }
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	String numero= jTextField1.getText();
    	System.out.println(numero);
    	String contraseña=jTextField3.getText();
    	System.out.println(contraseña);
    	String clase=null;
    	String archivo=null;
    	if(metodo.equals("visa")) {
    		clase="logica_.Visa";
    		archivo="./data/Visa.txt";
    	}
    	else if(metodo.equals("master")) {
    		clase="logica_.MasterCard";
    		archivo="./data/Master.txt";
    	}
    	
    	try {
			verificador.verificacion(numero,contraseña);
			Transaccion tra=new Transaccion(new Date(), c.getPrecio(),"exitoso");
			new PagoOnline(clase,archivo,tra);
			c.setPagado(true);
		} catch (IOException e) {
			Transaccion tra=new Transaccion(new Date(), c.getPrecio(),"fail");
			new PagoOnline(clase,archivo,tra);
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (PagoException e) {
			Transaccion tra=new Transaccion(new Date(), c.getPrecio(),"fail");
			new PagoOnline(clase,archivo,tra);
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
    	new ventana_usuario().setVisible(true);
    	
    }

                   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}
