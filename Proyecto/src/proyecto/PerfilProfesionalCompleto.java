/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JB
 */
public class PerfilProfesionalCompleto extends JFrame{
    
    private JPanel panel;
    private JLabel lb_nombre;
    private String nombre;
    private JLabel lb_especialidad;
    private String especialidad;
    
    private JLabel lb_location;
    private JLabel lb_ciudad;
    private String ciudad;
    private JLabel lb_ubicacion;
    private String ubicacion;
    private JLabel lb_contacto;
    
    private JLabel lb_correo;
    private String correo;
    private JLabel lb_numerotel;
    private String numero_telefono;

    // lo de las reviews
    private ScrollPane scroll;
    private ArrayList<Review> array_reviews;
    private JTextArea txta_reviews;
    // TO DO: agregar lo correspondiente al JCalendar
    
    
    
    private JButton bt_regresar;

    public PerfilProfesionalCompleto(String nombre, String especialidad, String ciudad, String ubicacion, String correo, String numero_telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.ciudad = ciudad;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.numero_telefono = numero_telefono;
        
        panel = new JPanel();
        
        // la info del profesional
        lb_nombre = new JLabel(nombre);
        lb_especialidad = new JLabel(especialidad);
        lb_ciudad = new JLabel(ciudad);
        lb_location = new JLabel("Localización:");
        lb_ubicacion = new JLabel(ubicacion);
        lb_contacto = new JLabel("Contacto:");
        lb_correo = new JLabel(correo);
        lb_numerotel = new JLabel(numero_telefono);
        
        // lo de las reviews
        array_reviews = new ArrayList<Review>();
        txta_reviews.setText("Reseñas:");
        // TO Do: bucle para almacenar en el ArrayList todas las reviews
        // probablemente un while
        
        // bucle que imprima las reviews en el JTextArea
        for(int i = 0; i < array_reviews.size(); i++){
            txta_reviews.append("Autor: ");
            txta_reviews.append(array_reviews.get(i).getAutor() + "\n");
            txta_reviews.append(array_reviews.get(i).getBody() + "\n");
            txta_reviews.append("\n");
            txta_reviews.append("\n");
        }
        
        txta_reviews = new JTextArea(300, (array_reviews.size())*5);
        scroll = new ScrollPane();
        
        // TO DO: agregar lo correspondiente al JCalendar
        
        bt_regresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Display_Usuario display = new Display_Usuario();
                display.setVisible(true);
                display.setSize(400, 400);
                display.setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        
        lb_nombre.setBounds(50, 50, 100, 25);
        lb_especialidad.setBounds(50, 80, 100, 25);
        lb_location.setBounds(50, 110, 100, 25);
        lb_ciudad.setBounds(50, 140, 100, 25);
        lb_ubicacion.setBounds(50, 170, 100, 25);
        lb_contacto.setBounds(50, 200, 100, 25);
        lb_correo.setBounds(50, 230, 100, 25);
        lb_numerotel.setBounds(50, 260, 100, 25);
        // TO DO: agregar los bounds del textarea, y el srcoll 
        // el txta es dentto del scroll
        
        panel.add(lb_nombre);
        panel.add(lb_especialidad);
        panel.add(lb_location);
        panel.add(lb_ciudad);
        panel.add(lb_ubicacion);
        panel.add(lb_contacto);
        panel.add(lb_correo);
        panel.add(lb_numerotel);
        panel.add(scroll);
        panel.add(txta_reviews);
    }
    
    
}
