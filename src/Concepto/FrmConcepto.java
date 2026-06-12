/*
 * Created by JFormDesigner on Fri Jun 12 01:44:11 GMT-05:00 2026
 */

package Concepto;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author USUARIO
 */
public class FrmConcepto extends JFrame {
    public FrmConcepto() {
        initComponents();

        // Guardamos el tamanio original del JConcepto
        java.awt.Dimension tamanioOriginal = JConcepto.getPreferredSize();

        // cambiamos el layout de JConcepto
        JConcepto.setLayout(new java.awt.BorderLayout());

        // instanciamos el panel dibujo
        miPanelDibujo panelDibujo = new miPanelDibujo();

        // le damos el tamanio original al panelDibujo
        panelDibujo.setPreferredSize(tamanioOriginal);


        JConcepto.add(panelDibujo, java.awt.BorderLayout.CENTER);
        JConcepto.revalidate();
        JConcepto.repaint();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        JConcepto = new JPanel();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //======== JConcepto ========
        {
            JConcepto.setName("JConcepto");

            GroupLayout JConceptoLayout = new GroupLayout(JConcepto);
            JConcepto.setLayout(JConceptoLayout);
            JConceptoLayout.setHorizontalGroup(
                JConceptoLayout.createParallelGroup()
                    .addGap(0, 855, Short.MAX_VALUE)
            );
            JConceptoLayout.setVerticalGroup(
                JConceptoLayout.createParallelGroup()
                    .addGap(0, 619, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(JConcepto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(JConcepto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JPanel JConcepto;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
