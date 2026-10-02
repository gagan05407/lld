package observer_design_pattern.observer;

import observer_design_pattern.observable.Observable;

public class MobileAlert implements Observer {

    Observable obj;
    String emailId;

    public MobileAlert(String emailId, Observable observable) {
        this.obj = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("mail sent to " + emailId);
    }
}