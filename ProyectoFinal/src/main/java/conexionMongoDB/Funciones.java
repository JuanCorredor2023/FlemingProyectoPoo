/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionMongoDB;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import clasesCredenciales.*;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author JB
 */

public class Funciones {
    
    Conexion con = new Conexion();
    
    MongoClient mongo = con.crearConexion();
    
    MongoDatabase db = mongo.getDatabase("ProyectoFinal");
    
    
    public void Close(){
        if(mongo != null){
            mongo.close();
        }
    }
    
    public ArrayList<Admin> dbExtract_Admin(){
        
        try{
            ArrayList<Admin> admins = new ArrayList<Admin>();

            MongoCollection<Document> collection = db.getCollection("Admin");

            FindIterable<Document> documents = collection.find();

            for(Document doc : documents){

                Admin a = new Admin(doc.getString("codigo"), doc.getString("pass"));

                admins.add(a);

            }

            return admins;
            
        } catch(MongoException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return null;
    }
    
    // arreglar para aceptar las reviews
    public ArrayList<Doctor> dbExtract_Doctor(){
        
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        
        MongoCollection<Document> collection = db.getCollection("Doctor");
        
        FindIterable<Document> documents = collection.find();
        
        for(Document doc : documents){
            
            ArrayList<Review> reviews = new ArrayList<Review>();
            
            List<Document> arr_reviews = (List<Document>) doc.get("reviews"); 
            
            if(arr_reviews != null){
                
                for(Document review : arr_reviews){
                    
                    Review r = new Review(review.getString("author"), review.getString("body"));
                    
                    reviews.add(r);
                    
                }
                
            }
            
            Doctor d = new Doctor(doc.getString("name"), doc.getString("city"), doc.getString("address"), doc.getString("imagePath"), reviews);
            
            doctors.add(d);
            
        }
        
        return doctors;
        
    }
    
    public ArrayList<Usuario> dbExtract_Usuario(){
        
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        
        MongoCollection<Document> collection = db.getCollection("Usuario");
        
        FindIterable<Document> documents = collection.find();
        
        for(Document doc : documents){
            
            Usuario u = new Usuario(doc.getString("user"), doc.getString("pass"), doc.getString("name"), doc.getString("correo"), doc.getInteger("edad"), doc.getString("city"));
            
            users.add(u);
            
        }
        
        return users;
        
    }
    
    public void addOne_Usuario(String user, String pass, String correo, int edad, String city, String name){
        
        MongoCollection<Document> collection = db.getCollection("Usuario");
        
        Document doc = new Document("user", user).append("pass", pass).append("correo", correo).append("edad", edad).append("city", city).append("name", name);
        
        collection.insertOne(doc);
        
    }
    
    public void addOne_Admin(int cod, String pass){
        
        MongoCollection<Document> collection = db.getCollection("Admin");
        
        Document doc = new Document("codigo", cod).append("pass", pass);
        
        collection.insertOne(doc);
        
    }
    
    public void addOne_Doctor(String name, String city, String address, String imagePath, ArrayList<Review> reviews){
        
        MongoCollection<Document> collection = db.getCollection("Doctor");
        
        List<Document> arr_reviews = new ArrayList<>();
        
        for(Review review : reviews){
            
            arr_reviews.add(new Document("author", review.getAuthor()).append("body", review.getBody()));
            
        }
        
        Document doc = new Document("name", name).append("city", city).append("address", address).append("imagePath", imagePath).append("reviews", arr_reviews);
        
        collection.insertOne(doc);
        
    }
    
    public void deleteOne_Usuario(String user, String pass, String correo, int edad, String city, String name){
        
        MongoCollection<Document> collection = db.getCollection("Usuario");
        
        Document doc = new Document("user", user).append("pass", pass).append("correo", correo).append("edad", edad).append("city", city).append("name", name);
        
        collection.deleteOne(doc);
        
    }
    
    public void deleteOne_Admin(int cod, String pass){
        
        MongoCollection<Document> collection = db.getCollection("Admin");
        
        Document doc = new Document("codigo", cod).append("pass", pass);
        
        collection.deleteOne(doc);
        
    }
    
    public void deleteOne_Doctor(String name, String city, String address, String imagePath){
        
        MongoCollection<Document> collection = db.getCollection("Doctor");
        
        Document doc = new Document("name", name).append("city", city).append("address", address).append("imagePath", imagePath);
        
        collection.deleteOne(doc);
        
    }
    
}
