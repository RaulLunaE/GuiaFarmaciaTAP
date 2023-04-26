/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

/**
 *
 * @author Raul
 */
public class Medicamento {
    
    private String Nombre;
    private String Tipo;
    private String cantidad;

    public Medicamento() {
    }

    
    public Medicamento(String Nombre, String Tipo, String cantidad) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.cantidad = cantidad;
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
