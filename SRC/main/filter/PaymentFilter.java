package SRC.main.filter;

import SRC.main.model.Transport;

public class PaymentFilter implements TransportFilter {
    @Override
    public Transport apply(Transport transport) {
        transport.notifyObservers("Payment Filter applied: " + transport.paymentType);
        return transport;
    }
}
