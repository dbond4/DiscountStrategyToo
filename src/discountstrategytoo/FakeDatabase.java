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
    public Customer getCustomerByID(int ID){
        for (Customer w : customers){
            if (w.getCustomerID() == ID){
                return w;
            }
        }
        throw new IllegalArgumentException("must be a valid customer ID");
    }
}
