import java.util.*;

public class Cadastro {

    private Set<Pessoa> lista = new HashSet<>();

    public void adicionar(Pessoa p) {
        if (lista.add(p)) {
            System.out.println("Pessoa adicionada!");
        } else {
            System.out.println("Pessoa já existe!");
        }
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
        List<Pessoa> temp = new ArrayList<>(lista);
        Collections.sort(temp);
        for (Pessoa p : temp) {
            System.out.println(p);
        }
    }

    public void ordenarPorIdade() {
        List<Pessoa> temp = new ArrayList<>(lista);
        temp.sort((a, b) -> Integer.compare(a.getIdade(), b.getIdade()));
        for (Pessoa p : temp) {
            System.out.println(p);
        }
    }

    public void listarReverso() {
        List<Pessoa> temp = new ArrayList<>(lista);
        ListIterator<Pessoa> it = temp.listIterator(temp.size());

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}