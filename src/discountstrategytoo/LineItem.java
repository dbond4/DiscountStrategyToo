/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class LineItem {
    
    private Product product;
    private int quantity;
    
    public LineItem(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
        
    }
    
    public double getSubtotal(){
        return (product.getUnitCost() * quantity);
    }
    
    public String getItemName(){
        return product.getProductName();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
