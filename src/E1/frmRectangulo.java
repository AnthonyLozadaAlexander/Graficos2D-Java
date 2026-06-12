/*
 * Created by JFormDesigner on Fri Jun 12 03:06:33 GMT-05:00 2026
 */

package E1;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author USUARIO
 */
public class frmRectangulo extends JFrame {
    public frmRectangulo() {
        initComponents();
        // Guardamos el tamanio original del JConcepto
        java.awt.Dimension tamanioOriginal = JE1.getPreferredSize();

        // cambiamos el layout de JConcepto
        JE1.setLayout(new java.awt.BorderLayout());

        // instanciamos el panel dibujo
        DibujoRectangulo panelDibujo = new DibujoRectangulo();

        // le damos el tamanio original al panelDibujo
        panelDibujo.setPreferredSize(tamanioOriginal);


        JE1.add(panelDibujo, java.awt.BorderLayout.CENTER);
        JE1.revalidate();
        JE1.repaint();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        JE1 = new JPanel();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //======== JE1 ========
        {
            JE1.setName("JE1");

            GroupLayout JE1Layout = new GroupLayout(JE1);
            JE1.setLayout(JE1Layout);
            JE1Layout.setHorizontalGroup(
                JE1Layout.createParallelGroup()
                    .addGap(0, 867, Short.MAX_VALUE)
            );
            JE1Layout.setVerticalGroup(
                JE1Layout.createParallelGroup()
                    .addGap(0, 644, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(JE1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(JE1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JPanel JE1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
