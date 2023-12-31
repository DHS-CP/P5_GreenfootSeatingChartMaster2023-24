import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class NikhilPrabhu extends Student implements SpecialInterestOrHobby
{

    /**
     * Hello world
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public NikhilPrabhu(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;

        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Mak
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public NikhilPrabhu() {
        firstName="Nikhil";
        lastName="Prabhu";
        mySeatX=1;
        mySeatY=1;
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        GreenfootImage portraitFile = new GreenfootImage(firstName.toLowerCase()+ lastName.toLowerCase()+".png");
        
        portraitFile.scale(portraitFile.getWidth()/70, portraitFile.getHeight()/70);
        setImage(portraitFile);

        sitting=true;
    }
    
     /**
     whenever Nikhil is clicked he moves around
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
  
                sitting=false;
                standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.png";
                GreenfootImage standing = new GreenfootImage(standingFile);
                standing.scale(standing.getWidth()/50, standing.getHeight()/50);
                setImage(standing);
                System.out.println(""); 
                getName();
                sayName(soundFile);
            
                myHobby("My favorite sport to watch is football");
            
                nikhilMove();  //my special method 
       
           
                returnToSeat();
            }
        if (Greenfoot.isKeyDown("D")){
            jump();
        }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("I'm " + firstName + " " + lastName);
    }
 

   
    
    public void nikhilMove(){
        Greenfoot.delay(1);
        int currentX = 5; 
        int currentY = 3;
        int rotationAngle = 0;
        
        GreenfootImage portraitFile = new GreenfootImage(firstName.toLowerCase()+ lastName.toLowerCase()+".png");
        
    

        
        // right side
        for (int i=1;i<=4; i++){            
            rotationAngle += 30; 
            setRotation(rotationAngle);
            currentX += 2;
            currentY += 1;
            setLocation(currentX,currentY);
            Greenfoot.delay(8);
        }
        
        //down
        for (int i=1;i<=2;i++){
            rotationAngle += 30; 
            setRotation(rotationAngle);
            currentX -= 2;
            currentY += 2;
            setLocation(currentX,currentY);
            Greenfoot.delay(8);
        }      
         
        
              // left side
        for (int i=1;i<=5;i++){
            rotationAngle += 30; 
            setRotation(rotationAngle);
            currentX -= 2;
            currentY -= 2;
            setLocation(currentX,currentY);
            Greenfoot.delay(8);            
            
        }   
        //left corner side
         for (int i=1;i<=1;i++){
            rotationAngle += 30; 
            setRotation(rotationAngle);
            currentX += 2;
            currentY -= 2;
            setLocation(currentX,currentY);
            Greenfoot.delay(8);            
            
        }   
        
        //right corner
         for (int i=1;i<=6;i++){
            rotationAngle += 30; 
            setRotation(rotationAngle);
            currentX += 2;
            currentY += 2;
            setLocation(currentX,currentY);
            Greenfoot.delay(8);            
            
        }   
           Greenfoot.delay(8);
           portraitFile.scale(portraitFile.getWidth()/70, portraitFile.getHeight()/70);
            rotationAngle += 180; 
            setRotation(rotationAngle);

           setImage(portraitFile);

           
            returnToSeat();
    }
    
     public void myHobby(String s) {
         System.out.println(s);
}

}
