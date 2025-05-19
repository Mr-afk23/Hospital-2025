package vistas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BannerView {
    JPanel panelBanner = new JPanel();
    
    public BannerView(){
        panelBanner.setPreferredSize(new Dimension(300, 800)); // ancho 300, alto 800
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
    }
    
    public JPanel getPanel(){
        return panelBanner;
    }
}
