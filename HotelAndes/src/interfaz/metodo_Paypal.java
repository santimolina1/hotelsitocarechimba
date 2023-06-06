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
import modelo.CargadorArchivo;

public class metodo_Paypal extends javax.swing.JFrame {
	private Consumo c;
	
	
	public VerificarPago verificador =VerificarPago.getInstance();
    public metodo_Paypal(Consumo c) {
        initComponents();
        setSize(490, 390);
        this.c=c;
    }

                             
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
        jLabel1.setText("Ingresa tus datos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 130, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 110, 190, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 180, 190, 30);

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

        jLabel2.setText("Correo Electrónico");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 120, 106, 17);

        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 190, 110, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 330);

        pack();
    }                       


    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(metodo_Paypal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new metodo_Paypal(null).setVisible(true);
        });
    }
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new metodo_de_pago(null).setVisible(true);
    }
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
    	String numero= jLabel2.getText();
    	String contraseña=jLabel3.getText();
    	try {
			verificador.verificacion(numero,contraseña);
			Transaccion tra=new Transaccion(new Date(), c.getPrecio(),"exitoso");
			new PagoOnline("PayPal","Paypal",tra);
			c.setPagado(true);
		} catch (IOException e) {
			Transaccion tra=new Transaccion(new Date(), c.getPrecio(),"fail");
			new PagoOnline("PayPal","Paypal",tra);
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (PagoException e) {
			Transaccion tra=new Transaccion(new Date(), c.getPrecio(),"fail");
			new PagoOnline("PayPal","Paypal",tra);
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
    }
                    
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
