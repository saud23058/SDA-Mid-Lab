import SRC.main.controller.TransportController;
import SRC.main.filter.FlexibilityFilter;
import SRC.main.filter.PaymentFilter;
import SRC.main.observer.TransportView;

public class TransportSystem {
    public static void main(String[] args) {
        
      
        // Create Observer
        TransportView view = new TransportView();

        // Register Observer to Transports
    

        // Create Filters
        FlexibilityFilter flexibilityFilter = new FlexibilityFilter();
        PaymentFilter paymentFilter = new PaymentFilter();

        // Controller
        TransportController controller = new TransportController();
     

        controller.addFilter(flexibilityFilter);
        controller.addFilter(paymentFilter);

        // Process and View
        controller.processTransports();
    }
}
