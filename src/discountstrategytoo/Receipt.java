/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class Receipt {
        
    private Customer customer;
    private FakeDatabase fd;
    
    public Receipt(int customerID) {
        this.fd = new FakeDatabase();
        customer = findCustomerByID(customerID);
    }
    
    public Customer findCustomerByID(int customerID){
        customer = fd.getCustomerByID(customerID);
                return customer;
    }
    
    public String getReceipt(){
        String receiptData = customer.getCustomerName() + "\n";
        receiptData += product.getProductName();
        return receiptData;
    }
}
