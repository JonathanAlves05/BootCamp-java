import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Usamos um conjunto (Set) para armazenar os produtos, garantindo que não haja duplicatas
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>(); //HashSet (não mantém ordem)
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        // Utiliza TreeSet para garantir a ordenação com base no nome do produto (Comparable)
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()) {
            return produtosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public Set<Produto> exibirProdutosPorPreco() {
        // Utiliza TreeSet com um Comparator personalizado para ordenar pelo preço
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
            // Adiciona todos os produtos ao TreeSet, que os ordena pelo preço
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
