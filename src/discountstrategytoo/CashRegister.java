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

    public CashRegister() {
    }
    
    public void startNewTransaction(int customerID){
        receipt = new Receipt(customerID);
    }
    public void printReceipt(){
        System.out.println(receipt.getReceipt());
    }
}