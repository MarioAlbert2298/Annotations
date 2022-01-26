package com.example.AnnotationsPractice;


import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExpermentado implements  Empleados{

    @Override
    public String getTareas(){

        return  "Vender, verder y vender mas!";

    }

    @Override
    public String getInforme(){
        return "Informe generado por el comercial";
    }

}
