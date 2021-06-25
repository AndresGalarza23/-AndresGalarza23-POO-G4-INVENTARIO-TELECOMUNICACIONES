
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import futuretheonaccent.inventory.model.Product;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */

public class SystemInventory{
    
     public static void main(String[] args) throws IOException {
        SystemInventory bus =  new SystemInventory();
       
        Scanner enter = new Scanner(System.in);
        
        boolean out = false;
        int option;
         
        
        while(!out){  
                        
            System.out.println("Wellcome To Inventory\n");
            
            
         
            System.out.println("1. Producto Information Json");
            System.out.println("2. Product Information and Search");
            System.out.println("3. Exit");
            
            try{
            
            
            System.out.println("Enter Opcion to Use");
            option = enter.nextInt();
            
            switch (option){
               
                
        case 1:
           
            bus.searchAndEnter();
            
        break;    
            
        case 2:
            bus.searchJson();
            break;
            
        case 3:
        
             out = true;    
                    break;
                default:
                    System.out.println("Select Valid Opion ");
          }
        
            }catch (InputMismatchException e){
                System.out.println("Enter Number");
                enter.next();
            }
        }
    }
    public static void searchAndEnter() throws IOException{
            
            
               String productName;
               float price;
               int amount;
               int id;
               String brand;
                              
               
               
               List<Product> productList = new ArrayList<Product>();
                               
        FileWriter file = new FileWriter("./files/TelecommunicationsInventory.json");
              
             
                 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Product 1 Information:");
        Product product1 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 2 Information:");
        //Product product2 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product3 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 4 Information:");
        //Product product4 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 5 Information:");
        //Product product5 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 6 Information:");
        //Product product6 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 7 Information:");
        //Product product7 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 8 Information:");
        //Product product8 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 9 Information:");
        //Product product9 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 10 Information:");
        //Product product10 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
       
        
        productList.add(product1);
        //productList.add(product2);
        //productList.add(product3);   
        //productList.add(product4);
        //productList.add(product5);
        //productList.add(product6);
        //productList.add(product7);
        //productList.add(product8);
        //productList.add(product9);
        //productList.add(product10);      
      
            System.out.println("product object product ->" + product1);
           // System.out.println("product object product ->" + product2);
            //System.out.println("product object product ->" + product3);
            //System.out.println("product object product ->" + product4);
            //System.out.println("product object product ->" + product5);
            //System.out.println("product object product ->" + product6);
            //System.out.println("product object product ->" + product7);
            //System.out.println("product object product ->" + product8);
            //System.out.println("product object product ->" + product9);
            //System.out.println("product object product ->" + product10);
        
    }   
        
        public static void searchJson() throws IOException{
        
                   String productName;
               float price;
               int amount;
               int id;
               String brand;
               String jsonProduct1 = "";
               String jsonProduct2 = "";
               String jsonProduct3 = "";
               String jsonProduct4 = "";
               String jsonProduct5 = "";
               String jsonProduct6 = "";
               String jsonProduct7 = "";
               String jsonProduct8 = "";
               String jsonProduct9 = "";
               String jsonProduct10 = "";
               
               
               
               List<Product> productList = new ArrayList<Product>();
                               
        FileWriter file = new FileWriter("./files/TelecommunicationsInventory.json");
              
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Product 1 Information:");
        Product product1 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 2 Information:");
        //Product product2 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product3 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product4 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product5 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product6 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product7 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product8 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product9 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
        //Product product10 = new Product(productName=sc.next(), price=sc.nextFloat(), amount=sc.nextInt(), brand=sc.next(), id=sc.nextInt());
        //System.out.println("Enter Product 3 Information:");
            
        }  
        
    }
