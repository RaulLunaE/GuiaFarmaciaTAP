/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Raul
 */
public class Medicamento {
    
    private String nombre;
    private String tipo;
    private int cantidad;
    private String distribuidor;
    private String tiposucursal;

    public Medicamento() {
    }

    public Medicamento(String nombre, String tipo, int cantidad, String distribuidor, String sucursal) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.tiposucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getTiposucursal() {
        return tiposucursal;
    }

    public void setTiposucursal(String tiposucursal) {
        this.tiposucursal = tiposucursal;
    }
}
