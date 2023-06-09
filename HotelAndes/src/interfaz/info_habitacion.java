package interfaz;

import java.io.IOException;
import java.util.ArrayList;

import controlador.controlador;

public class info_habitacion extends javax.swing.JFrame {
	controlador control= controlador.getInstance();
    /**
     * Creates new form info_habitacion
     */
    public info_habitacion(String id,String fechaInicio,String fechaFin,ArrayList<String>disponibles) {
        initComponents(id,fechaInicio,fechaFin,disponibles);
        setSize(490, 800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String id,String fechaInicio,String fechaFin,ArrayList<String>disponibles) {
    	
    	ArrayList<String> info=control.mostrarCaracteristicasHbatiacion(id);
    	System.out.println(info);

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
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(212, 227, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Datos de habitación:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 160, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setText(info.get(0));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 30, 190, 28);
        jTextField2.setText(info.get(1));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 60, 190, 28);
        jTextField3.setText(info.get(2));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 90, 190, 28);

        jTextField4.setText(info.get(3));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 120, 190, 28);

        jButton1.setBackground(new java.awt.Color(255, 249, 132));
        jButton1.setText("Reservar");
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 630, 110, 30);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1ActionPerformed(evt,id,fechaInicio,fechaFin);
            }
        });
        

        jButton2.setBackground(new java.awt.Color(255, 249, 132));
        jButton2.setText("Volver");
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 630, 110, 30);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton2ActionPerformed(evt,fechaInicio,fechaFin,disponibles);
            }
        });
        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 30, 12, 17);

        jLabel3.setText("TIPO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 60, 28, 17);

        jLabel4.setText("CAPACIDAD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 90, 80, 17);

        jLabel5.setText("TAMAÑO M2");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 120, 80, 17);

        jButton3.setBackground(new java.awt.Color(255, 249, 132));
        jButton3.setText("Volver a la lista");
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 630, 120, 30);

        jLabel6.setText("UBICACIÓN");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 150, 80, 17);

        jLabel7.setText("VISTA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 180, 34, 17);

        jLabel8.setText("BALCÓN");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 210, 60, 17);

        jLabel9.setText("COCINA");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 240, 50, 17);

        jLabel10.setText("AIRE ACON.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 270, 80, 17);

        jLabel11.setText("CALEFACCIÓN");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 300, 90, 17);

        jLabel12.setText("TAMAÑO CAMA");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 330, 100, 17);

        jLabel13.setText("TV");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 360, 15, 17);

        jLabel14.setText("CAFETERA");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 390, 70, 17);

        jLabel15.setText("ROPA DE CAMA");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 420, 100, 17);

        jLabel16.setText("PLANCHA");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 450, 70, 17);

        jLabel17.setText("SECADOR DE PELO");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(50, 480, 120, 17);

        jLabel18.setText("VOLTAJE AC");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 510, 80, 17);

        jLabel19.setText("USB-A");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(50, 540, 39, 17);

        jLabel20.setText("USB-C");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(50, 570, 40, 17);

        jTextField5.setText(info.get(4));
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 120, 190, 20);

        jTextField6.setText(info.get(5));
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 150, 190, 28);

        jTextField7.setText(info.get(6));
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 180, 190, 28);

        jTextField8.setText(info.get(7));
        jPanel1.add(jTextField8);
        jTextField8.setBounds(170, 210, 190, 28);

        jTextField9.setText(info.get(8));
        jPanel1.add(jTextField9);
        jTextField9.setBounds(170, 240, 190, 28);

        jTextField10.setText(info.get(9));
        jPanel1.add(jTextField10);
        jTextField10.setBounds(170, 270, 190, 28);

        jTextField11.setText(info.get(10));
        jPanel1.add(jTextField11);
        jTextField11.setBounds(170, 300, 190, 28);

        jTextField12.setText(info.get(11));
        jPanel1.add(jTextField12);
        jTextField12.setBounds(170, 330, 190, 28);

        jTextField13.setText(info.get(12));
        jPanel1.add(jTextField13);
        jTextField13.setBounds(170, 360, 190, 28);

        jTextField14.setText(info.get(13));
        jPanel1.add(jTextField14);
        jTextField14.setBounds(170, 390, 190, 28);

        jTextField15.setText(info.get(14));
        jPanel1.add(jTextField15);
        jTextField15.setBounds(170, 420, 190, 28);

        jTextField16.setText(info.get(15));
        jPanel1.add(jTextField16);
        jTextField16.setBounds(170, 450, 190, 28);

        jTextField17.setText(info.get(16));
        jPanel1.add(jTextField17);
        jTextField17.setBounds(170, 480, 190, 28);

        jTextField18.setText(info.get(17));
        jPanel1.add(jTextField18);
        jTextField18.setBounds(170, 510, 190, 28);

        jTextField19.setText(info.get(18));
        jPanel1.add(jTextField19);
        jTextField19.setBounds(170, 540, 190, 28);

        jTextField20.setText(info.get(19));
        jPanel1.add(jTextField20);
        jTextField20.setBounds(170, 570, 190, 28);

        jLabel21.setText("DESAYUNO");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(50, 600, 80, 17);

        jTextField21.setText(info.get(20));
        jPanel1.add(jTextField21);
        jTextField21.setBounds(170, 600, 190, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 670);

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt,String id,String fechaInicio,String fechaFin) {  
    	datos_huespedes datos=new datos_huespedes(id,fechaInicio,fechaFin);
    	dispose();
    	datos.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt,String fechaInicio,String fechaFin,ArrayList<String>disponibles) {
    	lista_habitaciones lista=new lista_habitaciones(disponibles,fechaInicio,fechaFin);
    	dispose();
    	lista.setVisible(true);
    }
   

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}
