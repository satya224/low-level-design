package designpattern.observerpattern.observable;

import designpattern.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void  notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();
}
