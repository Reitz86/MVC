package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach((observer) -> {
            observer.update();
        });
    }
}
