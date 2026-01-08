import java.awt.FlowLayout;
import javax.swing.*;


public class Ventana{
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(1000,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());


        //Componentes
        JLabel etiqueta = new JLabel("Ejemplo de texto para mostrar en interfaz");
        JButton boton = new JButton("Botón de prueba");
        JTextArea area = new JTextArea(20,50);
        JTextField texto = new JTextField(20);

        ventana.add(boton);
        ventana.add(etiqueta);
        ventana.add(area);
        ventana.add(texto);
        ventana.setVisible(true);
                
    }
}