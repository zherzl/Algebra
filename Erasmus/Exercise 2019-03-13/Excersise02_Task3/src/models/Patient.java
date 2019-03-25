
package models;


public class Patient extends Person {
    public static int years = 1;
    
    
    public Patient() {
        
    }
    
    
    
    public int numberOfVisits;
    
    public void increaseNumberOfVisits() {
        numberOfVisits++;
    }
}
