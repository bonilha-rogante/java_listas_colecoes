// Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.

// Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

// Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.

// Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

// Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.

// Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

import java.util.ArrayList;

import br.alura.exercicios.modelos.Animal;
import br.alura.exercicios.modelos.Cachorro;
import br.alura.exercicios.modelos.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Guilherme");
        lista.add("Iasmin");
        lista.add("Fernanda");

        for(String nome: lista) {
            System.out.println(nome);
        }

        lista.forEach(nome -> System.out.println(nome));

        lista.forEach(System.out::println);

        Cachorro cao1 = new Cachorro();

        Animal animal = (Animal) cao1;

        if (animal instanceof Cachorro) {
            Cachorro cao = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro");
        }

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Prod1", 25.38);
        Produto produto2 = new Produto("Prod2", 42.13);
        Produto produto3 = new Produto("Prod3", 67.89);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double somaPreco = 0;
        for(Produto produto: produtos) {
            somaPreco += produto.getPreco();
        }

        double media = somaPreco / produtos.size();

        System.out.println(media);

        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

   














        // for (String nomes: lista) {
        //     System.out.println(nomes);
        // }

        // lista.forEach(nome -> System.out.println(nome));

        // lista.forEach(System.out::println);

    }
}
