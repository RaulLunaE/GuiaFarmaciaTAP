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
    
    public void iniciar_control(){
        view.getBtnAceptar().addActionListener(l->aceptar());
    }
    
    public void validacion(){
        if (view.getTxtNomMedi().getText().isEmpty()==true || view.getTxtcantidad().getText().isEmpty()==true || view.getjRadioButton1().isSelected()==false && view.getjRadioButton2().isSelected()==false && view.getjRadioButton3().isSelected()==false) {
            JOptionPane.showMessageDialog(view, "COMPLETE EL FORMULARIO PORFAVOR");
        }
    }
    
    public void aceptar(){
        if (view.getTxtNomMedi().getText().isEmpty()==true||view.getTxtcantidad().getText().isEmpty()==true||view.getjRadioButton1().isSelected()==false&&view.getjRadioButton2().isSelected()==false&&view.getjRadioButton3().isSelected()==false) {
            JOptionPane.showMessageDialog(view, "COMPLETE EL FORMULARIO PORFAVOR");
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
    
    /*
    
    
    
    [22:36, 26/4/2023] Eddy Belduma: 
    private static ArrayList<Medicamento> list_medic = new ArrayList<Medicamento>();
[22:37, 26/4/2023] Eddy Belduma: 
    public void registrarMedicamento(String nombre, String tipo, int cantidad, String distribuidor, String sucursal){
        list_medic.add(new Medicamento(nombre, tipo, cantidad, distribuidor, sucursal));
    }
    
[22:40, 26/4/2023] Eddy Belduma: 
    ResumenPedido vistaRS;
    Model_Medicamento md_medicamento;
    
    
    
[22:40, 26/4/2023] Eddy Belduma: 
    public Control_ResumenPedido(ResumenPedido vista, Model_Medicamento md_medicamento) {
        this.md_medicamento = md_medicamento;
        this.vistaRS = vista;
        this.vistaRS.setLocationRelativeTo(null);
        this.vistaRS.setVisible(true);
        iniciaControl();
    }
    
        
[22:39, 26/4/2023] Eddy Belduma: 
    public void iniciaControl(){
        System.out.println(md_medicamento.getList_medic().toString());
        vistaRS.getJlMedicamento().setText(md_medicamento.getList_medic().get(0).getMd_nombre().toString());
        vistaRS.getjLabelCantidad().setText(String.valueOf(md_medicamento.getList_medic().get(0).getMd_cantidad()).toString());
        vistaRS.getJlsucursa().setText(md_medicamento.getList_medic().get(0).getMd_sucursal().toString());
        vistaRS.getJltipomedi().setText(md_medicamento.getList_medic().get(0).getMd_tipo().toString());
        vistaRS.setTitle(md_medicamento.getList_medic().get(0).getMd_distribuidor().toString());
}
    
    
    
    controlador principal
[22:41, 26/4/2023] Eddy Belduma: ResumenPedido ped = new ResumenPedido();
        Control_ResumenPedido cont = new Control_ResumenPedido(ped, Md_medicamento);
[22:42, 26/4/2023] Eddy Belduma: Model_Medicamento Md_medicamento = new Model_Medicamento();*/
}
    
   
    
   