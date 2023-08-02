package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;
    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    public void update(){
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }
    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("Msg sent to : "+ userName);
    }
}
