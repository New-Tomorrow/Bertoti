public class Cliente {
    private String nome;
    private String email;
    private TipoCliente tipo;

    public Cliente(String nome, String email, TipoCliente tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    public TipoCliente getTipo() {
        return tipo;
    }
}
