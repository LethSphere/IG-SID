/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.principal;

import app.login.LoginTemplate;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runAplication = new Runnable(){

            @Override
            public void run() {
               //VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
               LoginTemplate login =new LoginTemplate();
               login.setVisible(true);
            }
        };   
        
        SwingUtilities.invokeLater(runAplication);
    }
    
}
