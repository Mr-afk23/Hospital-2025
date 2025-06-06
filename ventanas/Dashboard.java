package ventanas;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Dashboard {

    private JFrame ventanaNueva;

    public Dashboard() {
        ventanaNueva = new JFrame("Vistas Doc");
        ventanaNueva.setSize(1000, 800);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaNueva.setLayout(new BorderLayout());

        // Crear la tabla directamente aquí
        String[] columnas = { "ID", "Nombre", "Edad" };
        Object[][] datos = {
            { 1, "Ana", 20 },
            { 2, "Luis", 22 },
            { 3, "María", 19 }
        };

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(base);
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Agregar la tabla al centro de la ventana
        ventanaNueva.add(scrollPane, BorderLayout.CENTER);

        ventanaNueva.setVisible(true);
    }

    public static void main(String[] args) {
    
            new Dashboard();
    }
}