import java.awt.BorderLayout;
import javax.swing.*;

import vistas.LoginView;
import vistas.BannerView;

public class Main {
    public static void main(String[] args) {
        // Crear ventana
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Mi Ventana");
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        // Agregar banner rojo a la izquierda
        BannerView panelBannerView = new BannerView();
        miVentana.add(panelBannerView.getPanel(), BorderLayout.WEST);

        // Agregar login centrado
        LoginView panelLogin = new LoginView();

        // Envolver el login en un JPanel con GridBagLayout para centrarlo
        JPanel centro = new JPanel(new java.awt.GridBagLayout());
        centro.setBackground(java.awt.Color.WHITE);
        centro.add(panelLogin.getPanel());

        miVentana.add(centro, BorderLayout.CENTER);

        // Mostrar ventana
        miVentana.setVisible(true);
    }
}
