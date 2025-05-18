package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String Director;
    //Constructor
    public Pelicula(String nombre, int fechaDeLanzamiento){
        super(nombre, fechaDeLanzamiento);
    }
    //Getter
    public String getDirector() {
        return Director;
    }
    //Setter
    public void setDirector(String director) {
        this.Director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString(){
        return "Pelicula: "+this.getNombre()+" ("+getFechaDeLanzamiento()+")";
    }
}