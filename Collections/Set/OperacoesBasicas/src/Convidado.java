import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    //Alt+insert para gerar esse metodo equals e hashcode
    @Override
    public boolean equals(Object o) {
        // Verifica se o objeto comparado é o mesmo (referência na memória)
        if (this == o) return true;
        // Verifica se o objeto passado não é uma instância de Convidado, retornando false se não for
        if (!(o instanceof Convidado convidado)) return false;
        // Compara o código do convite para definir igualdade. Se o código for igual, os objetos são considerados iguais
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        // Retorna um hash baseado no código do convite, usado para otimizar buscas e inserções em estruturas de dados como HashSet
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
