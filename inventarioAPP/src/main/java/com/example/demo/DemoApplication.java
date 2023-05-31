package com.example.demo;

import com.example.demo.controlador.ProductoControlador;
import com.example.demo.modelo.ProductoRepositorio;
import com.example.demo.vista.Vista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    
        @Autowired 
        ProductoRepositorio productoRepositorio;
        
        
	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class).headless(false).run(args); // desactivar el atributo headless para que no salga error
	}
        
        @Bean
        public void applicationRunner(){
             new ProductoControlador (productoRepositorio, new Vista ());
     
        }

}
