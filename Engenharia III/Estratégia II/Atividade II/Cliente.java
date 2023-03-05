import java.util.Scanner;

public class Cliente implements Pedido{
    private String nome;
    private String email;
    private String endereco;
    private String cpf;
    private String ddd;
    private String telefone;


    public void solicitar(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do Cliente:");
        nome = leitura.nextLine();

        System.out.println("Digite o email do Cliente:");
        email = leitura.nextLine();

        System.out.println("Digite o endereco do Cliente:");
        endereco = leitura.nextLine();

        System.out.println("Digite o CPF do Cliente:");
        cpf = leitura.nextLine();

        System.out.println("Digite o DDD do Telefone do Cliente:");
        ddd = leitura.nextLine();

        System.out.println("Digite o Telefone do Cliente:");
        telefone = leitura.nextLine();

        System.out.println("\nCliente Cadastrado:");

        System.out.println("\nNome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("DDD: " + ddd);
        System.out.println("Telefone: " + telefone);
       
    }
}

