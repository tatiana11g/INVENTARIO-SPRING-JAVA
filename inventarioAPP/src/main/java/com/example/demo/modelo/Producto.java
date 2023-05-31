/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table ("productos")
public class Producto {
       @Id
       private Integer codigo;
       private String nombre;
       private double precio;
       private int inventario;

        public Producto(Integer codigo, String nombre, double precio, int inventario) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.inventario = inventario;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(Float precio) {
            this.precio = precio;
        }

        public Integer getInventario() {
            return inventario;
        }

        public void setInventario(int inventario) {
            this.inventario = inventario;
        }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", inventario=" + inventario + '}';
    }

 
        
             
}  
 
   
    

