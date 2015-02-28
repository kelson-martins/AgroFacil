/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.util;

import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.Painter;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 *
 * @author Kelson
 */
public class SimpleFillDesktopPane extends JDesktopPane {

    @Override
    public void updateUI() {
        if ("Nimbus".equals(UIManager.getLookAndFeel().getName())) {
            UIDefaults map = new UIDefaults();
            Painter<JComponent> painter = new Painter<JComponent>() {

                @Override
                public void paint(Graphics2D g, JComponent c, int w, int h) {
                    // file using normal desktop color
                    g.setColor(UIManager.getDefaults().getColor("desktop"));
                    g.fillRect(0, 0, w, h);
                }
            };
            map.put("DesktopPane[Enabled].backgroundPainter", painter);
            putClientProperty("Nimbus.Overrides", map);
        }
        super.updateUI();
    }
}
