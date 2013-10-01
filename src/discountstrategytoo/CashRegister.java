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
    
    private Receipt receipt;
    
    public void startNewTransaction(int customerID, int productID){
        receipt = new Receipt(customerID, productID);
    }
    
    public void printReceipt(){
        System.out.println(receipt.getReceipt());
    }
}