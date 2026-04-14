import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }

     @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome);
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                nome.equalsIgnoreCase(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome.toLowerCase(), idade);
    }
}