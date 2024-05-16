/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m1.proyecto_vf;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Calendario extends JPanel{

    private JLabel lb_titulo;
    private JPanel panel_botones;
    private JCalendar calendario;
    private JButton bt_selec;
    private JButton bt_eliminar;
    private ArrayList<Fecha> fechas_utilizadas; 
    private ArrayList<Fecha> fechas_cita;
    private int day;
    private int month;
    private int year;

    public Calendario() {
        super();
        setLayout(new BorderLayout());
        panel_botones = new JPanel();
        panel_botones.setLayout(new FlowLayout());
        
        lb_titulo = new JLabel("C A L E N D A R I O");
        calendario = new JCalendar();
        bt_selec = new JButton("Seleccionar");
        bt_eliminar = new JButton("Eliminar");
        
        limites(calendario);
        
        fechas_utilizadas = new ArrayList<Fecha>();
        fechas_cita = new ArrayList<Fecha>();
        // Todo: bucle para incluir dentro del arraylist los dias que estan ocupados por el medico
        // todo y los dias que de las fechas que el usuario ya ha resevado con este medico
        // utilizar una funcion aparte para esto, extraer();
        extraer();
        
        JDayChooser chooser = calendario.getDayChooser();
        JPanel panel_dias = chooser.getDayPanel();
        
        // Esta linea es complicada
        JButton[] botones = Arrays.stream(panel_dias.getComponents()).filter(component -> component instanceof JButton).map(component -> (JButton) component).toArray(JButton[]::new);
        config_botones(botones, calendario);
        
        bt_selec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // To do: actualizar la base de datos con db_add();
                db_add();
                JOptionPane.showMessageDialog(null, "Ha reservado el " + day + "/" + month + "/" + year);
                
                for(JButton boton : botones){
                    if((day + "").equals(boton.getText())){
                        boton.setBackground(Color.GREEN);
                        boton.setForeground(Color.WHITE);
                        boton.setBorder(new EmptyBorder(5, 5, 5, 5));
                    }
                }
            }
        });
        
        bt_eliminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // To do: actualizar la base de datos con db_add();
                if(fechas_cita.contains(day)){
                    db_add();
                    JOptionPane.showMessageDialog(null, "Ha eliminado la cita para el dia: " + day + "/" + month + "/" + year);
                }else{
                    JOptionPane.showMessageDialog(null, "Esa fecha no la ha registrado");
                }
                
            }
        });
        
        panel_botones.add(bt_selec);
        panel_botones.add(bt_eliminar);
        add(lb_titulo, BorderLayout.NORTH);
        add(calendario, BorderLayout.CENTER);
        add(panel_botones, BorderLayout.SOUTH);
        
    }
    
    private void limites(JCalendar calendario){
        Calendar sup_lim = Calendar.getInstance();
        Calendar inf_lim = Calendar.getInstance();
        
        sup_lim.add(Calendar.MONTH, 1);
        calendario.setMaxSelectableDate(sup_lim.getTime());

        calendario.setMinSelectableDate(inf_lim.getTime());
    }
    
    public void extraer(){
    }
    
    public void config_botones(JButton[] botones, JCalendar calendario){
        Calendar date = calendario.getCalendar();
        boolean comprobar = false;
        for(JButton boton : botones){
            
            for(Fecha fecha : fechas_utilizadas){
                if(fecha.getDay() == Integer.parseInt(boton.getText())){
                    boton.setBackground(Color.RED);
                    boton.setForeground(Color.WHITE);
                    boton.setBorder(new EmptyBorder(5, 5, 5, 5));
                    comprobar = true;
                }
            }
            for(Fecha fecha : fechas_cita){
                if(fecha.getDay() == Integer.parseInt(boton.getText())){
                    boton.setBackground(Color.GREEN);
                    boton.setForeground(Color.WHITE);
                    boton.setBorder(new EmptyBorder(5, 5, 5, 5));
                    comprobar = true;
                }
            }
            if(comprobar == true){
                addActSelect(boton, calendario);
            }
        }
    }
    
    public void addActSelect(JButton boton, JCalendar calendario){
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar date = calendario.getCalendar();
                day = date.get(Calendar.DAY_OF_MONTH);
                month = date.get(Calendar.MONTH) + 1;
                year = date.get(Calendar.YEAR);
            }
        });
    }
    
    private void db_add(){
        // -to do
    }
    
    private void db_delete(){
        // to do 
    }
    
}
