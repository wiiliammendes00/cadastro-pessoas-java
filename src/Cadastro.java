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
}