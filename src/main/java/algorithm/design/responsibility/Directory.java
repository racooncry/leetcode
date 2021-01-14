package algorithm.design.responsibility;

/**
 * 销售，可以批准  5%y以内的折扣
 */
public class Directory extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
