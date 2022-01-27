package com.example.AnnotationsPractice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Scope("prototype") //Spring trabaja con los patrones Singleto y prototype, con scope se le indica que praton quieres hacer uso, se ve el ejemplo en UsoAnnotationes2.java

//@Component("ComercialExperimentado") //Se enlaza con el main mandando llamar al componente, sustutyendo la declaracion de bean en el xml
@Component //Se igualmanera se puede hace lo mismo pero con el nombre de la clase, pero en vez de ComercialExperimentado seria con CamelCase: comercialExperimentado
public class ComercialExperimentado implements  Empleados{



    public ComercialExperimentado(){ //En ocasiones es necesario poner un costructor vacio cuando se usa @Autowired
    }

//-------------------------------
    //INYECCION DE DEPENDENCIAS
    //Se puede hacer con Autowired, ya sea con un costructor o con poner el dato en private y pasarle el dato
    //Se hace cuando la interfaz solo tiene una clase, no cuando tiene varias ya que entra en con confusion al no sabes que clase tomar
    /*
    @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme){ //Se crea el contructor con el dato de la clase que tiene la interfaz CreacionInformeFinanciero
        this.nuevoInforme=nuevoInforme;
    }*/
    /*
    private CreacionInformeFinanciero nuevoInforme; //Se manda llamar la interfaz de CreacionInformeFinanciero
    */
//--------------------------
    //INYECCION DE DATOS CON @Qualifier
    @Autowired
    @Qualifier("informeFinancieroTrim3") //Lo que hace es llamar la clase mediante sui nombre, ya que si se deja el Aurowired entrara en colision el programa al no saber que clase tomar
    private CreacionInformeFinanciero nuevoInforme; //Se manda llamar la interfaz de CreacionInformeFinanciero





    @Override
    public String getTareas(){
        return  "Vender, verder y vender mas!";
    }

    @Override
    public String getInforme(){
        return nuevoInforme.getInformeFinanciero();
    }


}
