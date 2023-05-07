package interfazGrafica;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HotelOccupancyChart extends JPanel {

    private int[] datos;
    private String[] meses;
    private String titulo;
    private String nombreEjeX;
    private String nombreEjeY;

    public HotelOccupancyChart(int[] datos, String[] meses, String titulo, String nombreEjeX, String nombreEjeY) {
        this.datos = datos;
        this.meses = meses;
        this.titulo = titulo;
        this.nombreEjeX = nombreEjeX;
        this.nombreEjeY = nombreEjeY;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int anchoGrafica = getWidth() - 100;
        int altoGrafica = getHeight() - 100;

        int anchoBarra = anchoGrafica / datos.length;

        //  ejes
        g2d.drawLine(50, getHeight() - 50, 50, 50);
        g2d.drawLine(50, getHeight() - 50, getWidth() - 50, getHeight() - 50);

        //  título
        g2d.setFont(new Font("Arial", Font.BOLD, 16));
        g2d.drawString(titulo, getWidth() / 2 - 50, 30);

        //  nombre del eje X
        g2d.drawString(nombreEjeX, getWidth() / 2 - 20, getHeight() - 10);

        //  nombre del eje Y
        g2d.rotate(-Math.PI / 2);
        g2d.drawString(nombreEjeY, -getHeight() / 2 + 20, 20);
        g2d.rotate(Math.PI / 2);

        //  barras
        int x = 70;
        for (int i = 0; i < datos.length; i++) {
            int valor = datos[i];
            int alto = valor * (altoGrafica / 100);
            int y = getHeight() - 50 - alto;
            g2d.setColor(Color.PINK);
            g2d.fillRect(x, y, anchoBarra - 10, alto);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x, y, anchoBarra - 10, alto);
            x += anchoBarra;
        }

        //  nombres  en el eje X
        x = 70;
        int y = getHeight() - 30;
        for (int i = 0; i < meses.length; i++) {
            g2d.drawString(meses[i], x, y);
            x += anchoBarra;
        }
    }

    public static void main(String[] args) {
        
        String[] meses = {"Enero Febrero Marzo Abril Mayo Junio Julio Agosto Septiembre Octubre Noviembre Diciembre"};
       
        		
        	int[] data = {30,25,15,34,21,60,55,20,12,20,25,40};
            HotelOccupancyChart chart = new HotelOccupancyChart(data, meses, "Ocupación Hotel Andes", "meses", "porcentaje de ocupación"); 

            JFrame frame = new JFrame("Hotel Occupancy Chart");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(810, 600);
            frame.getContentPane().add(chart);
            frame.setVisible(true);
    }
}

      
            
        
