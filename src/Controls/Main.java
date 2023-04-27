/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controls;

import Models.Medicamento;
import Views.Pedidos;
import Views.Visualizacion;

/**
 *
 * @author Raul
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pedidos inicio = new Pedidos();
        Medicamento me=new Medicamento();
        
        controlMedicamento contro=new controlMedicamento(inicio, me);

    }
    
    
}
