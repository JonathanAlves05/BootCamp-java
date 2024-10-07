import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributo: uma lista que vai armazenar objetos do tipo Livro
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();// Cria uma nova lista vazia para armazenar os livros
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));// Adiciona um novo objeto Livro à lista
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        // Cria uma nova lista para armazenar os livros que correspondem ao autor pesquisado
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            // Percorre a lista de livros
            for (Livro l : livroList) {
                // Se o autor do livro for igual ao autor pesquisado (ignorando maiúsculas/minúsculas), o livro é adicionado à lista
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;// Retorna a lista de livros correspondentes ao autor
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                // Se o ano de publicação do livro estiver dentro do intervalo especificado, o livro é adicionado à lista
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos; // Retorna a lista de livros publicados no intervalo de anos especificado
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public Livro pesquisarPorTitulo(String titulo) {
        // Inicializa a variável para armazenar o livro correspondente ao título (caso seja encontrado)
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                // Se o título do livro for igual ao título pesquisado (ignorando maiúsculas/minúsculas), o livro é atribuído à variável e a busca é interrompida
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo; // Retorna o livro correspondente ao título (ou null, se não for encontrado)
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }


}
