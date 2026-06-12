package E1Rectangulo;


import javax.swing.*;
import java.awt.*;

public class DibujoRectangulo extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.drawRect(50, 100, 60, 40);
    }
}
