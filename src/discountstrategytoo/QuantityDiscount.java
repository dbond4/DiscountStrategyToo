/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class QuantityDiscount implements DiscountStrategy{
    
    private double discountRate;
    private int minimumQuantity;
    private final int ONE = 1;

    public QuantityDiscount(double discountRate, int minimumQuantity) {
        this.discountRate = discountRate;
        this.minimumQuantity = minimumQuantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    @Override
    public double getDiscountRate(int quantity, double unitCost) {
        if (quantity < minimumQuantity){
            return quantity * unitCost;
        }
        else{
            return (quantity * unitCost) * (ONE - getDiscountRate());
        }
    }
    
    
    
}
