public class ObserverPattern {
    public static void main(String[] args) {
        SubscriptionGrabber subscriptionGrabber = new SubscriptionGrabber();
        SubscriptionObserver subscriptionObserver = new SubscriptionObserver(subscriptionGrabber);
        SubscriptionObserver subscriptionObserver2 = new SubscriptionObserver(subscriptionGrabber);
        SubscriptionObserver subscriptionObserver3 = new SubscriptionObserver(subscriptionGrabber);
        subscriptionGrabber.setNewPrice(5);
    }
}
