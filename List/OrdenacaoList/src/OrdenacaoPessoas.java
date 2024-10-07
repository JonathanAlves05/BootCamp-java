

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo: uma lista que vai armazenar objetos do tipo Pessoa
    private List<Pessoa> pessoaList;

    // Construtor da classe OrdenacaoPessoas: inicializa a lista de pessoas
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>(); // Cria uma nova lista vazia para armazenar as pessoas
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura)); // Adiciona um novo objeto Pessoa à lista
    }

    public List<Pessoa> ordenarPorIdade() {
        // Cria uma nova lista a partir da lista original para não modificar diretamente a lista de pessoaList
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        // Verifica se a lista não está vazia antes de ordenar
        if (!pessoaList.isEmpty()) {
            // Usa o metodo Collections.sort() para ordenar a lista de acordo com o metodo compareTo da classe Pessoa
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;// Retorna a lista ordenada por idade
        } else {
            // Lança uma exceção se a lista estiver vazia
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            // Usa o metodo Collections.sort() passando um comparador personalizado (ComparatorPorAltura) para ordenar por altura
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura; // Retorna a lista ordenada por altura
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
