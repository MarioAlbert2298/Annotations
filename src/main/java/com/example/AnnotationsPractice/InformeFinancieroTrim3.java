package com.example.AnnotationsPractice;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero{


    @Override
    public String getInformeFinanciero() {
        return "Presentacion de Informe Favorable de Trimestre 3";
    }
}
