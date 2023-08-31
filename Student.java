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

    /** Description of jump()
    * Makes the members of the group jump/get larger, and spin.
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
    

    
 /**
 * Description of epicDanceMove()
 * The epicDanceMove method incorporates elements from both disco() and doABarrelRoll() methods
 * to create a unique dance move. The student object will zigzag, flash colors, and spin.
 *
 * @author Mohit, Eric, Shivani, Samika
 * @version 1.2z Build 9002 Aug 30, 2023.
 */
public void epicDanceMove() {
    for (int i = 0; i <= 5; i++) {
        int originalWidth = getImage().getWidth();
        int originalHeight = getImage().getHeight();
        
        // Start by doing the zigzag
        setLocation(this.getX() + 5, this.getY() + 5);
        Greenfoot.delay(3);
        setLocation(this.getX() - 5, this.getY() - 5);
        Greenfoot.delay(3);
        
        // Turn 30 degrees
        turn(30);
        Greenfoot.delay(5);
        // Resize the image to 1.5x its original dimensions
        getImage().scale((int)(originalWidth * 1.5), (int)(originalHeight * 1.5));
        Greenfoot.delay(5);
        
        // Turn -30 degrees
        turn(-30);
        Greenfoot.delay(5);

        // Restore the image to its original dimensions
        // Note: Removed the resetColor() line
        getImage().scale(originalWidth, originalHeight);
        Greenfoot.delay(5);
    }
}

    /** Description of disco()
 * The disco method makes the student do a dance where they shake, increase and decrease size, and change transparency
 * 
 * @author Aditya D
 * @author Raman A
 * @author Conrad A
 * @author Vishnu D
 * @version 1.0z Build 9000 Aug 30, 2023.
 */
    public void disco() {
        
        for (int i=0; i <=15; i++){
            int originalWidth = getImage().getWidth();
            int originalHeight = getImage().getHeight();
            setRotation(15);
            getImage().setTransparency(255);
            Greenfoot.delay(10);
            getImage().scale(originalWidth*2,originalWidth*2);
            Greenfoot.delay(10);
            getImage().scale(originalWidth,originalHeight);
            Greenfoot.delay(10);
            setRotation(-15);
            Greenfoot.delay(10);
            getImage().scale(originalWidth*2,originalWidth*2);
            Greenfoot.delay(10);
            getImage().scale(originalWidth,originalHeight);
            Greenfoot.delay(10);
            getImage().setTransparency(0);
            Greenfoot.delay(10);
        }
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
    
/*
     * cannonBall() "shoots" a student object diagonally across the seating chart multiple
     * times, rotating like a real cannonball projectile would.
     * Created by Akshit M, Arun, Ryan, Jasmine S
     */
    public void cannonBall(){
        for (int r = 0; r<=3; r++){
            for(int i = 0; i < 15; i++){
            setLocation(0, 0);
            turn(90);
            setLocation(i, i);
            Greenfoot.delay(5);
            }
        }
        
        
        

    }
 

}

