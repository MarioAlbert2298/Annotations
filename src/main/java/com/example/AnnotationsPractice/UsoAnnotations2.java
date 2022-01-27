package com.example.AnnotationsPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

    public static void main(String[] args) {



        //Leer el xml de confinguracion
        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");



        /*

        //Pedir un bean al contenedor
        //Se ocupa Scope para que las instacias no tengan un  mismo lugar en memoria, indiandole el tipo de patron, en esta caso Prototype
        Empleados Mario=contexto.getBean("comercialExperimentado", Empleados.class);
        Empleados Luis=contexto.getBean("comercialExperimentado", Empleados.class);


        if(Mario==Luis){
            System.out.println("Apuntan al mismo lugar en memoria");
            System.out.println(Mario +"\n"+ Luis);
        }else
        {
            System.out.println("No apuntan al mismo lugar en memoria");
            System.out.println(Mario +"\n"+ Luis);
        }

        //usar Bean
        System.out.println(Mario.getInforme());
        System.out.println(Mario.getTareas());

         */



      /*  //PEDIR BEAN AL CONTENEDOR

        Empleados empleado=contexto.getBean("directorFinanciero", Empleados.class);
        System.out.println(empleado.getTareas());
        System.out.println(empleado.getInforme());
*/
        DirectorFinanciero empleado =contexto.getBean("directorFinanciero",DirectorFinanciero.class);
        System.out.println("Email del director: " +empleado.getEmail());
        System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());


        contexto.close();

    }




}
