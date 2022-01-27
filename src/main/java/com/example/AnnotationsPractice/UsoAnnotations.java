package com.example.AnnotationsPractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
    public static void main(String[] args) {



        //Leer el xml de confinguracion

       /*
        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
*/

        //Leer el class de configuracion
        //Esta line hace referenci a la  clase EmpleadosConfig, ya que sustituye a nuestro XML, ya no se linkea con ClassPathXmlApplicationContext

        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        //Pedir un bean al contenedor
        Empleados Mario=contexto.getBean("comercialExperimentado", Empleados.class);
        Empleados Luis=contexto.getBean("comercialExperimentado", Empleados.class);




        //usar Bean



        System.out.println(Mario.getInforme());
        System.out.println(Mario.getTareas());

        contexto.close();

    }


}
