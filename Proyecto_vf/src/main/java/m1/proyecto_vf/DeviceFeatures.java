/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m1.proyecto_vf;

import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author JB
 */
public class DeviceFeatures {
    
    public static Dimension getScreenSize(){
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
    
    public static void setScreen(JFrame frame){
        Dimension dimension = getScreenSize();
        frame.setSize(dimension.width, dimension.height);
    }
}
