package algorithm.design.responsibility;

public class PriceHandlerFactory {
    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler lead = new Lead();
        PriceHandler directory = new Directory();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();
        sales.setSuccessor(lead);
        lead.setSuccessor(manager);
        manager.setSuccessor(directory);

        directory.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        return sales;
    }
}
