public class Singleton {
    private String cliente;

    private static Singleton instance;
    
    private Singleton(String cliente) {
        this.cliente = cliente;
       
    }
    
    public static Singleton getInstance(String cliente) {
        if (instance == null) {
            instance = new Singleton(cliente);
        }
        return instance;
    }
    
    public String getCliente() {
        return cliente;
    }

}


