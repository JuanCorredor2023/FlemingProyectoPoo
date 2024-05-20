/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesCredenciales;

/**
 *
 * @author JB
 */
public class Usuario {
    
    private String usuario;
    private String pass;
    private String name;
    private String correo;
    private int edad;
    private String city;

    public Usuario(String usuario, String pass, String name, String correo, int edad, String city) {
        this.usuario = usuario;
        this.pass = pass;
        this.name = name;
        this.correo = correo;
        this.edad = edad;
        this.city = city;
    }  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
      
    
}
