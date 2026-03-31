import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Cadastro do primeiro contato
        System.out.println("Digite o nome do primeiro contato:");
        String n1 = leitor.nextLine();
        System.out.println("Digite o telefone do primeiro contato:");
        String t1 = leitor.nextLine();
        Contato c1 = new Contato(n1, t1);

        // Cadastro do segundo contato
        System.out.println("Digite o nome do segundo contato:");
        String n2 = leitor.nextLine();
        System.out.println("Digite o telefone do segundo contato:");
        String t2 = leitor.nextLine();
        Contato c2 = new Contato(n2, t2);

        // Cadastro do terceiro contato
        System.out.println("Digite o nome do terceiro contato:");
        String n3 = leitor.nextLine();
        System.out.println("Digite o telefone do terceiro contato:");
        String t3 = leitor.nextLine();
        Contato c3 = new Contato(n3, t3);

        // Modificando dados
        c1.setNome("Nome Alterado");
        c2.setTelefone("99999-88888");

        // Exibição dos resultados
        System.out.println("\n--- Lista de Contatos Atualizada ---");
        System.out.println("Nome: " + c1.getNome() + " | Telefone: " + c1.getTelefone());
        System.out.println("Nome: " + c2.getNome() + " | Telefone: " + c2.getTelefone());
        System.out.println("Nome: " + c3.getNome() + " | Telefone: " + c3.getTelefone());

        leitor.close();
    }
}