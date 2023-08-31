import greenfoot.*;

/**
 * Write a description of class Teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Teacher extends Actor
{
        //Instance variables
   public String firstName;
   public String lastName;
   public static final int myRow=5;         // rows start in the front of class (1), and end in the back of class
   public static final int mySeat=4;        // seats are left to right, 1-8
   
   public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
        
    }
    
    public void sitDown(){
        setLocation(mySeat,myRow);
    }
        
 
}
