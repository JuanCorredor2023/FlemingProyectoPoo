/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_proyecto;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author juan
 */
public class Login_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista ventana = new Vista();
        ventana.setVisible(true);
        ventana.setSize(350, 300);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
