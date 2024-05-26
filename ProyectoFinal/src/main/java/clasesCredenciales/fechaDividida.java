/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesCredenciales;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author JB
 */
public class fechaDividida extends Fecha{

    private int day;
    
    private int month;
    
    private int year;

    public fechaDividida(int day, int month, int year, String fecha_str) {
        super(fecha_str);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int separarDia(String fecha_str){
        
        LocalDate date = LocalDate.parse(fecha_str, DateTimeFormatter.ISO_DATE);
        
        int dia = date.getDayOfMonth();
        
        return dia;
        
    }
    
    public int separarMes(String fecha_str){
    
        LocalDate date = LocalDate.parse(fecha_str, DateTimeFormatter.ISO_DATE);
        
        int mes = date.getMonthValue();
        
        return mes;
    
    }
    
    public int separarYear(String fecha_str){
        
        LocalDate date = LocalDate.parse(fecha_str, DateTimeFormatter.ISO_DATE);
        
        int year_a = date.getYear();
        
        return year_a;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        fechaDividida f = (fechaDividida) o;
        return day == f.day && month == f.month && year == f.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
    
}
