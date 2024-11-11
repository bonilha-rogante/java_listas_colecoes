// Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
// Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().
// Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
// Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.

import java.util.ArrayList;

import br.alura.exercicios.modelos.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        Produto produto1 = new Produto("Prod1", 18.91, 42);
        Produto produto2 = new Produto("Prod2", 27.13, 37);
        Produto produto3 = new Produto("Prod3", 45.11, 62);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println(listaProdutos.size());

        System.out.println(listaProdutos.toString());

        for(Produto produto : listaProdutos) {
            System.out.println(produto);
        }
        
    }
}
