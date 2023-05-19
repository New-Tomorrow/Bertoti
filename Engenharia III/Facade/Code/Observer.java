interface Observer {
    void update(String liveTitle);
    void remove(Observer observer);
}