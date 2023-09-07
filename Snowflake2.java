import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowflake2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowflake2 extends Actor
{
    /**
     * Act - do whatever the Snowflake2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(100,100);
        setLocation(2,0);
        for (int i=0; i<10; i++) {
            setLocation(getX(), getY()+(i+1));
            Greenfoot.delay(10);
        }
    }
}
