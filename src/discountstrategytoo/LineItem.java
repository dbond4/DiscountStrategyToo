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
    private FakeDatabase fd;
    
    public LineItem(int productID, int quantity) {
        this.quantity = quantity;
        product = findProductByID(productID);
    }
    
    public double getSubtotal(){
        return (product.getUnitCost() * quantity);
    }
    
    public String getItemName(){
        return product.getProductName();
        
    }
    public Product findProductByID(int productID){
            product = fd.getProductByID(productID);
                    return product;
            }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
