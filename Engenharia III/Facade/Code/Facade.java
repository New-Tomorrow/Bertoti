class Facade{
    private Platform platform;

    public Facade(Platform platform){
        this.platform = platform;
    }

    public void liveStart(String liveTitle){
        platform.uploadVideo(liveTitle);
        platform.notifyObservers(liveTitle);

    }

    public void register(Observer observer){
        platform.registerObserver(observer);

    }

    public void remove(Observer observer){
        platform.removeObserver(observer);
        platform.notifyRemove(observer);

    }

}
