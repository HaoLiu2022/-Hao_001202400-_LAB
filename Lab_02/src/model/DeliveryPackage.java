/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author haoliu
 */
public class DeliveryPackage {



    int packageId;
    double packageWeight;
    private ArrayList<Product> productList;
    Customer customer;
    
    public DeliveryPackage() {
        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
    }
    
    /**
     * @return the packageId
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * @param packageId the packageId to set
     */
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    /**
     * @return the packageWeight
     */
    public double getPackageWeight() {
        return packageWeight;
    }

    /**
     * @param packageWeight the packageWeight to set
     */
    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }


    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
        /**
     * @return the productList
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    
    public Product createProduct(int productId, String productName, double price) {
        Product product = new Product();
        
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        
        this.getProductList().add(product);
        
        return product;
    }
    
    public Product findProduct(int pid) {
        for(Product prod : this.getProductList()) {
            if (prod.getProductId() == pid) {
                return prod;
            }
        }
        return null;
    }
    
    
}
