import java.util.List;
import java.util.Scanner;

public class View {
    private Controller controller;
    private Scanner scanner;

    public View(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Bem-vindo à Locadora de Veículos!");
        System.out.println("1. Verificar disponibilidade de veículo");
        System.out.println("2. Alugar veículo");
        System.out.println("3. Exibir Alugados");
        System.out.println("4. Devolver veículo");
        System.out.println("0. Sair");
    }

    public void executar() {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    disponibilidade();
                    break;
                case 2:
                    alugar();
                    break;
                case 3:
                    exibirAlugados();
                    break;
                case 4:
                    devolver();
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso serviço!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public void disponibilidade() {
        List<Veiculo> veiculosDisponiveis = controller.disponibilidade();

        if (veiculosDisponiveis.isEmpty()) {
            System.out.println("Não há veículos disponíveis para locação.");
        } else {
            System.out.println("Veículos disponíveis para locação:");
            for (Veiculo veiculo : veiculosDisponiveis) {
                System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo());
            }
        }
    }

    public void alugar() {
        System.out.println("Informe a marca do veículo:");
        String marca = scanner.next();
        System.out.println("Informe o modelo do veículo:");
        String modelo = scanner.next();

        System.out.println("Informe o nome do cliente:");
        String nomeCliente = scanner.next();
        System.out.println("Informe o e-mail do cliente:");
        String emailCliente = scanner.next();

        boolean alugado = controller.alugar(marca, modelo, nomeCliente, emailCliente);
        if (alugado) {
            System.out.println("Veículo alugado com sucesso.");
        } else {
            System.out.println("Não foi possível alugar o veículo.");
        }
    }

    public void exibirAlugados() {
        List<Veiculo> veiculosAlugados = controller.obterVeiculosAlugados();

        if (veiculosAlugados.isEmpty()) {
            System.out.println("Não há veículos alugados.");
        } else {
            System.out.println("Veículos alugados:");
            for (Veiculo veiculo : veiculosAlugados) {
                System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo());
                System.out.println(
                        "Cliente: " + veiculo.getCliente().getNome() + ", Email: " + veiculo.getCliente().getEmail());
                System.out.println("------------------------------------");
            }
        }
    }

    public void devolver() {
        System.out.println("Informe a marca do veículo:");
        String marca = scanner.next();
        System.out.println("Informe o modelo do veículo:");
        String modelo = scanner.next();

        boolean devolvido = controller.devolver(marca, modelo);
        if (devolvido) {
            System.out.println("Veículo devolvido com sucesso.");
        } else {
            System.out.println("Não foi possível devolver o veículo.");
        }
    }

}
