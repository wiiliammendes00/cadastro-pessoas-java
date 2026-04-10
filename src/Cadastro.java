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
        Iterator<Pessoa> it = lista.iterator();

        while (it.hasNext()) {
            Pessoa p = it.next();
            if (p.getNome().equalsIgnoreCase(nome)) {
                it.remove();
                System.out.println("Removido: " + p);
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    public void ordenarPorNome() {
        Collections.sort(lista);
    }
}