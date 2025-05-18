package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {
    private String recomendacion;

    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificacion() >=4){
            System.out.println("Muy bien evaluado en el momento");
        }else if(clasificable.getClasificacion() >=2 ){
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Animate a disfrutarla y comentanos, agregalo a tu lista");
        }
    }
}