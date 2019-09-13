public interface Subject {
    public double getCurrentPrice();
    public void setNewPrice(double newPrice);
    public void addNewSubscriber(Observer newSuObserver);
    public void removeSubscriber(Observer unsubscriber);
    public void notifyAllSubscribers();
}
