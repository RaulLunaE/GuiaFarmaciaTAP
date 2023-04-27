/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Models.Medicamento;
import Views.Pedidos;
import Views.Visualizacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class controlDistribuidora extends javax.swing.JFrame{
    
    private Visualizacion view;
    private Pedidos pedi;
    ArrayList<Medicamento> listax = new ArrayList<>();

    public controlDistribuidora() {
    }

    public controlDistribuidora(Visualizacion view, ArrayList<Medicamento>lista) {
        listax=lista;
        this.view = view;
        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);                
        iniciar_control();
    }

    
    public void iniciar_control(){
        view.getBtnEnviar().addActionListener(l->enviar());
        view.getBtnCancelar().addActionListener(l->cancelar());
        view.getLblnombre().setText(listax.get(0).getNombre());
        String cantidadx=String.valueOf(listax.get(0).getCantidad());
        view.getLblcantidad().setText(cantidadx);
        view.getLbltipo().setText(listax.get(0).getTipo());
        view.getLbldistribuidor().setText(listax.get(0).getDistribuidor());
        view.getLbldistribuidor2().setText(listax.get(0).getDistribuidor());
        String sucursal_seleccionada=listax.get(0).getTiposucursal();
        String direccion="";
                    
    if (sucursal_seleccionada=="PRINCIPAL Y SECUNDARIA") {
            direccion="Para la  farmacia situada en Calle de la Rosa n.28 y para la situada en Calle Alcazabilla n.3";
        }if (sucursal_seleccionada=="PRINCIPAL") {
            direccion="Para la  farmacia situada en Calle de la Rosa n.28";
        }if (sucursal_seleccionada=="SECUNDARIA"){
            direccion="Para la  farmacia situada en Calle Alcazabilla n.3";
        }
        view.getLbldireccion().setText(direccion);
    }

    public void enviar(){
        JOptionPane.showMessageDialog(view, "Pedido Enviado");
        Pedidos ped = new Pedidos();
        this.view.setVisible(false);
        pedi.setVisible(true);
    }

    public void cancelar(){
        JOptionPane.showMessageDialog(view, "Pedido Cancelado");
        Pedidos ped = new Pedidos();
        this.view.setVisible(false);
        pedi.setVisible(true);
    }

    /*public controlDistribuidora(Visualizacion vista) {
        this.viewe = viewe;
        this.viewe.setLocationRelativeTo(null);
        this.viewe.setVisible(true);
        
        iniciaControl();      
    }
    
    public void  iniciaControl(){
        viewe.getBtnCancelar().addActionListener(l -> cambiarPanel());
    }
    
    public void cambiarPanel() {
      Pedidos ped = new Pedidos();
      this.viewe.setVisible(false);
      controlMedicamento cont = new controlMedicamento(pe);
    }*/
}
