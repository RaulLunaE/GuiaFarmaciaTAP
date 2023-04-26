/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Views.Visualizacion;

/**
 *
 * @author Raul
 */
public class Distribuidora {
    
    private String Nombre;
    private String Tipo;

    public Distribuidora() {
    }

    
    public Distribuidora(String Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public Distribuidora(Visualizacion ped) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
