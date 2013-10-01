/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategytoo;

/**
 *
 * @author F03 H4MM3R
 */
public class Product {

    private String productName;
    private int poductID;

    public Product(String productName, int poductID) {
        this.productName = productName;
        this.poductID = poductID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPoductID() {
        return poductID;
    }

    public void setPoductID(int poductID) {
        this.poductID = poductID;
    }
    
    
}
