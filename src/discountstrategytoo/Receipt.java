/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

import java.text.NumberFormat;

/**
 *
 * @author F03 H4MM3R
 */
public class Receipt {
        
    private Customer customer;
    private FakeDatabase fd;
    private LineItem[] lineItems = new LineItem[0];
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    public void addItem(int productID, int quantity){
        LineItem item = new LineItem(fd.getProductByID(productID), quantity);
        addToArray(item);
    }
    private void addToArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    private String getItemsFromArray(){
        String itemList = "";
        for (int i = 0; i < lineItems.length; i++){
            itemList += lineItems[i].getItemName() + " | " + lineItems[i].getQuantity() + "\n";
        }
        return itemList;
    }
    
    public Receipt(int customerID) {
        this.fd = new FakeDatabase();
        customer = findCustomerByID(customerID);
    }
    
    public Customer findCustomerByID(int customerID){
        customer = fd.getCustomerByID(customerID);
                return customer;
    }
    public double getTotalBeforeDiscount(){
        double grandTotal = 0;
        for(LineItem item : lineItems){
            grandTotal += item.getSubtotal();
        }
        return grandTotal;
    }
    public double getTotalAfterDiscount(){
        double grandTotal = 0;
        for(LineItem item : lineItems){
            grandTotal += item.getSubtotalAfterDiscount();
        }
        return grandTotal;
    }
    
    public String getReceipt(){
        String receiptData = customer.getCustomerName() + "\n";
        receiptData += getItemsFromArray();
        //get total before discount
        receiptData += nf.format(getTotalBeforeDiscount()) + "\n";
        //get total after discount
        receiptData += nf.format(getTotalAfterDiscount()) + "\n";
        //amount saved
        
        return receiptData;
    }
}
