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
public class FicheroProfesional extends JPanel{
    
    // cada uno de los ficheros es lo que funciona como el display de info de cada medico
    private JLabel lb_nombre;
    private String nombre;
    
    private JLabel lb_especialidad;
    private String especialidad;
    
    private JLabel lb_ciudad;
    private String ciudad;
    private JLabel lb_ubicacion;
    private String ubicacion;
    
    private JLabel lb_contacto;
    private JLabel lb_correo;
    private String correo;
    private JLabel lb_numerotel;
    private String numero_telefono;
    
    
    // un boton que permita al usuario ver el perfil completo del profesional
    // incluyendo opiniones de usuarios
    private JButton bt_expandir;

    public FicheroProfesional(String nombre, String especialidad, String ciudad, String ubicacion, String correo, String numero_telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.ciudad = ciudad;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.numero_telefono = numero_telefono;
    
        lb_nombre = new JLabel(nombre);
        lb_especialidad = new JLabel(especialidad);
        lb_ciudad = new JLabel(ciudad);
        lb_ubicacion = new JLabel(ubicacion);
        lb_contacto = new JLabel("Contacto:");
        lb_correo = new JLabel(correo);
        lb_numerotel = new JLabel(numero_telefono);
        
        bt_expandir = new JButton("Expandir");
        
        
        bt_expandir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                PerfilProfesionalCompleto completo = new PerfilProfesionalCompleto(nombre, especialidad, ciudad, ubicacion, correo, numero_telefono);
                completo.setVisible(true);
                completo.setSize(400, 400);
                completo.setDefaultCloseOperation(EXIT_ON_CLOSE);
                //this.setVisible(false); // debe de haber una forma de cerrar el display de todos
            }
        });
        
        
        
    }

    
    
    
}
