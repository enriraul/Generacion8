import java.awt.CardLayout;
import javax.swing.*;

public class Panel extends JFrame{
    
    private CardLayout cardLayout;
    private JPanel contenedor;

    private JPanel panel1;
    private JPanel panel2;

    public Panel(){
        setTitle("Ejemplo de cambio de vista");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Segmento de estructura de CardLayout
        cardLayout = new CardLayout();
        contenedor = new JPanel(cardLayout);

        panel1 = new JPanel();
        JButton btnPanel1 = new JButton("Ir al panel 2");
        JLabel label1 = new JLabel("Este es el panel numero 1");
        panel1.add(btnPanel1);
        panel1.add(label1);

        
        panel2 = new JPanel();
        JButton btnPanel2 = new JButton("Ir al panel 1");
        JLabel label2 = new JLabel("Este es el panel numero 2");
        panel2.add(btnPanel2);
        panel2.add(label2);

        contenedor.add(panel1,"panel1");
        contenedor.add(panel2,"panel2");


        btnPanel1.addActionListener(e ->
            cardLayout.show(contenedor,"panel2")
        );
        btnPanel2.addActionListener(e ->
            cardLayout.show(contenedor,"panel1")
        );


        add(contenedor);
        setVisible(true);
    }
    public static void main(String[] args) {
        Panel panel = new Panel();
    }

}