import SRC.main.controller.TransportController;
import SRC.main.filter.FlexibilityFilter;
import SRC.main.filter.PaymentFilter;
import SRC.main.model.OwnConveyance;
import SRC.main.model.PublicTransport;
import SRC.main.model.Transport;
import SRC.main.model.UniversityTransport;
import SRC.main.observer.TransportView;

public class TransportSystem {
    public static void main(String[] args) {
        
       // Create Transports
        Transport publicTransport = new PublicTransport();
        Transport ownConveyance = new OwnConveyance();
        Transport universityTransport = new UniversityTransport();

        // Create Observer
        TransportView view = new TransportView();

        // Register Observer to Transports
        publicTransport.addObserver(view);
        ownConveyance.addObserver(view);
        universityTransport.addObserver(view);

        // Create Filters
        FlexibilityFilter flexibilityFilter = new FlexibilityFilter();
        PaymentFilter paymentFilter = new PaymentFilter();

        // Controller
        TransportController controller = new TransportController();
        controller.addTransport(publicTransport);
        controller.addTransport(ownConveyance);
        controller.addTransport(universityTransport);

        controller.addFilter(flexibilityFilter);
        controller.addFilter(paymentFilter);

        // Process and View
        controller.processTransports();
    }
}
