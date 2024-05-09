/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JB
 */
public class Login_Usuario extends JFrame{
    
    private JLabel lb_titulo;
    private JLabel txt_login;
    private JLabel lb_usuario;
    private JTextField txt_usuario; 
    private JLabel lb_pass;
    private JTextField txt_pass; 
    private JButton bt_cancelar;
    private JButton bt_aceptar;
    private JPanel panel_principal;
    
    
    public Login_Usuario() {
        panel_principal = new JPanel();
        lb_titulo = new JLabel("F L E M I N G");
        txt_login = new JLabel("USER LOGIN");
        lb_usuario = new JLabel("Usuario: ");
        lb_pass = new JLabel("Contraseña: ");
        txt_usuario = new JTextField(100);
        txt_pass = new JTextField(100);
        bt_cancelar = new JButton("Cancelar");
        bt_aceptar = new JButton("Aceptar");
        
        bt_aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Evaluar las credenciales
            }
        });
        
        // Sirve para regresar a la vista del preambulo
        bt_cancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Preambulo preambulo = new Preambulo();
                preambulo.setVisible(true);
                preambulo.setSize(400, 400);
                preambulo.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
        
        
        lb_titulo.setBounds(130, 40, 100, 25);
        txt_login.setBounds(127, 80, 100, 25);
        lb_usuario.setBounds(70, 120, 100, 25);
        txt_usuario.setBounds(180, 120, 100, 25);
        lb_pass.setBounds(70, 160, 100, 25);
        txt_pass.setBounds(180, 160, 100, 25);
        bt_cancelar.setBounds(60, 200, 100, 25);
        bt_aceptar.setBounds(180, 200, 100, 25);
        
        panel_principal.add(lb_titulo);
        panel_principal.add(txt_login);
        panel_principal.add(lb_usuario);
        panel_principal.add(txt_usuario);
        panel_principal.add(lb_pass);
        panel_principal.add(txt_pass);
        panel_principal.add(bt_cancelar);
        panel_principal.add(bt_aceptar);
        
        setContentPane(panel_principal);
        panel_principal.setLayout(null);
        
    }
    
}

