/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dto2;

import java.util.List;

/**
 *
 * @author aleuw
 */
public class Album extends Cancion {
     private int id;
    private String nombre;
    private int Fechalanzamineto;
    List<Cancion>Cancion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechalanzamineto() {
        return Fechalanzamineto;
    }

    public void setFechalanzamineto(int Fechalanzamineto) {
        this.Fechalanzamineto = Fechalanzamineto;
    }

    public List<Cancion> getCancion() {
        return Cancion;
    }

    public void setCancion(List<Cancion> Cancion) {
        this.Cancion = Cancion;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombre=" + nombre + ", Fechalanzamineto=" + Fechalanzamineto + ", Cancion=" + Cancion + '}';
    }
    

}




