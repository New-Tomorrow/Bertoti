public class Main {
    public static void main(String[] args) {

        Singleton cliente1 = Singleton.getInstance("Andre");
        Singleton cliente2 = Singleton.getInstance("José");
        
        System.out.println("Cliente 1: " + cliente1.getCliente());
        System.out.println("Cliente 2: " + cliente2.getCliente());
        System.out.println("É a mesma instância: " + (cliente1 == cliente2));

        
    }
}