/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Models.Distribuidora;
import Models.Medicamento;
import Views.Pedidos;
import Views.Visualizacion;
import javafx.event.ActionEvent;

/**
 *
 * @author Raul
 */
public class controlMedicamento extends javax.swing.JFrame{
  
    Pedidos pedi = new Pedidos();
    Medicamento medi = new Medicamento();

    public controlMedicamento(Pedidos pedi) {
        this.pedi = pedi;
        this.pedi.setLocationRelativeTo(null);
        this.pedi.setVisible(true);
        iniciaControl();
    }
   
    public void  iniciaControl(){
        pedi.getBtnAceptar().addActionListener(l -> cambiarPanel());
    }
    
    public void cambiarPanel() {
      Visualizacion vis = new Visualizacion();
      this.pedi.setVisible(false);
      controlDistribuidora cont = new controlDistribuidora(vis);
    }
}
