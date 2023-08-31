import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.lang.Math;
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
    /** Description of myMethod(int a, String b)
    * ...brief description ....
    * 
    * @author Dheeshik Ramachandran
    * @author Vakshith Hemanth
    * @author Anurag Jakkula
    * @author Nikhil Prabu
    * @version 1.0 Build 1 Aug 30, 2023.
    *
    *
    */
    public void jump(){
        int originalWidth = getImage().getWidth();
        int originalHeight = getImage().getHeight();
        for (int i = 1; i <= 10; i++){
            if (i != 1){
                getImage().scale((int)(originalWidth * i), (int)(originalHeight * i));
            }
            turn((int)(i * 0.5));
            Greenfoot.delay(1);;
        }
        for (int i = 10; i > 1; i--){
            if (i != 1){
                getImage().scale((int)(originalWidth * i), (int)(originalHeight * i));
            }
            turn((int)(i * 0.5));
            Greenfoot.delay(1);
        }
        getImage().scale(originalWidth, originalHeight);
        setRotation(0);
        returnToSeat();
    }
    
}
