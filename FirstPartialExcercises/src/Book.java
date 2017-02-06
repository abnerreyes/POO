/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class Book {
    private String name;
    private author[] authors;
    private double price;
    private int qty;
    //Initialize atributes
    public Book(String name, author[] author, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, author[] author, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName(){
            return this.name;
    }
    public author[] getAuthors(){
            return this.authors;
    }
    public double getPrice(){
         return this.price;
    }
    public void setPrice(double price){
            this.price = price;
    }
    public int getQty(){
            return this.qty;
    }
    public void setQty(int qty){
            this.qty = qty;
    }
    @Override
    public String toString(){ 
        
        return "Book[name = " + this.name + ",Authors = {" + getAuthorNames() + ", Price = " + this.price 
                + ",qty = " + this.qty + "]";
    }
    public String getAuthorNames(){ 
        
        String an = "";
        for(int i=0;i<authors.length;i++){
        an += authors[i].toString() + ",";
        }
        return "Author names=" + an;
    }
}

