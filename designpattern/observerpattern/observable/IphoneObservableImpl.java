package designpattern.observerpattern.observable;

import designpattern.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    private final List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        observerList.forEach(NotificationAlertObserver::update);
    }

//    newAStockAdded will always be more than 0
    @Override
    public void setStockCount(int newStockAdded) {
        stockCount += newStockAdded;
        if(stockCount - newStockAdded == 0) {
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
