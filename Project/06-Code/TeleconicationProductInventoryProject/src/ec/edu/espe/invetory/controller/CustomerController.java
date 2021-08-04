/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.invetory.model.Customer;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class CustomerController {
      DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject(); 
    
    public CustomerController(){
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InventoryProduct");
            collection = DataBase.getCollection("Customer");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    
    public boolean add(Integer cedula, String names, String lastName, String address, Integer phone){
        ArrayList<Customer> customer = new ArrayList<>();
        customer.add(new Customer(cedula, names, lastName, address,phone));
        for (Customer pueC : customer){
            collection.insert(pueC.dbProductObjectInventory());
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
    }  
     public boolean delete(Integer cedula){
        document.put("Cedula",cedula);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
               
                
    }
}
