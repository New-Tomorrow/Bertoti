import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Veiculo> veiculos;
    private List<Veiculo> veiculosAlugados;
   private List<Observador> observadores = new ArrayList<>();

    public Controller() {
        this.veiculos = new ArrayList<>();
        this.veiculosAlugados = new ArrayList<>();
        
        veiculos.add(new Veiculo("Ford", "Fiesta"));
        veiculos.add(new Veiculo("Chevrolet", "Onix"));
        veiculos.add(new Veiculo("Honda", "Civic"));

        observadores.add(new Observador("Diretoria@gmail.com") );
            
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.notificar(veiculos);
        }
    }


    public List<Veiculo> disponibilidade() {
        List<Veiculo> veiculosDisponiveis = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getDisponivel()) {
                veiculosDisponiveis.add(veiculo);
            }
        }
        return veiculosDisponiveis;
    }

    public boolean alugar(String marca, String modelo, String nomeCliente, String emailCliente) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equalsIgnoreCase(marca) && veiculo.getModelo().equalsIgnoreCase(modelo)) {
                if (veiculo.getDisponivel()) {
                    Cliente cliente = new Cliente(nomeCliente, emailCliente);
                    veiculo.setCliente(cliente);
                    veiculo.setDisponivel(false);
                    veiculosAlugados.add(veiculo);
                    notificarObservadores();

                    return true;
                }
            }
        }
        return false;
    }

    public List<Veiculo> obterVeiculosAlugados() {
        return veiculosAlugados;
    }

    public boolean devolver(String marca, String modelo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equalsIgnoreCase(marca) && veiculo.getModelo().equalsIgnoreCase(modelo)) {
                if (!veiculo.getDisponivel()) {
                    veiculo.setCliente(null);
                    veiculo.setDisponivel(true);
                    veiculosAlugados.remove(veiculo);
                    notificarObservadores();

                    return true;
                }
            }
        }
        return false;
    }



}