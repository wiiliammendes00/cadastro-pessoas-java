import java.util.*;

public class Cadastro {

    private Map<String, Pessoa> mapa = new HashMap<>();

    public void adicionar(Pessoa p) {
        String chave = p.getNome().toLowerCase();

        if (mapa.containsKey(chave)) {
            System.out.println("Pessoa já existe!");
        } else {
            mapa.put(chave, p);
            System.out.println("Pessoa adicionada!");
        }
    }

        public Collection<Pessoa> listarImutavel() {
        return Collections.unmodifiableCollection(mapa.values());
    }

    public void listar() {
        for (Pessoa p : listarImutavel()) {
            System.out.println(p);
        }
    }

    public void buscar(String nome) {
        Pessoa p = mapa.get(nome.toLowerCase());

        if (p != null) {
            System.out.println("Encontrado: " + p);
        } else {
            System.out.println("Não encontrado.");
        }
    }

    public void removerPorNome(String nome) {
        Pessoa removida = mapa.remove(nome.toLowerCase());

        if (removida != null) {
            System.out.println("Removido: " + removida);
        } else {
            System.out.println("Não encontrado.");
        }
    }

    public void ordenarPorNome() {
        List<Pessoa> lista = new ArrayList<>(mapa.values());
        Collections.sort(lista);

        for (Pessoa p : lista) {
            System.out.println(p);
        }
    }

    public void ordenarPorIdade() {
        List<Pessoa> lista = new ArrayList<>(mapa.values());
        lista.sort((a, b) -> Integer.compare(a.getIdade(), b.getIdade()));

        for (Pessoa p : lista) {
            System.out.println(p);
        }
    }

    public void listarReverso() {
        List<Pessoa> lista = new ArrayList<>(mapa.values());
        ListIterator<Pessoa> it = lista.listIterator(lista.size());

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}