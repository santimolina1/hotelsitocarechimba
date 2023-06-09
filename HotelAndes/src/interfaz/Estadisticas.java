package interfaz;

import java.io.IOException;

import javax.swing.JFrame;
public class Estadisticas extends javax.swing.JFrame {

    
    public Estadisticas() throws IOException {
        initComponents();
        setSize(900, 700);
    }

                        
    private void initComponents() throws IOException {

        jPanel1 = new javax.swing.JPanel();
        volverb = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        
        String[] meses = {"Enero Febrero Marzo Abril Mayo Junio Julio Agosto Septiembre Octubre Noviembre Diciembre"};
        
    	DatosGrafica a= new	DatosGrafica();
    	int[] data = a.getData();
    	for (int i: data) {
    		System.out.println(i);
    	}
    	
        HotelOccupancyChart chart = new HotelOccupancyChart(data, meses, "Ocupación Hotel Andes", "meses", "porcentaje de ocupación"); 
        jPanel1.add(chart);
		chart.setBounds(10, 10, 810, 600);
		
		volverb.setBackground(new java.awt.Color(255, 249, 132));
        volverb.setText("Volver");
        jPanel1.add(volverb);
        volverb.setBounds(700, 630, 110, 30);
        volverb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	volverbActionPerformed(evt);
            }
        });
        

        
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 710);

        pack();
    }
    private void volverbActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	new ventana_principal_inicio().setVisible(true);
    	dispose();
    	
    }
    private javax.swing.JPanel jPanel1;
    HotelOccupancyChart chart ;
    private javax.swing.JButton volverb;
                    
}
