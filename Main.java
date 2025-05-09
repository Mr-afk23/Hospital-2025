import javax.swing.JFrame;  // Importa la clase JFrame para crear ventanas
import javax.swing.JLabel;  // Importa la clase JLabel para mostrar texto

public class Main {
    public static void main(String[] args) {
        // 1. Crear una ventana (JFrame)
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Mi Ventana");  // Establece el título
        miVentana.setSize(1000, 800);     // Establece el tamaño (ancho, alto)

        // 2. Crear un texto (JLabel)
        JLabel Texto = new JLabel();
        Texto.setText("Hola Mundo");      // Define el texto del JLabel
        miVentana.add(Texto);             // Añade el JLabel al JFrame

        // 3. Hacer visible la ventana
        miVentana.setVisible(true);
    }
}