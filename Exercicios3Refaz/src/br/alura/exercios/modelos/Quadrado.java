package br.alura.exercios.modelos;

public class Quadrado implements Forma {
    public double lado;

    @Override
    public double calcularArea(){
        return lado * lado;
    }

}
