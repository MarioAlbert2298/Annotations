package com.example.AnnotationsPractice;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero{


    @Override
    public String getInformeFinanciero() {
        return "Presentacion de infrme catastrofico del trimestre 2";
    }
}
