/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_vistauser;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author juan
 */
public class Proyecto_VistaUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Doctor Display App");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        DoctorDisplay display = new DoctorDisplay();
        frame.add(display);
        frame.setVisible(true);
    }
}
  