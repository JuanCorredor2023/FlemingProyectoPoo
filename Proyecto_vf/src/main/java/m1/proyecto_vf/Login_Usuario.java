/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m1.proyecto_vf;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Login_Usuario extends JFrame {
    
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
        panel_principal = new JPanel(new GridBagLayout()); // Usar GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        
        lb_titulo = new JLabel("F L E M I N G");
        txt_login = new JLabel("USER LOGIN");
        lb_usuario = new JLabel("Usuario:");
        lb_pass = new JLabel("Contraseña:");
        txt_usuario = new JTextField(15);
        txt_pass = new JTextField(15);
        bt_cancelar = new JButton("Cancelar");
        bt_aceptar = new JButton("Aceptar");

        bt_aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Evaluar las credenciales
            }
        });
        /*
        bt_cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //setVisible(false);
                //Preambulo preambulo = new Preambulo();
                preambulo.setVisible(true);
                preambulo.setSize(400, 400);
                preambulo.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
        */
        // Configuración de los componentes con GridBagConstraints
        gbc.insets = new Insets(10, 10, 10, 10); // Margen alrededor de cada componente

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel_principal.add(lb_titulo, gbc);

        gbc.gridy = 1;
        panel_principal.add(txt_login, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel_principal.add(lb_usuario, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel_principal.add(txt_usuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel_principal.add(lb_pass, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel_principal.add(txt_pass, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        panel_principal.add(bt_cancelar, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel_principal.add(bt_aceptar, gbc);

        setContentPane(panel_principal);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack(); // Ajusta el tamaño del frame según sus contenidos
        setLocationRelativeTo(null); // Centra el frame en la pantalla
    }
}
