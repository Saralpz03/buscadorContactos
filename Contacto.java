/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorcontactos;

/**
 *
 * @author Alexara
 */
public class Contacto {
    private String nombre,apellido,color;

    public Contacto(String nombre, String apellido, String color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre+","+apellido+","+color+"\n";
    }
    
}
