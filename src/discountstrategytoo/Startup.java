/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

import java.util.Date;

/**
 *
 * @author F03 H4MM3R
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        
        cr.startNewTransaction(001);
        cr.startItemScanning(100, 2);
        cr.startItemScanning(200, 3);
        cr.startItemScanning(300, 1);
        cr.printReceipt();
    }
}
