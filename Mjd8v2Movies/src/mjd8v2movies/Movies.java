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
public class Movies {
    
    private String name;
    private String director;
    private String summary;
    private float rating;
    private int version;
    
    public Movies(String name, String director)  // construtor 1
    {
        this.name = name;
        this.director = director;
        this.version = 0;
    }
    
    public Movies(String name, String director, String summary) // constructor 2 
    {
        this.name = name;
        this.director = director;
        this.version = 1;
        this.summary = summary;
    }

    public void setName(String input)
    {
        this.name = input;
        this.version += 1;
    }
    public void setDirector(String input)
    {
        this.director = input;
    }
    public void setSummary(String input)
    {
        this.summary = input;
        this.version += 1;
    }
    public void setRating(float input)
    {
       
        this.rating = input;
        this.version += 1;
    }
    public float getRating()
    {    
        return rating;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDirector()
    {
        return this.director;
    }
    public String getSummary()
    {
        return this.summary;
    }
    public float getVersion()
    {
        return this.version;
    }
    public void print()
    {
        System.out.println("name: " + getName());
        System.out.println("director: " + getDirector());
        System.out.println("summary: " + getSummary());
        System.out.println("rating: " + getRating());
        System.out.println("version: " + getVersion());  
    }
    
}
