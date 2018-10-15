package swing;
/* importar libreria */
import javax.swing.*;
/* importar libreria de eventos */
import java.awt.event.*;


public class Swing extends JFrame implements ActionListener {
    
    private JLabel etiqueta1,etiqueta2, etiqueta3;
    private JButton botonsalida; 
    
    public Swing() {
        setLayout(null);
        etiqueta1 = new JLabel("Mi programa");
        etiqueta1.setBounds(100, 150, 260, 30);
        add(etiqueta1);
        etiqueta2 = new JLabel("Version 1.0");
        etiqueta2.setBounds(100, 165, 200, 30);
        add(etiqueta2);
        etiqueta3 = new JLabel("Yova M.");
        etiqueta3.setBounds(100, 180, 200, 30);
        add(etiqueta3);
        /** boton */
        botonsalida = new JButton("Salir");
        botonsalida.setBounds(100, 140, 200, 30);
        add(botonsalida);
        botonsalida.addActionListener(this);
    }
    
    /** codigo boton salir*/
    public void actionPerformed(ActionEvent ex){
    if(ex.getSource() == botonsalida){
           System.exit(0);
           }
    }
    /** fin codigo boton salir*/

    public static void main(String[] args) {
        Swing ventana1 = new Swing();
        /* tamaño de la ventana */
        ventana1.setBounds(10, 10, 300,400);
        /* visibilidad de la ventana */
        ventana1.setVisible(true);
        /* escalabilidad de la ventana*/
        ventana1.setResizable(false);
    }

}
