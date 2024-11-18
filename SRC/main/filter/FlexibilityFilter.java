package SRC.main.filter;

import SRC.main.model.Transport;

public class FlexibilityFilter implements TransportFilter {
    @Override
    public Transport apply(Transport transport) {
        transport.notifyObservers("Flexibility Filter applied: " + transport.flexibility);
        return transport;
    }
}
