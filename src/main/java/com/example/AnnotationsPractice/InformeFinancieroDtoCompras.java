package com.example.AnnotationsPractice;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del Departamento de compras 2018";
    }
}
