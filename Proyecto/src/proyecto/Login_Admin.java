/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JB
 */
public class Login_Admin extends JFrame{
    
    private JPanel panel;
    private JLabel lb_titulo;
    private JLabel lb_login;
    private JLabel lb_cod;
    private JTextField txt_cod;
    private JLabel lb_pass;
    private JTextField txt_pass;
    private JButton bt_cancelar;
    private JButton bt_aceptar;
    private ArrayList<Administrador> array_admin;

    public Login_Admin() {
        
        panel = new JPanel();
        lb_titulo = new JLabel("F L E M I N G");
        lb_login = new JLabel("ADMIN LOGIN");
        lb_cod = new JLabel("Codigo: ");
        txt_cod = new JTextField(100);
        lb_pass = new JLabel("Contraseña: ");
        txt_pass = new JTextField(100);
        bt_cancelar = new JButton("Cancelar");
        bt_aceptar = new JButton("Aceptar");
        array_admin = new ArrayList<Administrador>();
        
        // Todo: hacer un bucle para llenar el array admin con la info
        // de los admins de la base de datos
        
        bt_aceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Todo: verificar las credenciales
                Panel_Admin admin = new Panel_Admin();
                admin.setVisible(true);
                admin.setSize(600, 600);
                admin.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
        
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
        lb_login.setBounds(127, 80, 100, 25);
        lb_cod.setBounds(70, 120, 100, 25);
        txt_cod.setBounds(180, 120, 100, 25);
        lb_pass.setBounds(70, 160, 100, 25);
        txt_pass.setBounds(180, 160, 100, 25);
        bt_cancelar.setBounds(60, 200, 100, 25);
        bt_aceptar.setBounds(180, 200, 100, 25);
        
        panel.add(lb_titulo);
        panel.add(lb_login);
        panel.add(lb_cod);
        panel.add(txt_cod);
        panel.add(lb_pass);
        panel.add(txt_pass);
        panel.add(bt_cancelar);
        panel.add(bt_aceptar);
        
        setContentPane(panel);
        panel.setLayout(null);
    }
    
    
    
    
}
