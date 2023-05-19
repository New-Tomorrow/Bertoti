public class Main {
    public static void main(String[] args) {
        Platform platform = new Platform();
        Facade facade = new Facade(platform);

        Subscriber subscriber1 = new Subscriber("Andre");
        Subscriber subscriber2 = new Subscriber("Erick");

        facade.register(subscriber1);
        facade.register(subscriber2);
        
        facade.liveStart("Alanzoka está ao vivo!");

        facade.remove(subscriber2);

        Subscriber subscriber3 = new Subscriber("Debinha");

        facade.register(subscriber3);

        facade.liveStart("MagnumofSpades está ao vivo!");




    }
}