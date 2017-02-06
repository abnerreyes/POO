/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class author {
    
    private String name;
    
    private String email;
    
    private char gender;
    
    public author(String email, String name, char gender){
        this.name = email;
        
        this.email = name;
        
        this.gender = gender;
    }
    
    public String getEmail(){
        
        return this.email;
    }
    public String getName() {
        
        return this.name;
    }

    public void setEmail(String email) {
        
        this.email = email;
    }
    public char getGender() {
        
        return this.gender;
    } 
    @Override
    public String toString() { 
        return "Author[" + "name = " + name + ", email = " + email + ", gender = " + gender + ']';
    }
}

