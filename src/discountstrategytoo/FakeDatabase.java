/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class FakeDatabase {
    
    private Customer[] customers = {
        new Customer("Dave", 001)
    };
    public Customer getCustomerByID(int cID){
        for (Customer w : customers){
            if (w.getCustomerID() == cID){
                return w;
            }
        }
        throw new IllegalArgumentException("must be a valid customer ID");
    }
    private Product[] products = {
        new Product("Hat", 100, 14.99, new NoDiscount()),
        new Product("Shirt", 200, 19.99, new QuantityDiscount(.15, 2)),
        new Product("Jeans", 300, 39.99, new SalesDiscount(.2))
    };
    public Product getProductByID(int pID){
        for (Product p : products) {
            if (p.getPoductID() == pID){
                return p;
            }
        }
        throw new IllegalArgumentException("must be a valid product ID");
    }
    
}
