package cadastroProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.addProduto("Arroz", 123456, 6.0, 10);
        cadastro.addProduto("Feijao", 654123, 10.0, 5);
        cadastro.addProduto("Macarrao", 987456, 2.7, 3);
        cadastro.addProduto("Carne", 147852, 40.0, 5);

        System.out.println("Produtos por nome: ");
        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println();

        System.out.println("Produtos por preco: ");
        System.out.println(cadastro.exibirProdutosPorPreco());
        System.out.println();
    }
}