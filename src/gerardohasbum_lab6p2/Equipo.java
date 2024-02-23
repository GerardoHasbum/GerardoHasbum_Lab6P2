/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardohasbum_lab6p2;

/**
 *
 * @author ghasb
 */
public class Equipo {
    
    String pais, nombre, ciudad, estadio;

    public Equipo() {
    }

    public Equipo(String pais, String nombre, String ciudad, String estadio) {
        this.pais = pais;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipo: " + "\nPais: " + pais + "\nNombre: " + nombre + "\nCiudad: " + ciudad + "\nEstadio: " + estadio + "\n";
    }
    
    
    
}
