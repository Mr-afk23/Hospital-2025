package vistas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
public class BannerView {
    JPanel panelBanner = new JPanel();
    
    public BannerView(){
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
    }
    
    public JPanel getPanel(){
        return panelBanner;
    }
}