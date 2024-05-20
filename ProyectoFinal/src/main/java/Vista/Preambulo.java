/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

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
    private JPanel panel_header;
    private JPanel panel_body;

    private JLabel lb_titulo;
    private JLabel lb_subtitulo;
    private JLabel ic_logo;
    
    private JButton bt_user;
    private JButton bt_doctor;
    private JButton bt_admin;

    public Preambulo() {
        
        panel_principal = new JPanel();
        panel_header = new JPanel();
        panel_body = new JPanel();
        
        lb_titulo = new JLabel("F L E M I N G");
        lb_subtitulo = new JLabel("Conectándote con los mejores profesionales");
        
        bt_user = new JButton("Usuario");
        bt_doctor = new JButton("Doctor");
        bt_admin = new JButton("Administrador");
        
        bt_user.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_User login_user = new Login_User();
                login_user.setExtendedState(JFrame.MAXIMIZED_BOTH);
                login_user.setDefaultCloseOperation(EXIT_ON_CLOSE);
                login_user.setVisible(true);
                setVisible(false);
            }
        });
        
        bt_doctor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_Doctor login_doc = new Login_Doctor();
                login_doc.setExtendedState(JFrame.MAXIMIZED_BOTH);
                login_doc.setDefaultCloseOperation(EXIT_ON_CLOSE);
                login_doc.setVisible(true);
                setVisible(false);
            }
        });
        
        bt_admin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Login_Admin login_admin = new Login_Admin();
                login_admin.setExtendedState(JFrame.MAXIMIZED_BOTH);;
                login_admin.setDefaultCloseOperation(EXIT_ON_CLOSE);
                login_admin.setVisible(true);
                setVisible(false);
            }
        });
        
        lb_titulo.setBounds(155, 40, 100, 25);
        bt_user.setBounds(30, 80, 150, 25);
        bt_doctor.setBounds(200, 80, 150, 25);
        bt_admin.setBounds(110, 130, 150, 25);
        
        panel_principal.add(lb_titulo);
        panel_principal.add(bt_user);
        panel_principal.add(bt_doctor);
        panel_principal.add(bt_admin);
        
        
        setContentPane(panel_principal);
        panel_principal.setLayout(null);
        
    }
}
