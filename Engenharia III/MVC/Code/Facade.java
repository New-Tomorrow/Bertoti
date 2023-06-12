import java.util.List;

public class Facade {
    private Controller controller;
    private View view;

    public Facade() {
        this.controller = new Controller();
        this.view = new View(controller);
    }

    public void executarLocadora() {
        view.executar();
    }

    public List<Veiculo> verificarDisponibilidade() {
        return controller.disponibilidade();
       
    }

    public boolean alugarVeiculo(String marca, String modelo, String nomeCliente, String emailCliente, TipoCliente tipoCliente) {
        return controller.alugar(marca, modelo, nomeCliente, emailCliente, tipoCliente);
    }

    public List<Veiculo> obterVeiculosAlugados() {
        return controller.obterVeiculosAlugados();
    }

    public boolean devolverVeiculo(String marca, String modelo) {
        return controller.devolver(marca, modelo);
    }
}