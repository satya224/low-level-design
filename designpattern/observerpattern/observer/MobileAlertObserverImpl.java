package designpattern.observerpattern.observer;

import designpattern.observerpattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private final String phone;
    private final StockObservable stockObservable;

    public MobileAlertObserverImpl(String phone, StockObservable stockObservable) {
        this.phone = phone;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendText();
    }

    private void sendText() {
        System.out.println("msg sent to " + phone + " with info : New Stock - " + stockObservable.getStockCount());
    }
}
