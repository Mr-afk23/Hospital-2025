package ventanas;

import javax.swing.JFrame;

public class Dashboard extends JFrame{

    public Dashboard(){
        this.setTitle("Doctor Marcos");
        this.setSize(1000,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.setVisible(true);
    }
    
    public JFrame getDashFrame(){
        return this;
    }
}
