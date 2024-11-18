package SRC.main.observer;



public class TransportView implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer Notification: " + message);
    }

    public void displayTransport(String transportDetails) {
        System.out.println("Transport Details:\n" + transportDetails);
    }
}
