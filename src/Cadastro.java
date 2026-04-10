import java.util.*;

public class Cadastro {
    private List<Pessoa> lista = new ArrayList<>();

    public void adicionar(Pessoa p) {
        lista.add(p);
    }

    public void listar() {
        for (Pessoa p : lista) {
            System.out.println(p);
        }
    }

    public void buscar(String nome) {
        for (Pessoa p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado: " + p);
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    public void removerPorNome(String nome) {
        for (Pessoa p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                lista.remove(p);
                System.out.println("Removido: " + p);
                return;
            }
        }
        System.out.println("Não encontrado.");
    }
}