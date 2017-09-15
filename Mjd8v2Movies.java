/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjd8v2movies;


/**
 *
 * @author Michael
 */
public class Mjd8v2Movies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movies movie1 = new Movies("Spider Man: Homecoming", "Jon Watts");
        movie1.setSummary("Peter Parker tries to balance his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and must confront a new menace prowling the skies of New York City.");
        movie1.setRating((float) 7.9);
        
        Movies movie2 = new Movies("Star Wars: The Force Awakens", "J.J Abrams", "Three decades after the Empire's defeat, a new threat arises in the militant First Order. Stormtrooper defector Finn and spare parts scavenger Rey are caught up in the Resistance's search for the missing Luke Skywalker.");
        
        System.out.println("Movie 1:");
        movie1.print();
        System.out.println();
        System.out.println("Movie 2:");
        movie2.print();
    }
    
}
