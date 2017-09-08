/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjd8v2languagebasics;

/**
 *
 * @author Michael
 */
public class Mjd8v2LanguageBasics {

    public byte sample1 = 0x64;
    public byte sample2 = 100;
    public short heartRate = 85;
    public long balance = 135002766;
    public float acceleration = (float) 9.584;
    public float mass = (float) 14.6;
    public double distance = 129.763001;
    public boolean lost = true;
    public boolean expensive = true;
    public int month = 10;
    public int day = 5;
    public char integral = '\u222B';
    public char letter1 = 'a';
    public char letter2 = 97;
    public String greeting = "Hello";
    public String myPawprint = "mjd8v2";
    public float force = mass * acceleration;
    
    
    public static void main(String[] args) {
        Mjd8v2LanguageBasics test = new Mjd8v2LanguageBasics();
        if( test.sample1 == test.sample2)
        {
            System.out.println("The samples are equal");
        }
        else
        {
            System.out.println("The samples are not equal");
        }
        if( test.heartRate >= 40 || test.heartRate <= 80 )
        {
            System.out.println("Heart rate is normal.");
        }
        else
        {
            System.out.println("Heart rate is not normal");
        }
        if(test.balance >= 100000000)
        {
            System.out.println("I'm rich!");
        }
        else
        {
            System.out.println("I'm poor!");
        }
        System.out.println("force = " + test.force);
        System.out.println(test.distance + "is the distance");
        
        if( test.lost == true && test.expensive == true)
        {
            System.out.println("I am really sorry! I will get the manager");       
        }
        if(test.lost == true && test.expensive == false)
        {
            System.out.println("Here is a coupon for 10% off.");
        }
        
        switch(test.month)
        {
            case 1: System.out.println("The date is January " + test.day);
            break;
            
            case 2: System.out.println("The date is Febuary " + test.day);
            break;
            
            case 3: System.out.println("The date is March " + test.day);
            break;
            
            case 4: System.out.println("The date is April " + test.day);
            break;
            
            case 5: System.out.println("The date is May " + test.day);
            break;
            
            case 6: System.out.println("The date is June " + test.day);
            break;
            
            case 7: System.out.println("The date is July " + test.day);
            break;
            
            case 8: System.out.println("The date is August " + test.day);
            break;
            
            case 9: System.out.println("The date is September " + test.day);
            break;
            
            case 10: System.out.println("The date is October " + test.day);
            break;
            
            case 11: System.out.println("The date is November " + test.day);
            break;
            
            case 12: System.out.println("The date is December " + test.day);
            break;
            
            default: System.out.println("You have the wrong date");
            break;
        }
    }
    
    
}
