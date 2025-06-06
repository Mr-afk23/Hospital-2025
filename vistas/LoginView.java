package vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ventanas.Dashboard;
import ventanas.Dashboard;
import control.LoginControler;


import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginView {
    private JPanel panelLogin;

    public LoginView(){
 panelLogin = new JPanel();

panelLogin.setSize(500,800);
panelLogin.setOpaque(true);
panelLogin.setBackground(Color.white);
panelLogin.setBorder(BorderFactory.createEmptyBorder(200,100,10,10));

panelLogin.setLayout(new BoxLayout(panelLogin, BoxLayout.Y_AXIS));


//Titulo 
JLabel titulo = new JLabel("Login");
panelLogin.add(titulo);
panelLogin.add(Box.createRigidArea(new Dimension(100, 20)));


//Entrada de correo 
JTextField entradaCorreo = new JTextField("Correo :  ");
entradaCorreo.setPreferredSize(new Dimension(260,50));
panelLogin.add(entradaCorreo);
entradaCorreo.setAlignmentX(Component.CENTER_ALIGNMENT);
panelLogin.add(Box.createRigidArea(new Dimension(0, 20)));
entradaCorreo.setMaximumSize(new Dimension(500,30));


// Entrada de cotraseña

JTextField entradaContra = new JTextField("Contraseña :  ");
entradaContra.setPreferredSize(new Dimension(250,50));
panelLogin.add(entradaContra);
entradaContra.setAlignmentX(Component.CENTER_ALIGNMENT);
panelLogin.add(Box.createRigidArea(new Dimension(0, 20)));
entradaContra.setMaximumSize(new Dimension(500,20));

// Entrada Inicio

// Subpanel para controlar el ancho del botón y su posición
JPanel panelBoton = new JPanel();
panelBoton.setLayout(new BoxLayout(panelBoton, BoxLayout.X_AXIS));
panelBoton.setOpaque(false); // Para mantener fondo blanco del padre

// Limitar el tamaño del subpanel (ancho y alto)
panelBoton.setMaximumSize(new Dimension(500, 40));
panelBoton.setPreferredSize(new Dimension(500, 40));
panelBoton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra el subpanel en el panelLogin


// Crear el botón
JButton entradaInicio = new JButton("Inicio");
entradaInicio.setPreferredSize(new Dimension(100, 30));
entradaInicio.setMaximumSize(new Dimension(100, 30));
entradaInicio.addActionListener(new ActionListener(){
    @Override 
    public void actionPerformed(ActionEvent e){
        System.out.println("Botòn Precionado");


        // Recuperar datos 
        String entradUsuario =entradaCorreo.getText();
        String entradaContrasenna = entradaContra.getText();


        if (new LoginControler().validacionDatos(entradUsuario, entradaContrasenna)){ {
            
            
            Component comp = (Component) e.getSource();
            JFrame ventanaPadre = (JFrame) SwingUtilities.getWindowAncestor(comp);
            ventanaPadre.dispose();
     


   new Dashboard();
   
        
    } 

    }}});

// Poner "pegamento" a la izquierda para empujar el botón a la derecha dentro del panelBoton
panelBoton.add(Box.createHorizontalGlue());
panelBoton.add(entradaInicio);

// Agregar el subpanel con el botón al panel principal
panelLogin.add(panelBoton);


    }

    public JPanel getPanel(){
        return panelLogin;
    }


 

}
