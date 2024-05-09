/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author JB
 */
public class Display_Usuario extends JFrame{
    
    private JPanel panel_principal; // aqui va todo/content pane
    private JPanel panel_segundo; // aqui se despliega el nombre del usuario actual
    private JPanel panel_tercero; // aqui es donde se desplegaran los distintos profesionales
    private JLabel lb_user;
    
    // panel tercero
    //componentes para la barra de busqueda
    private JLabel lb_search;
    private JTextField txt_search;
    private JComboBox cb_especialidad; // combo box que permite filtrar por especialidad
    // componentes para el display de profesionales
    private ArrayList<String> array_especialidades;
    private JScrollPane scroll;
    private JPanel panel_scroll;
    private ArrayList<Profesionista> array_profesional;
    private ArrayList<Profesionista> array_seleccionado;
    
    public Display_Usuario() {
        
        panel_principal = new JPanel();
        panel_segundo = new JPanel();
        panel_tercero = new JPanel();
        lb_user = new JLabel(); // dentro de aqui se debe de extraer el nombre del currect user
        // lo que esta dentro del .txt
        lb_search = new JLabel("Buscar: ");
        txt_search = new JTextField(150);
        cb_especialidad = new JComboBox();
        array_especialidades = new ArrayList<String>();
        panel_scroll = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        scroll = new JScrollPane(panel_scroll);
        array_profesional = new ArrayList<Profesionista>();
        array_seleccionado = new ArrayList<Profesionista>();
        // To do: un bucla para meter en array que extraiga cada uno de los 
        // profesional de la base de datos
     
        for(int i = 0; i < array_profesional.size(); i++){
            if(!array_especialidades.contains(array_profesional.get(i).getEspecialidad())){
                array_especialidades.add(array_profesional.get(i).getEspecialidad());
            }
        }
        // crea el combo con todas las especialidades
        for(int i = 0; i < array_especialidades.size(); i++){
            cb_especialidad.addItem(array_especialidades.get(i));
        } 
        // Todo: filtrar los profesionistas del campo seleccionado
        
        for(int i = 0; i < array_seleccionado.size(); i++){
            FicheroProfesional fich_prof = new FicheroProfesional(array_seleccionado.get(i).getNombre(), array_seleccionado.get(i).getEspecialidad(), array_seleccionado.get(i).getCiudad(), array_seleccionado.get(i).getUbicacion(), array_seleccionado.get(i).getCorreo(), array_seleccionado.get(i).getNumero_telefono());
            fich_prof.setPreferredSize(new Dimension(200, 100));
            panel_scroll.add(fich_prof);
        }
    }
    
    
    
    
}
