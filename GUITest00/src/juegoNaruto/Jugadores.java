package juegoNaruto;

import java.io.Serializable;

/**
 * @author HP
 */
public class Jugadores implements Serializable {

    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String usuario;
    private int victorias;

    public Jugadores() {}

    public Jugadores(int id, String nombre, String apellido, String cedula, String usuario, int victorias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;

    }
    
    //Setters y Getters
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
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
     public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    

    
    //To String..
    @Override
    public String toString() {
        return this.apellido+" "+this.nombre; //Voy a hacer que me retorne el apellido y nombre en el combobox, no el número de cédula.
    }

 
}
