/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controlador;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.ProductoRepositorio;
import com.example.demo.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author LENOVO
 */
public class ProductoControlador implements ActionListener {
    
    ProductoRepositorio productorepositorio; 
    //se va  crear un constructor para pasar la dependencia
    // no se puede crear el objeto si no que se pasa para inyectarlo
    Vista vista;
    
    
    public ProductoControlador(ProductoRepositorio repo, Vista vista) {
        this.productorepositorio = repo;
        this.vista= vista;
        manejadorEventos();
        buscarProducto();
    }
    
    
    private void manejadorEventos(){
    vista.getBtnagregar().addActionListener(this); // parametro  la clase que va manejar el evento
    vista.getBtnactualizar().addActionListener(this);
    vista.getBtnborrar().addActionListener(this);
    vista.getBtminforme().addActionListener(this);
    vista.getBtnactualizaregis().addActionListener(this);
    }
    
    public void buscarProducto(){       
    List <Producto> listaproductos= (List<Producto>) productorepositorio.findAll();
    JTable tablaProductos = vista.getTblproductos();
    
    Integer fila=0;
    for(Producto pro : listaproductos){
        tablaProductos.setValueAt(pro.getCodigo(), fila, 0);
        tablaProductos.setValueAt(pro.getNombre(), fila, 1);
        tablaProductos.setValueAt(pro.getPrecio(), fila, 2);
        tablaProductos.setValueAt(pro.getInventario(), fila, 3);
        fila++;
    }
     for(int i=0; i< tablaProductos.getRowCount(); i++){
         
        tablaProductos.setValueAt("", fila, 0);
        tablaProductos.setValueAt("", fila, 1);
        tablaProductos.setValueAt("", fila, 2);
        tablaProductos.setValueAt("", fila, 3);
     }
     
     
    }
    
    public void agregar(){
        String nombre = vista.getTxtnombre().getText();
        Double precio= Double.parseDouble(vista.getTxtprecio().getText()) ;
        Integer inventario= Integer.parseInt(vista.getTxtinventario().getText());
        
        Producto producto= new Producto(null,nombre,precio,inventario);
        productorepositorio.save(producto);
        JOptionPane.showMessageDialog(null,  "¡Producto Creado Correctamente!","PRODUCTO CREADO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void validarSeleccionFila(String accionRealizar){
        
      JTable tablaProductos = vista.getTblproductos();
      Integer fila = tablaProductos.getSelectedRow();    
      if(fila!=-1){
          
          Integer codigo=(Integer)tablaProductos.getModel().getValueAt(fila, 0);
           if(codigo!=null){             
                if(accionRealizar.equals("ACTUALIZAR")){
                   actualizar();
                }else if(accionRealizar.equals("BORRAR")){
                    eliminar(codigo);
                }
           }else{
             JOptionPane.showMessageDialog(null, "Porfavor, selecciona un producto a actualizar");
           }
      }else {
              
               JOptionPane.showMessageDialog(null, "Porfavor, seleccione un producto a actualizar");
           }
      }
    
    
    
    public void actualizar (){
              
             JTable tablaproductos = vista.getTblproductos();
              vista.getFrmactualizar().setVisible(true);
              vista.getFrmactualizar().setSize(400,350);
              vista.getFrmactualizar().setLocation(400,400);
              
              String nombre = (String)tablaproductos.getModel().getValueAt(tablaproductos.getSelectedRow(),1);
              Double precio = (Double)tablaproductos.getModel().getValueAt(tablaproductos.getSelectedRow(),2);
              Integer inventario =(Integer)tablaproductos.getModel().getValueAt(tablaproductos.getSelectedRow(),3);
              
              vista.getTxtnombreac().setText(nombre);
              vista.getTxtprecioact().setText(String.valueOf(precio));
              vista.getTxtinventarioact().setText(String.valueOf(inventario));
              
              
             
    }
    
    public void actualizarBasededatos(){
        JTable tablaproductos = vista.getTblproductos();
        Integer codigo = (Integer)tablaproductos.getModel().getValueAt(tablaproductos.getSelectedRow(),0);
        String nombre = vista.getTxtnombreac().getText();
        Double precio= Double.parseDouble(vista.getTxtprecioact().getText()) ;
        Integer inventario= Integer.parseInt(vista.getTxtinventarioact().getText());
        
        
        Producto producto = new Producto(codigo,nombre,precio,inventario);
        productorepositorio.save(producto); // se le pasa el codigo seleccionado
        JOptionPane.showMessageDialog(null, "Producto Actualizado correctamente");
    }

    public void eliminar(Integer codigo){
   
               productorepositorio.deleteById(codigo); 
               JOptionPane.showMessageDialog(null, "Producto Eliminado correctamente");
               
          
    }
    
    public void generarInforme(){
        
        List<Producto> listaProductos = (List<Producto>)productorepositorio.findAll();
        Double sumatoriaPrecios=0.0;
        Double sumatoriaValores=0.0;    
        String nombrePrecioMayor="";
        String nombrePrecioMenor="";
        Double precioMayor=0.0;
        Double precioMenor=9999999.9;
        
         for (Producto producto : listaProductos) {
             if (producto.getPrecio() > precioMayor) {
                 precioMayor = producto.getPrecio();
                 nombrePrecioMayor= producto.getNombre();
             }
        
         
             if (producto.getPrecio() < precioMenor) {
                 precioMenor = producto.getPrecio();
                 nombrePrecioMenor = producto.getNombre();
             }
             
            sumatoriaPrecios  += producto.getPrecio();
            sumatoriaValores += producto.getPrecio() * producto.getInventario();
    }
           Double promedio= sumatoriaPrecios / listaProductos.size();
           JOptionPane.showMessageDialog(null, "Producto precio mayor : "+ nombrePrecioMayor+
                                                "\n Producto precio menor : "+ nombrePrecioMenor+  
                                                "\n Promedio precios : "+ String.format("%.1f", promedio)+
                                                "\n Total inventario : "+ sumatoriaValores ,"INFORME GENERADO",
                                                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnagregar()) {
            if (vista.getTxtnombre().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor digita el NOMBRE del producto");
            } else if (vista.getTxtprecio().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor digita el PRECIO del producto");
            } else if (vista.getTxtinventario().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor digita el INVENTARIO del producto");
            } else {
                agregar();
                buscarProducto();
                vista.getTxtnombre().setText("");
                vista.getTxtprecio().setText("");
                vista.getTxtinventario().setText("");
       }
          
       }else if(e.getSource()== vista.getBtnactualizar()){
           
           validarSeleccionFila("ACTUALIZAR");
       } else if(e.getSource()== vista.getBtnborrar()){
            validarSeleccionFila("BORRAR");
           buscarProducto();
       }else if(e.getSource()== vista.getBtminforme()){
           generarInforme();
       }else if (e.getSource()== vista.getBtnactualizaregis()){
            if (vista.getTxtnombreac().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor digita el NOMBRE del producto");
            } else if (vista.getTxtprecioact().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor digita el PRECIO del producto");
            } else if (vista.getTxtinventarioact().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Porfavor digita el INVENTARIO del producto");
            }
            else{
             actualizarBasededatos();
             buscarProducto();
            }
         }
    
    
    
    
}
}