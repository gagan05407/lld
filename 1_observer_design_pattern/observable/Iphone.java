package observer_design_pattern.observable;

import observer_design_pattern.observer.Observer;
import java.util.*;

public class Iphone implements Observable {

    List<Observer> observerList;
    int count;

    public Iphone() {
        observerList = new ArrayList<>();
        count = 0;
    }

    @Override
    public void add(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        if (observerList.contains(obj)) {
            observerList.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setCount(int newStock) {
        if (count == 0) {
            notifyObservers();
        }

        count += newStock;
    }

    @Override
    public int getCount() {
        return count;
    }
}