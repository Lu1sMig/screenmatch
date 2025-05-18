package com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean activa;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;
    //contructor
    public Serie(String nombre, int fechaDeLanzamiento){
        super(nombre,fechaDeLanzamiento);
    }
    //getters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isActiva(){
        return activa;
    }

    public void setActiva(boolean activa){
        this.activa = activa;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    @Override
    public String toString(){
        return "Serie: "+this.getNombre()+" ("+this.getFechaDeLanzamiento()+")";
    }
}