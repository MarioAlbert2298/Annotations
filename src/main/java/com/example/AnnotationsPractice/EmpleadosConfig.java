package com.example.AnnotationsPractice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.AnnotationsPractice")
@PropertySource("classPath:datosEmpresa.propiedades")

public class EmpleadosConfig {

    @Bean
    public CreacionInformeFinanciero informeFinancieroDtoCompras(){
        return new InformeFinancieroDtoCompras();
    }

    //Definir el bean para DirectorFinanciero e inytectar dependencias

    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDtoCompras());
    }




}
