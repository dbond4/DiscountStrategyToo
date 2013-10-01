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
    private double unitCost;

    public Product(String productName, int poductID, double unitCost) {
        this.productName = productName;
        this.poductID = poductID;
        this.unitCost = unitCost;
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

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    
}
