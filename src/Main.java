import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoa");
            System.out.println("4 - Remover pessoa");
            System.out.println("5 - Ordenar por nome");
            System.out.println("6 - Ordenar por idade");
            System.out.println("7 - Listar reverso");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");


            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(scanner.nextLine());

                    cadastro.adicionar(new Pessoa(nome, idade));
                    break;

                case 2:
                    cadastro.listar();
                    break;

                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = scanner.nextLine();
                    cadastro.buscar(busca);
                    break;

                case 4:
                    System.out.print("Nome para remover: ");
                    String remover = scanner.nextLine();
                    cadastro.removerPorNome(remover);
                    break;

                case 5:
                    cadastro.ordenarPorNome();
                    System.out.println("Ordenado por nome!");
                    cadastro.listar(); // 👈 importante
                    break;

                case 6:
                    cadastro.ordenarPorIdade();
                    System.out.println("Ordenado por idade!");
                    cadastro.listar(); // 👈 importante
                    break;

                case 7:
                    cadastro.listarReverso();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}