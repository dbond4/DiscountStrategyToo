/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class SalesDiscount implements DiscountStrategy{
    
    private double discountRate;
    private final int ONE = 1;

    @Override
    public double getDiscountRate(int quantity, double unitCost) {
        return quantity * ((ONE - discountRate) * unitCost);
    }

    public SalesDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
