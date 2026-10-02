package observer_design_pattern.observable;

import observer_design_pattern.observer.Observer;

public interface Observable {

    void add(Observer obj);

    void remove(Observer obj);

    void notifyObservers();

    void setCount(int newStock);

    int getCount();
}