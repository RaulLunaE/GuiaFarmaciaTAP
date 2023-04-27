/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controls;

import Models.Distribuidora;
import Models.Medicamento;
import Views.Pedidos;
import Views.Visualizacion;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class controlMedicamento extends javax.swing.JFrame{
  
    private Pedidos view;
    private Medicamento model;
    ArrayList<Medicamento> lista = new ArrayList<>();

    public controlMedicamento(Pedidos view, Medicamento model) {
        this.view = view;
        this.model = model;
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        iniciar_control();
    }

    controlMedicamento(Pedidos ped) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void iniciar_control(){
        view.getBtnAceptar().addActionListener(l->aceptar());
    }
    
    public void validacion(){
        if (view.getTxtNomMedi().getText().isEmpty()==true || view.getTxtcantidad().getText().isEmpty()==true || view.getjRadioButton1().isSelected()==false && view.getjRadioButton2().isSelected()==false && view.getjRadioButton3().isSelected()==false) {
            JOptionPane.showMessageDialog(view, "Aun estan vacios unos campos");
        }
    }
    
    public void aceptar(){
        if (view.getTxtNomMedi().getText().isEmpty()==true||view.getTxtcantidad().getText().isEmpty()==true||view.getjRadioButton1().isSelected()==false&&view.getjRadioButton2().isSelected()==false&&view.getjRadioButton3().isSelected()==false) {
            JOptionPane.showMessageDialog(view, "Aun estan vacios unos campos");
        }else{
            String nombre=view.getTxtNomMedi().getText();
            String tipo=view.getCbxtipomedi().getSelectedItem().toString();
            String cantidad=view.getTxtcantidad().getText();
            String distribuidor="";
        if (view.getjRadioButton1().isSelected()==true) {
            distribuidor="COFARMA";
        }else{
            if (view.getjRadioButton2().isSelected()==true) {
                distribuidor="EMPSEPHAR";
                }else{
                    if (view.getjRadioButton3().isSelected()==true) {
                        distribuidor="CEMEFAR";
                    }
                }
            }
            
    String sucursal="";
        if (view.getjCheckBox1().isSelected()==true&&view.getjCheckBox2().isSelected()==true) {
            /*Esta funcion esta habilitada si a los checkbox se les debe quitar el grouo boton y pueda selecionar las dos*/
            sucursal="PRINCIPAL Y SECUNDARIA";
        }else{
        if (view.getjCheckBox1().isSelected()==true) {
            sucursal="PRINCIPAL";
        }else{
            if (view.getjCheckBox2().isSelected()==true) {
                sucursal="SECUNDARIA";
            }
        }
        }
        
        //hacer que solo pueda ingresar numeros enteros en cantidad
        int cantidadx=Integer.parseInt(cantidad);
        
        Medicamento med=new Medicamento();
        med.setCantidad(cantidadx);
        med.setDistribuidor(distribuidor);
        med.setNombre(nombre);
        med.setTiposucursal(sucursal);
        med.setTipo(tipo);
        lista.add(med);
        
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getNombre());
            }
            Visualizacion mc=new Visualizacion();
            controlDistribuidora cm=new controlDistribuidora(mc,lista);

            this.view.setVisible(false);
            this.view.dispose();
            mc.setVisible(true);
            
            
        System.out.println(">>>>>"+sucursal);
        }
    }
    
    
    
    /*Pedidos pedi = new Pedidos();
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
    }*/
    
     /*Amacenar datos
    ArrayList <Medicamento>medicamentos;
    
    public void registrarM(){
        medicamentos= new ArrayList();
    }
    
    public void insertarMedicamentos(){
     String Nombre=pedi.getTxtNomMedi().getText();
     String cantidad=pedi.getTxtcantidad().getText();
     String Tipo=pedi.getCbxtipomedi().getSelectedItem().toString();
     String distribuidor="";
     String sucursal="";
     if(pedi.getRcofarma1().isSelected()){
         distribuidor= pedi.Rcofarma1.getText();
         }
     if(pedi.getRemp().isSelected()){
         distribuidor= pedi.Remp.getText();
         }
     if(pedi.getRcem().isSelected()){
         distribuidor= pedi.Rcem.getText();
         }
     
     if(pedi.getjCheckBox1().isSelected()){
         sucursal=pedi.jCheckBox1.getText();
     }
      if(pedi.getjCheckBox2().isSelected()){
         sucursal=pedi.jCheckBox2.getText();
     }
      
     Medicamento gmedicamento= new Medicamento();
     gmedicamento.setNombre(Nombre);
     gmedicamento.setTipo(Tipo);
     gmedicamento.setCantidad(cantidad);
     gmedicamento.setDistribuidor(distribuidor);
     gmedicamento.setSucursal(sucursal);
     
    }
    
    public void mostrarDatos(Medicamento medi){
        vista.jLabel2.setText(medi.getDistribuidor());
        vista.jLabel10.setText(medi.getTipo());
        vista.jLabel4.setText(medi.getNombre());
        vista.jLabel6.setText(medi.getCantidad());
        vista.jLabel11.setText(medi.getSucursal());
    }*/
}
    
   
    
   