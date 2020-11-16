/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.login;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author User
 */
public class LoginTemplate extends JFrame {

    //Objetos graficos
    private JPanel pIzq, pDer;
    private JLabel lTituloApp, lEslogan1, lEslogan2, lOpcionesLogin, lResetPassword,lTyC1,lTyC2;
    private JTextField tCorreo;
    private JPasswordField tPassword;
    private JComboBox<String> cbTipoUser;
    private JButton bIniciarSesion, bIniciarFace, bIniciarGoogle, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;

    Color colorPinterest = new Color(230, 0, 35);

    public LoginTemplate() {
        super("Login de usuario");

        pIzq = new JPanel();
        pIzq.setSize(400, 500);
        pIzq.setLocation(0, 0);
        pIzq.setBackground(colorPinterest);
        pIzq.setLayout(null);
        this.add(pIzq);

        pDer = new JPanel();
        pDer.setSize(400, 500);
        pDer.setLocation(400, 0);
        pDer.setBackground(Color.white);
        pDer.setLayout(null);
        this.add(pDer);

        lTituloApp = new JLabel("Pinterest LOGO");
        lTituloApp.setSize(200, 40);
        lTituloApp.setLocation((pIzq.getWidth() - lTituloApp.getWidth()) / 2, 200);
        lTituloApp.setForeground(Color.WHITE);
        pIzq.add(lTituloApp);

        lEslogan1 = new JLabel("Te damos la bienvenida a");
        lEslogan1.setSize(230, 120);
        lEslogan1.setLocation((pDer.getWidth() - lEslogan1.getWidth()) / 2, 20);
        lEslogan1.setForeground(Color.DARK_GRAY);
        lEslogan1.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(lEslogan1);

        lEslogan2 = new JLabel("Pinterest");
        lEslogan2.setSize(130, 120);
        lEslogan2.setLocation((pDer.getWidth() - lEslogan2.getWidth()) / 2, 40);
        lEslogan2.setForeground(Color.DARK_GRAY);
        lEslogan2.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(lEslogan2);

        tCorreo = new JTextField("Correo");
        tCorreo.setSize(150, 20);
        tCorreo.setLocation((pDer.getWidth() - tCorreo.getWidth()) / 2, 130);
        tCorreo.setForeground(Color.LIGHT_GRAY);
        tCorreo.setBackground(Color.WHITE);
        tCorreo.setCaretColor(Color.red);
        tCorreo.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(tCorreo);

        tPassword = new JPasswordField("CLAVE");
        tPassword.setSize(150, 20);
        tPassword.setLocation((pDer.getWidth() - tPassword.getWidth()) / 2, 160);
        tPassword.setForeground(Color.LIGHT_GRAY);
        tPassword.setBackground(Color.WHITE);
        tPassword.setCaretColor(Color.red);
        tPassword.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(tPassword);

        lResetPassword = new JLabel("¿Olvidaste tu contraseña?");
        lResetPassword.setSize(300, 20);
        lResetPassword.setLocation((pDer.getWidth() - lResetPassword.getWidth()) / 2, 180);
        lResetPassword.setForeground(Color.DARK_GRAY);
        lResetPassword.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(lResetPassword);

        bIniciarSesion = new JButton("Iniciar sesión");
        bIniciarSesion.setSize(170, 25);
        bIniciarSesion.setLocation((pDer.getWidth() - bIniciarSesion.getWidth()) / 2, 210);
        bIniciarSesion.setBackground(colorPinterest);
        bIniciarSesion.setForeground(Color.white);
        bIniciarSesion.setFocusable(false);
        pDer.add(bIniciarSesion);

        lOpcionesLogin = new JLabel("o");
        lOpcionesLogin.setSize(50, 20);
        lOpcionesLogin.setLocation((pDer.getWidth() - lOpcionesLogin.getWidth()) / 2, 240);
        lOpcionesLogin.setForeground(Color.DARK_GRAY);
        lOpcionesLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(lOpcionesLogin);

        bIniciarFace = new JButton("Iniciar con FaceBook");
        bIniciarFace.setSize(170, 25);
        bIniciarFace.setLocation((pDer.getWidth() - bIniciarFace.getWidth()) / 2, 270);
        bIniciarFace.setBackground(Color.BLUE);
        bIniciarFace.setForeground(Color.white);
        bIniciarFace.setFocusable(false);
        pDer.add(bIniciarFace);

        bIniciarGoogle = new JButton("Iniciar con Google ");
        bIniciarGoogle.setSize(170, 25);
        bIniciarGoogle.setLocation((pDer.getWidth() - bIniciarGoogle.getWidth()) / 2, 300);
        bIniciarGoogle.setBackground(Color.white);
        bIniciarGoogle.setForeground(Color.darkGray);
        bIniciarGoogle.setFocusable(false);
        pDer.add(bIniciarGoogle);
        
        lTyC1 = new JLabel("Al continuar, aceptas las Condiciones de servicio y la");
        lTyC1.setSize(300, 20);
        lTyC1.setLocation((pDer.getWidth() - lTyC1.getWidth()) / 2, 360);
        lTyC1.setForeground(Color.DARK_GRAY);
        lTyC1.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(lTyC1);
        
        lTyC2 = new JLabel("Política de privacidad de Pinterest.");
        lTyC2.setSize(300, 20);
        lTyC2.setLocation((pDer.getWidth() - lTyC2.getWidth()) / 2, 380);
        lTyC2.setForeground(Color.DARK_GRAY);
        lTyC2.setHorizontalAlignment(SwingConstants.CENTER);
        pDer.add(lTyC2);

        bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setBackground(colorPinterest);
        bCerrar.setForeground(Color.white);
        bCerrar.setFocusable(false);
        pDer.add(bCerrar);

        bRegistrarse = new JButton("¿Aún no estás en Pinterest? Regístrate");
        bRegistrarse.setSize(300, 20);
        bRegistrarse.setLocation((pDer.getWidth() - bRegistrarse.getWidth()) / 2, 420);
        bRegistrarse.setBackground(Color.white);
        bRegistrarse.setForeground(Color.black);
        bRegistrarse.setFocusable(false);
        pDer.add(bRegistrarse);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 500);
        setLocationRelativeTo(this);

    }

}
