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
public class controlMedicamento {
    
    Pedidos pedi = new Pedidos();
    Medicamento medi = new Medicamento();
    Visualizacion vista = new Visualizacion();
    Distribuidora dist = new Distribuidora();

    public controlMedicamento(Medicamento medi, Pedidos pedi) {
        this.pedi = pedi;
        this.medi = medi;
    }
    
    public void cambiarventana(){
        pedi.getBtnAceptar().addActionListener(l -> cambiarPanel());
    }
    
    private void cambiarPanel() {
      vista.setVisible(true);
    }
    
}
