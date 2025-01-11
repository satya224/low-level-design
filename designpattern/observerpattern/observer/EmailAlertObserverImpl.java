package designpattern.observerpattern.observer;

import designpattern.observerpattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    private final String email;
    private final StockObservable stockObservable;

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail();
    }

    private void sendMail() {
        System.out.println("email sent to " + email + " with info : New Stock - " + stockObservable.getStockCount());
    }
}
