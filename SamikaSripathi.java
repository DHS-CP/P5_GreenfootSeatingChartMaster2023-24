import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SamikaSripathi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SamikaSripathi extends Student implements SpecialInterestOrHobby
    {
    public SamikaSripathi(String fn, String ln, int r, int s){
        firstName=fn;
        lastName=ln;
        mySeatX=r;
        mySeatY=s;
        portraitFile=fn.toLowerCase()+ln.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        //standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=fn.toLowerCase()+ln.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    public SamikaSripathi() {
        firstName="Samika";
        lastName="Sripathi";
        mySeatX=6;
        mySeatY=6;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        //standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        //setImage(portraitFile);
        sitting=true;
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                sayName(soundFile);
                //setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                //sayName(soundFile);
            
                myHobby("I like to paint and draw! I also play golf!");
                MovementClass();
           
                //sitDown();
            }
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void myHobby(String s) {
         System.out.println(s); 
    }
    public void MovementClass(){
        int angle = 0;
        for (int i=1; i<17; i++){
            setRotation(angle = angle + 90);
            Greenfoot.delay(10);
        }
        
        setLocation(0,0);
        Greenfoot.delay(10);
        // Code to circle around the class
        // move right
        
        for (int i=2;i<=12;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        // move forward
        for (int i=2;i<=8;i++){
            setLocation(12,i);
            Greenfoot.delay(10);
        }      
         // move left
        for (int i=12;i>=0;i--){
            setLocation(i,12);
            Greenfoot.delay(10);
        }      
              // move Forward
        for (int i=8;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(10);
        }   
        Greenfoot.delay(20);
        setLocation(0,0);
        returnToSeat();
        
        // Wave over first set of tables
        int x = 3;
        int y = 4;
        
        for (int n = 1; n<=4; n++){
            for (int i=1;i<=2;i++){
                setLocation(x,y);
                setLocation(x,y+i);
                Greenfoot.delay(10);
                setLocation(x,y);
                setLocation(x=x+1, y);

            }
        }
        // Wave over second set of tables
        
        int m = 3;
        int b = 6;
        for (int n = 1; n<=4; n++){
            for (int i=1;i<=2;i++){
                setLocation(m,b);
                setLocation(m,b+i);
                Greenfoot.delay(10);
                setLocation(m,b);
                setLocation(m++, y);

            }
        }
        
        
        // Brings back to seat
        for (int i=6;i>=3;i--){
            setLocation(i,4);
            Greenfoot.delay(10);
        }  
        
        
        }

    }

