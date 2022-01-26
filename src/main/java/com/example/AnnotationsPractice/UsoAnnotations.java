package com.example.AnnotationsPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
    public static void main(String[] args) {



        //Leer el xml de confinguracion
        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");



        //Pedir un bean al contenedor
        Empleados Mario=contexto.getBean("ComercialExperimentado", Empleados.class);


        //usar Bean



        System.out.println(Mario.getInforme());
        System.out.println(Mario.getTareas());

        contexto.close();

    }


}
