import java.util.Scanner;

public class Produto implements Pedido{
    private String nomeP;
    private String descricao;
    private float valor;


    public void solicitar(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("\nDigite o nome do Produto:");
        nomeP = leitura.nextLine();

        System.out.println("Digite a descricao do Produto:");
        descricao = leitura.nextLine();

        System.out.println("Digite o valor do Produto:");
        valor = leitura.nextFloat();

        System.out.println("\nProtudo Cadastrado:");

        System.out.println("\nNome: " + nomeP);
        System.out.println("Descricao: " + descricao );
        System.out.println("Valor: " + valor);


    }
}