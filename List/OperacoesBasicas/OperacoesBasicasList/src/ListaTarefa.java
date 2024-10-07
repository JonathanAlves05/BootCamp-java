import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>(); // Cria um novo objeto Tarefa e o adiciona à lista
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); // Cria um novo objeto Tarefa e o adiciona à lista
    }
    public void removerTarefa(String descricao){
        // Cria uma lista temporária para armazenar as tarefas que devem ser removidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // Verifica se a lista de tarefas não está vazia
        if (!tarefaList.isEmpty()){
            // Percorre a lista de tarefas
            for (Tarefa t : tarefaList){
                // Se a descrição da tarefa atual for igual à descrição passada como parâmetro (ignorando maiúsculas/minúsculas)
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    // Adiciona a tarefa na lista de tarefas a serem removidas
                    tarefasParaRemover.add(t);
                }
            }
            // Remove todas as tarefas que estão na lista de remoção
            tarefaList.removeAll(tarefasParaRemover);
        }else {
            // Caso a lista de tarefas esteja vazia, exibe uma mensagem de aviso
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size(); // Retorna o tamanho da lista de tarefas
    }

    public void obterDescricoesTarefas(){
        // Verifica se a lista de tarefas não está vazia
        if (!tarefaList.isEmpty()) {
            // Exibe a lista de tarefas (chama o metodo toString() de cada tarefa da lista)
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();
        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }


}

