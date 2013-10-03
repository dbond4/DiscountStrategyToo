/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscountRate(int quantity, double unitCost) {
        return (quantity * unitCost);
        }
    
}
