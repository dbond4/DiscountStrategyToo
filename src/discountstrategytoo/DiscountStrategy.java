/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountRate(int quantity, double unitCost);
    
}
