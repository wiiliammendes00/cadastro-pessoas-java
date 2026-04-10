public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        cadastro.adicionar(new Pessoa("William", 20));
        cadastro.adicionar(new Pessoa("João", 25));

        cadastro.listar();

        System.out.println("\nBuscando João:");
        cadastro.buscar("João");
    }
}