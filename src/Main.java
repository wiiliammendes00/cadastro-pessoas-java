public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        cadastro.adicionar(new Pessoa("William", 20));
        cadastro.adicionar(new Pessoa("João", 25));
        cadastro.adicionar(new Pessoa("Ana", 18));

        System.out.println("Lista original:");
        cadastro.listar();

        System.out.println("\nOrdenando por nome:");
        cadastro.ordenarPorNome();
        cadastro.listar();
    }
}