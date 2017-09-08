/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

//import static petstore.Gender.FEMALE;
//import static petstore.Gender.MALE;

import static petstore.Gender.*; 

/**
 *
 * @author Professor Wergeles
 */
public class PetStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        Cat cat = new Cat("Susan", 2, FEMALE); 
        
        Pet pet3 = cat; 
        
        Cat cat2 = (Cat) pet3; 
        
        if(pet3 instanceof Cat){
            Cat cat3 = (Cat) pet3; 
        }
        
        cat.meow();
        
        System.out.println("Break"); 
        
        cat.meow(3);   
    }   
}