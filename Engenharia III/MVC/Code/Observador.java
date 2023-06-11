import java.util.List;

class Observador implements Observer {
    private String email;

    public Observador(String email) {
        this.email = email;
    }

    public void notificar(List<Veiculo> veiculos) {
        System.out.println(email + " recebeu a seguinte notificação: Veiculo aludado");
      
    }

}