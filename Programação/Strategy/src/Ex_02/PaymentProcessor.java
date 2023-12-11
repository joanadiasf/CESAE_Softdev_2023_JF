package Ex_02;

public class PaymentProcessor {

    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double discountCalc(double discount){



        return discount;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }
}
