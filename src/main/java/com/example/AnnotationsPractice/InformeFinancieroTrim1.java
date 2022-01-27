package com.example.AnnotationsPractice;


import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion Informe Trimestre numero Uno!";
    }
}
