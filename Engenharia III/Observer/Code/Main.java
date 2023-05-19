public class Main {
    public static void main(String[] args) {
        Platform platform = new Platform();

        SubscriberPhone subscriber1 = new SubscriberPhone("Andre");
        SubscriberPc subscriber2 = new SubscriberPc("Erick");

        platform.registerObserver(subscriber1);
        platform.registerObserver(subscriber2);
        
        platform.uploadVideo("Alanzoka está ao vivo!");

        platform.removeObserver(subscriber2);

        SubscriberPc subscriber3 = new SubscriberPc("Debinha");

        platform.registerObserver(subscriber3);

        platform.uploadVideo("MagnumofSpades está ao vivo!");




    }
}