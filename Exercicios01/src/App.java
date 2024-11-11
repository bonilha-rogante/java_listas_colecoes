// Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
// No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
// Adicione pelo menos três pessoas à lista utilizando o método add.
// Imprima o tamanho da lista utilizando o método size.
// Imprima a primeira pessoa da lista utilizando o método get.
// Imprima a lista completa

import java.util.ArrayList;

import br.alura.exercicios.modelos.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();
        var pessoa2 = new Pessoa();

        pessoa.setNome("Guilherme");
        pessoa.setIdade(32);

        pessoa1.setNome("Iasmin");
        pessoa1.setIdade(7);
        
        pessoa2.setNome("Fernanda");
        pessoa2.setIdade(31);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println(listaDePessoas.toString());
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));

        System.out.println("Lista de Pessoas: ");

        for (Pessoa pessoas : listaDePessoas) {
            System.out.println(pessoas);
        }
        



    }
}
