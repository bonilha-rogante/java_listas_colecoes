// Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

// Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

// No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

// Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

// Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(20);
        lista.add(13);

        Collections.sort(lista);
        System.out.println(lista);

        List<Titulo> lista_titulo = new ArrayList<>();

        var titulo1 = new Titulo("Guilherme");
        var titulo2 = new Titulo("Fernanda");
        var titulo3 = new Titulo("Iasmin");

        lista_titulo.add(titulo1);
        lista_titulo.add(titulo2);
        lista_titulo.add(titulo3);

        Collections.sort(lista_titulo);

        for(Titulo titulo: lista_titulo) {
            System.out.println(titulo.getNome());
        }



        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new LinkedList<>();

        lista1.add("oi");
        lista1.add("ok");
        lista1.add("Tudo");

        lista2.add("bem");
        lista2.add("com");
        lista2.add("Você");

        System.out.println(lista1);
        System.out.println(lista2);


        List<String> listPolimorfica;
        listPolimorfica = new ArrayList<>();

        listPolimorfica = new LinkedList<>();

    }
}
