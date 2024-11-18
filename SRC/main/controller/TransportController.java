package SRC.main.controller;





import java.util.ArrayList;
import java.util.List;

import SRC.main.filter.TransportFilter;
import SRC.main.model.Transport;

public class TransportController {
    private final List<Transport> transports = new ArrayList<>();
    private final List<TransportFilter> filters = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public void addFilter(TransportFilter filter) {
        filters.add(filter);
    }

    public void processTransports() {
        for (Transport transport : transports) {
            System.out.println("Processing: " + transport.name);
            for (TransportFilter filter : filters) {
                filter.apply(transport);
            }
            System.out.println(transport.getDetails() + "\n");
        }
    }
}
