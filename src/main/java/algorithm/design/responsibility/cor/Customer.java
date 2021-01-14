package algorithm.design.responsibility.cor;

import algorithm.design.responsibility.PriceHandler;
import algorithm.design.responsibility.PriceHandlerFactory;

public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDisconunt(float discount) {
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        customer.requestDisconunt(0.4f);
    }
}
