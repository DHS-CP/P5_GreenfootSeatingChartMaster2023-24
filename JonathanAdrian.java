import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JonathanAdrian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JonathanAdrian extends Student
{
    public JonathanAdrian(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".png";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    public JonathanAdrian() {
        firstName="Jonathan";
        lastName="Adrian";
        mySeatX=6;
        mySeatY=1;

        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        
        sitting=true;
        
    }    

    /**
     * Act - do whatever the JonathanAdrian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to play ice hockey!");
                Greenfoot.delay(10);

                funAnimation();
               
           
                sitDown();
            }
        }
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
     public void myHobby(String s) {
         System.out.println(s);
    }
    public void funAnimation(){
        int startX = 1;
        int startY = 5;
        int rotation = 0;
        for(int i = 0; i < 10; i++){
            setLocation(startX, startY);
            startX++;
            Greenfoot.delay(8);
        }
        for(int i = 0; i < 3; i++){
            startY++;
            setLocation(startX, startY);
            Greenfoot.delay(8);
        }
        for(int i = 0; i < 4; i++){
            setLocation(startX, startY);
            startX--;
            Greenfoot.delay(8);
        }
        for(int i = 0; i< 3; i++){
            startY++;
            setLocation(startX, startY);
            Greenfoot.delay(8);
        }
        for(int i = 0; i < 7; i++){
            startX--;
            setLocation(startX, startY);
            Greenfoot.delay(8);
        }
        for(int i = 0; i < 13; i++){
            startY--;
            setLocation(startX, startY);
            Greenfoot.delay(4);
            
        }
        
        setImage("jonathanadrian-shooting.png");
        
        Greenfoot.delay(17);
        
        setImage("jonathanadrian-celebration.png");
        setLocation(6,6);
        for(int i = 0; i < 16; i++){
            startX = 6;
            startY = 6;
            
            if(i%4 == 0){
                startX+=3;
                
            }
            if(i%4 == 1){
                startY += 3;
            }
            if(i%4 == 2){
                startX -=3;
            }
            if(i%4 == 3){
                startY -= 3;
            }
            setLocation(startX, startY);
            rotation += 45;
            setRotation(rotation);
            Greenfoot.delay(6);
        }
        setRotation(0);
        for(int i =0; i < 91; i++){
            setRotation(rotation);
            rotation += 4;
            Greenfoot.delay(1);
            
        }
        Greenfoot.delay(30);
        setImage("jonathanadrian-gaming.png");
        Greenfoot.delay(55);
        setImage("jonathanadrian-reading.png");
        Greenfoot.delay(55);
    }
}
