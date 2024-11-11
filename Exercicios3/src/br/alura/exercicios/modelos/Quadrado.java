package br.alura.exercicios.modelos;

public class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
