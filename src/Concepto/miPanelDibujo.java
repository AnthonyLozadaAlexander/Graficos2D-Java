package Concepto;

import javax.swing.*;
import java.awt.*;

public class miPanelDibujo extends JPanel {

   /* public miPanelDibujo() {
        setPreferredSize(new Dimension(800, 600));
    }*/

    @Override
    protected void paintComponent(Graphics g){

        // Limpiar pantalla antes de dibujar.
        super.paintComponent(g);

        // convertimos g a Graphics2D para tener acceso a funciones avanzadas.
        Graphics2D g2d = (Graphics2D) g;

        // Activamos Antialising para suavizado de bordes
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujamos un rectangulo relleno de color azul
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 150, 100);

        // Dibujamos el contorno del rectangulo de color Rojo
        g2d.setColor(Color.RED);
        g2d.drawRect(250, 50, 150, 100);

        // Dibujar un circulo relleno (color verde)
        g2d.setColor(Color.GREEN);
        g2d.fillOval(50, 200, 100, 100); // si ancho y altura son iguales es un circulo perfecto

        g2d.setColor(Color.BLACK);
        g2d.drawLine(250, 250, 400, 250);
    }
}
