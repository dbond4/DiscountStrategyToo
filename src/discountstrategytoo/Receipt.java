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
    private LineItem[] lineItems = new LineItem[0];
    
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
    
    public String getReceipt(){
        String receiptData = customer.getCustomerName() + "\n";
        receiptData += getItemsFromArray();
        return receiptData;
    }
}
