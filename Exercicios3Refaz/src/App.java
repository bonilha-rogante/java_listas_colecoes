// Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.

// Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

// Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.

// Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

// Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
// Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

import java.util.ArrayList;

import br.alura.exercios.modelos.Animal;
import br.alura.exercios.modelos.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Guilherme");
        nomes.add("Fernanda");
        nomes.add("Iasmin");

        nomes.forEach(nome -> System.out.println(nome));
        nomes.forEach(System.out::println);

        Cachorro cao1 = new Cachorro();

        Animal animal = (Animal) cao1;

        if(animal instanceof Cachorro) {
            Cachorro cao = (Cachorro)animal;
        } else {
            System.out.println("Não é cachorro");
        }
         
    }
}
