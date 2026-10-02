package observer_design_pattern;

import observer_design_pattern.observable.Observable;
import observer_design_pattern.observable.Iphone;
import observer_design_pattern.observer.Observer;
import observer_design_pattern.observer.MobileAlert;

public class Store {

    public static void main(String args[]) {

        Observable iphoneObservable = new Iphone();

        Observer ob1 =
            new MobileAlert("xyz123@gmail.com", iphoneObservable);

        Observer ob2 =
            new MobileAlert("xyz12@gmail.com", iphoneObservable);

        Observer ob3 =
            new MobileAlert("xyz1@gmail.com", iphoneObservable);

        iphoneObservable.add(ob1);
        iphoneObservable.add(ob2);
        iphoneObservable.add(ob3);

        iphoneObservable.setCount(10);
    }
}