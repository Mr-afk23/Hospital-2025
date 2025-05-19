import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.LoginView;
import vistas.BannerView;

public class Main {
    public static void main(String[] args) {
        // 1. Crear una ventana (JFrame)
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Mi Ventana");  // Establece el título
        miVentana.setSize(1000, 800); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Establece el tamaño (ancho, alto)
        miVentana.setLayout(new BorderLayout());
        
        JPanel panelBanner = new JPanel();
        
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner ,BorderLayout.WEST);



LoginView panelLogin = new LoginView();
miVentana.add(panelLogin.getPanel(), BorderLayout.CENTER);




// 3. Hacer visible la ventana
miVentana.setVisible(true);


    }
}