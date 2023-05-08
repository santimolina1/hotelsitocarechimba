package interfaz;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import controlador.controlador;
import logica_.Consumo;
import logica_.Factura;

public class factura extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    public factura() {
        initComponents();
        setSize(490, 390);
    }

                      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 249, 133));
        jButton1.setText("Descargar");
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 220, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 249, 133));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 280, 110, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Factura:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 20, 60, 30);
        
        info();

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 320);

        pack();
    }                      
    private void info() {
    	Factura f=control.generarFactura();
    	listModel.addElement("Número de factura: " + f.getNumeroFactura());
    	listModel.addElement("Fecha: " + f.getFecha());
    	listModel.addElement("Nombre: " + f.getNombre());
    	listModel.addElement("Producto   ----   Precio ----  Pagado");
		for (Consumo i : f.getConsumos()) {

			listModel.addElement(i.getNombre() + "   ----   " + i.getPrecio() + "   ----   " + i.getPagado());
		}

		listModel.addElement("Precio neto de lo NO pago: " + f.getValotTotal());
		listModel.addElement("valor del IVA de lo NO pago: " + f.getImpuestos());
		listModel.addElement("Valor total de lo NO pago: " + (f.getValotTotal() + f.getImpuestos()));

    	  
          scrollPane.setViewportView(list);
          jPanel1.add(scrollPane);
          scrollPane.setBounds(150, 20, 210, 300);

    	
    }
    public void volverActionPerformed(java.awt.event.ActionEvent evt) {
    	 new ventana_principal_inicio().setVisible(true);
    }
                        
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    JList<String> list;
    private javax.swing.JPanel jPanel1;
    JScrollPane scrollPane ;
    DefaultListModel<String> listModel;
    
                  
}

