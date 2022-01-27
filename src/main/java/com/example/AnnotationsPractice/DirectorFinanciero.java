package com.example.AnnotationsPractice;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados{

   public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero){
       this.informeFinanciero=informeFinanciero;
   }

   public String getEmail(){
       return email;
   }
   public String getNombreEmpresa(){
       return nombreEmpresa;
   }



    @Override
    public String getTareas() {
        return "Gestion y direccion de las operacion financieras en la empresa";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }

    private CreacionInformeFinanciero informeFinanciero;
   @Value("${email}")
   private String email;
   @Value("${nomreEmpresa}")
   private String nombreEmpresa;


}
