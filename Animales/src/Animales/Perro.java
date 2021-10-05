/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Usuario
 */
public class Perro {
    private String Nombre;
    private String Raza;
    private Integer edad;
    private String colorPelo;

    public Perro() {
    }

    public Perro(String Nombre, String Raza, Integer edad, String colorPelo) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.edad = edad;
        this.colorPelo = colorPelo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
}
