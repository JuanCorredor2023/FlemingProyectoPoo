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

public class Doctor {
    private String name;
    private String city;
    private String address;
    private String imagePath;

    public Doctor(String name, String city, String address, String imagePath) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.imagePath = imagePath;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getImagePath() {
        return imagePath;
    }
}
