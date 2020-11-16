
package app.vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Vahar
 */
public class VistaPrincipalTemplate extends JFrame {

    private JButton bEnviar;
    private JTextField tNombre;
    private JLabel lnombre;

    public VistaPrincipalTemplate() {

        super("Vista principal");
        this.saludar();
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public void saludar() {

        String mensaje = "Hola mundo";
        System.out.println(mensaje);
    }
}
