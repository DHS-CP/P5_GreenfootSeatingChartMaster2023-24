import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int mySeatX;         // rows start in the front of class (1), and end in the back of class
   public int mySeatY;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   public boolean sitting;   // Is the student sitting or standing (default sitting)                         
   
 //  public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+
   public String portraitFile; // image used when sitting
   public String standingFile; // image used when standing
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   Classroom clas = (Classroom) getWorld();
   public void setSeatX(int r){
       mySeatX=r;
    }
    
    public void setSeatY(int s){
       mySeatY=s;
    }
    
    public abstract void  getName(); //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
 
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    
    public int GetSeatX(){
        return mySeatX;
    }
    
    public int GetSeatY(){
        return mySeatY;
    }
    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
    
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void returnToSeat(){
        setLocation(mySeatX,mySeatY);
    }
    public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        sitting=true;
    }
    public void assignSeat(){
        mySeatX=getX();
        mySeatY=getY();
    }
    /*
     * doABarrelRoll() will cause a student object to do a barrel roll forwards and backwards. 
     * This can be used during the animation when a student is clicked on.  
     * Created by Tharun Selvakumar, Sid Mathur, Aidan Spies, and Himanshu M.
     */
    public void doABarrelRoll(){
        for(int i = 0; i < 8; i++){
            setLocation(this.getX() + 1, this.getY());
            //Greenfoot.delay(1);
            turn(45);
            Greenfoot.delay(7);
        }
        for(int i = 0; i < 8; i++){
            setLocation(this.getX() - 1, this.getY()); 
            //Greenfoot.delay(1);
            turn(-45);
            Greenfoot.delay(7);
        }
    }
    
    /** Description of twirlClass()
 * student twirls around the class, teleporting to each corner of the room and near the desks 
 * each time the student teleports, they turn slightly
 * student teleports in a circle in the center of the classroom slowly
 * after they are done twirling around, the student does one final spin and teleports back to their original seat
 * 
 * @author Harini Suresh
 * @author Alessandra Yu
 * @author Kevin Tend
 * @author Daniel Yawar

 * @version Aug 31, 2023.
 *
  */
    public void twirlClass(){
        
        setLocation(1, 2);
        Greenfoot.delay(15);
        
        setLocation(5, 2);
        Greenfoot.delay(15);
        
        setLocation(10, 2);
        Greenfoot.delay(15);
        
        setLocation(10, 6);
        Greenfoot.delay(15);
        
        setLocation(10, 11);
        Greenfoot.delay(15);
        
        setLocation(6, 11);
        Greenfoot.delay(15);
        
        setLocation(1, 11);
        Greenfoot.delay(15);
        
        setLocation(1, 7);
        Greenfoot.delay(15);

        
        turn(72);
        setLocation(7, 4);
        Greenfoot.delay(30);
        
        turn(72);
        setLocation(7, 7);
        Greenfoot.delay(30);
        
        turn(72);
        setLocation(5, 7);
        Greenfoot.delay(30);
        
        turn(72);
        setLocation(5, 4);
        Greenfoot.delay(30);
        
        turn(72);
        setLocation(7, 4);
        Greenfoot.delay(30);

        for (int i = 0; i < 18; i++) {
                turn(20);
                Greenfoot.delay(10);
        }
         
        returnToSeat();
}

    }

 

