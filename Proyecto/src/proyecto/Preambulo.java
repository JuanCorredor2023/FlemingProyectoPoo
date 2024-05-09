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
public class Preambulo extends JFrame{

    private JPanel panel_principal;
    private JButton bt_usuario;
    private JButton bt_profesionista;
    private JButton bt_admin;
    private JLabel lb_titulo;
    
    public Preambulo() {
        
        panel_principal = new JPanel();
        bt_usuario = new JButton("Usuario");
        bt_profesionista = new JButton("Profesionista");
        bt_admin = new JButton("Administrador");
        lb_titulo = new JLabel("F L E M I N G");
        
        bt_admin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_Admin login_admin = new Login_Admin();
                login_admin.setVisible(true);
                login_admin.setSize(400, 400);
                login_admin.setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        
        bt_usuario.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Login_Usuario login_usuario = new Login_Usuario();
                login_usuario.setVisible(true);
                login_usuario.setSize(400, 400);
                login_usuario.setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        
        bt_profesionista.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Login_Profesionista login_profesionista = new Login_Profesionista();
                login_profesionista.setVisible(true);
                login_profesionista.setSize(400, 400);
                login_profesionista.setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        
        lb_titulo.setBounds(155, 40, 100, 25);
        bt_usuario.setBounds(30, 80, 150, 25);
        bt_profesionista.setBounds(200, 80, 150, 25);
        bt_admin.setBounds(110, 130, 150, 25);
        
        panel_principal.add(lb_titulo);
        panel_principal.add(bt_usuario);
        panel_principal.add(bt_profesionista);
        panel_principal.add(bt_admin);
        
        
        setContentPane(panel_principal);
        panel_principal.setLayout(null);
        
    }
}
