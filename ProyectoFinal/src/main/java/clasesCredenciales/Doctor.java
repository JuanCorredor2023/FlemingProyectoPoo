/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesCredenciales;

import java.util.ArrayList;

/**
 *
 * @author JB
 */
public class Doctor {
    
    private String name;
    private String city;
    private String address;
    private String imagePath;
    private ArrayList<Review> reviews;

    public Doctor(String name, String city, String address, String imagePath, ArrayList<Review> reviews) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.imagePath = imagePath;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
     

}
