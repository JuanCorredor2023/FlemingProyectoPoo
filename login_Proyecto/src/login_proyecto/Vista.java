/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_proyecto;

import javax.swing.*;


/**
 *
 * @author juan
 */
public class Vista extends JFrame {
    private JLabel titulo;
    private JLabel txtLogin;
    private JLabel lUsuario;
    private JTextField tUsuario; 
    private JLabel lPass;
    private JTextField tPass; 
    private JButton bCancelar;
    private JButton bAceptar;
    private JPanel panel;

       

    public Vista() {
        
        panel = new JPanel();
        titulo = new JLabel("F L E M I N G");
        txtLogin = new JLabel("DOCTOR  LOGIN");
        lUsuario = new JLabel("Usuario: ");
        lPass = new JLabel("Contraseña: ");
        tUsuario = new JTextField(100);
        tPass = new JTextField(100);

        bCancelar = new JButton("Cancelar");
        bAceptar = new JButton("Aceptar");
        
        titulo.setBounds(130, 40, 100, 25);
        txtLogin.setBounds(120, 80, 150, 25);
        lUsuario.setBounds(70, 120, 100, 25);
        tUsuario.setBounds(180, 120, 100, 25);
        lPass.setBounds(70, 160, 100, 25);
        tPass.setBounds(180, 160, 100, 25);
        bCancelar.setBounds(60, 200, 100, 25);
        bAceptar.setBounds(180, 200, 100, 25);
        
        panel.add(titulo);
        panel.add(txtLogin);
        panel.add(lUsuario);
        panel.add(tUsuario);
        panel.add(lPass);
        panel.add(tPass);

        panel.add(bCancelar);
        panel.add(bAceptar);
        
        setContentPane(panel);
        panel.setLayout(null);
        
    }
}
