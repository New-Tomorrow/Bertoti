class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String liveTitle) {
        System.out.println(name + " recebeu uma notificação pelo Celular: " + liveTitle);
    }
    public void remove(Observer observer) {
        System.out.println(name + " foi removido da lista de inscritos.");
    }
}