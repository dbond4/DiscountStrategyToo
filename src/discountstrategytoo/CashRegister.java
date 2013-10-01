/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class CashRegister {
    
    private Customer customer;
    
    private FakeDatabase fd;

    public CashRegister(Customer customer, FakeDatabase fd) {
        this.customer = customer;
        this.fd = new fd;
    }
    
    
    public findCustomerByID(int customerID){
        customer = fd.getCustomerByID(customerID)
                return customerID;
    }
    
}
