import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowflake1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowflake1 extends Actor
{
    /**
     * Act - do whatever the Snowflake1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(100,100);
        setLocation(6,0);
        
        for (int i=0; i<10; i++) {
            setLocation(getX(), getY()+i);
            Greenfoot.delay(10);
        }
    }
}
