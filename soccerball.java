import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class soccerball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class soccerball extends Actor
{
    /**
     * Act - do whatever the soccerball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*
    public string portraitFile;
    public string soccerName = "soccerball"; 
    portraitFile=soccerName.toLowerCase()+".jpg";
    setImage(portraitFile);
    */
    public void act()
    {
        for (int i=10; i > 0; i--) {
            setLocation(i, 1+i);
            Greenfoot.delay(10);
        }
    }
}
