/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Models.Distribuidora;
import Views.Pedidos;
import Views.Visualizacion;

/**
 *
 * @author Raul
 */
public class controlDistribuidora extends javax.swing.JFrame{
    
    Visualizacion viewe = new Visualizacion();
    Distribuidora dis = new Distribuidora();

    public controlDistribuidora(Visualizacion vista) {
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
      controlMedicamento cont = new controlMedicamento(ped);
    }
}
