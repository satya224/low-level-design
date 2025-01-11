package designpattern.observerpattern;

import designpattern.observerpattern.observable.IphoneObservableImpl;
import designpattern.observerpattern.observable.StockObservable;
import designpattern.observerpattern.observer.EmailAlertObserverImpl;
import designpattern.observerpattern.observer.MobileAlertObserverImpl;
import designpattern.observerpattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("123-123-123", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
    }
}
