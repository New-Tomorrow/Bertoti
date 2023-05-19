class SubscriberPhone implements Observer {
    private String name;

    public SubscriberPhone(String name) {
        this.name = name;
    }

    public void update(String liveTitle) {
        System.out.println(name + " recebeu uma notificação pelo Celular: " + liveTitle);
    }
}