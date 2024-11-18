package SRC.main.filter;

import SRC.main.model.Transport;

public interface TransportFilter {
    Transport apply(Transport transport);
}
