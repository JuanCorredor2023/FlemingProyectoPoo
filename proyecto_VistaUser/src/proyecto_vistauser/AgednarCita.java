/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_vistauser;

/**
 *
 * @author juan
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;


public class AgednarCita extends JFrame{
    private JButton bAceptar;
    private JPanel panel;
    private ImageIcon i_Foto;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private ButtonGroup buttonGroup;
    private JCheckBox box_1;
    private JCheckBox box_2;
    private JCheckBox box_3;
    private JCheckBox box_4;


 
    public AgednarCita() {
        panel = new JPanel();
        
        i_Foto = new ImageIcon("img1.jpeg");
        JLabel foto = new JLabel(i_Foto);
        
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        JRadioButton radioButton3 = new JRadioButton("Opción 3");
        JRadioButton radioButton4 = new JRadioButton("Opción 4");
        
        JCheckBox box_1 = new JCheckBox("Opción 1", false);
        JCheckBox box_2 = new JCheckBox("Opción 2", false);
        JCheckBox box_3 = new JCheckBox("Opción 3", false);
        JCheckBox box_4 = new JCheckBox("Opción 4", false);

        // Crear un grupo de botones
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        
        bAceptar = new JButton("Button");
        
        radioButton1.setBounds(150, 0, 140, 25);
        radioButton2.setBounds(150, 50, 140, 25);
        radioButton3.setBounds(150, 100, 140, 25);
        radioButton4.setBounds(150, 150, 140, 25);
        
        box_1.setBounds(550, 0, 140, 25);
        box_2.setBounds(550, 50, 140, 25);
        box_3.setBounds(550, 100, 140, 25);
        box_4.setBounds(550, 150, 140, 25);
        
        bAceptar.setBounds(150, 250, 140, 25);
        foto.setBounds(450, 200, 300, 150);

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);
        
        panel.add(box_1);
        panel.add(box_2);
        panel.add(box_3);
        panel.add(box_4);
   
        panel.add(bAceptar);
        
        panel.add(foto);

        
        setContentPane(panel);
        panel.setLayout(null);
        
    }
}
