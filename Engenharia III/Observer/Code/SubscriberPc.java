class SubscriberPc implements Observer {
    private String name;

    public SubscriberPc(String name) {
        this.name = name;
    }

    public void update(String liveTitle) {
        System.out.println(name + " recebeu uma notificação pelo Pc: " + liveTitle);
    }
}