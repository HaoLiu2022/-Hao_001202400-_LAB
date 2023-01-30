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
public class ChangeValues {
    
    ArrayList<Product> productList;
    
    public Product change() {
        for (Product p : this.productList) {
            if (productList.indexOf(p) / 2 == 0 ) {
                p.setPrice(2 * p.getPrice());
                return p;
            } else {
                p.setPrice(3 * p.getPrice());
                return p;
            }
        }
        return null;
    }
    
}
