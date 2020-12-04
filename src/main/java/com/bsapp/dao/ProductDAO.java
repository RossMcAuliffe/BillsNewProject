/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsapp.dao;

import java.util.ArrayList;
import model.Product;

/**
 *
 * @author be_me
 */
public class ProductDAO {
    
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public ArrayList<Product> getTopProducts(int numProducts){
        
        ArrayList<Product> prods = new ArrayList();
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Optimism");
        p1.setDescription("The Prelude to Dissapointment");
        p1.setPrice(4);
        p1.setImageLocation("optimism.jpg");
        prods.add(p1);
        
        Product p2 = new Product();
        p2.setId(1);
        p2.setName("Lazy");
        p2.setDescription("Just because you have to doesn't mean you need to");
        p2.setPrice(5);
        p2.setImageLocation("lazy.jpg");
        prods.add(p2);
        
        Product p3 = new Product();
        p3.setId(1);
        p3.setName("Unique");
        p3.setDescription("Just because you are unique doesn't make you useful");
        p3.setPrice(5);
        p3.setImageLocation("unique.jpg");
        prods.add(p3);
        
        Product p4 = new Product();
        p4.setId(1);
        p4.setName("Nepotism");
        p4.setDescription("It's not easy to soar like an eagle unless your parents were eagles");
        p4.setPrice(5);
        p4.setImageLocation("nepotism2.jpg");
        prods.add(p4);
        
        Product p5 = new Product();
        p5.setId(1);
        p5.setName("Overconfidence");
        p5.setDescription("This is going to end in disaster");
        p5.setPrice(17);
        p5.setImageLocation("overconfidence.jpg");
        prods.add(p5);
        
        Product p6 = new Product();
        p6.setId(1);
        p6.setName("Potential");
        p6.setDescription("Not Everybody gets to be an astronaut");
        p6.setPrice(17);
        p6.setImageLocation("potential.jpg");
        prods.add(p6);
        
        return prods;     
        
    }
    
}
