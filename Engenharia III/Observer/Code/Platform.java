import java.util.ArrayList;
import java.util.List;

class Platform implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObservers(String liveTitle) {
        for (Observer observer : subscribers) {
            observer.update(liveTitle);
        }
    }

    public void uploadVideo(String liveTitle) {
       
        System.out.println("\nIniciando a Live: " + liveTitle);
        notifyObservers(liveTitle);
    }
}