package cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    Set<Produto> produtoSet;

    //construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //metodos
    public void addProduto(String nome, long codigo, double preco, int quantidade) {
        this.produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        //TreeSet deixa organizado, diferente do HashSet
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        //preenchendo para que possa ser organizado
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}
