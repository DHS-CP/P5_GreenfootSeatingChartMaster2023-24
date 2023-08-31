import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BobKaehms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MrKaehms extends Teacher //implements JustForFun
{
    

   
    
    public MrKaehms () {

    setLocation(mySeat,myRow);
 
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
         //   getName(); 
              sayName("bobkaehms.wav");
        }
    } 
    public void getName(){
        System.out.println("\n My name is Bob Kaehms");
    }
}
