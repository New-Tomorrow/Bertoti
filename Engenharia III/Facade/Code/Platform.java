import java.util.ArrayList;
import java.util.List;

class Platform {
    private List<Observer> subscribers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
        // notifyRemove(observer);
    }
    public void notifyRemove(Observer observer) {
        observer.remove(observer);
    }

    public void uploadVideo(String liveTitle) {
        System.out.println("\nIniciando a Live: " + liveTitle);
        // notifyObservers(liveTitle);
    }
    
    public void notifyObservers(String liveTitle) {
        for (Observer observer : subscribers) {
            observer.update(liveTitle);
        }
    }
}