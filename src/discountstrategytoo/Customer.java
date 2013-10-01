/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class Customer {
    
    private String customerName;
    private int customerID;
/**
 * constructor for customer class, passes the customer name and ID through to 
 * make the Customer
 * @param customerName
 * @param customerID 
 */
    public Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    
    
}
