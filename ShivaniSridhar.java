import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ShivaniSridhar class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Shivani Sridhar
 * @version August 29, 2023
 */
public class ShivaniSridhar extends Student implements Athlete
{

    /**
     * Constructor for the ShivaniSridhar class.
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
    public ShivaniSridhar(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public ShivaniSridhar() {
       firstName="Shivani";
       lastName="Sridhar";
       mySeatX=1;
       mySeatY=2;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(portraitFile);
       sitting=true;
    }
    
     /**
     * Act - do whatever the ShivaniSridhar actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                mySport("They are tennis and basketball.", 2);
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                flipClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
           
                sitDown();
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */

   
    /**
     * This is a local method specific to the AidanSpies class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void flipClass(){
        setLocation (6,6);
        Greenfoot.delay(10);
            for (int i=0; i<12; i++) {
            turn(90);
            Greenfoot.delay(10);
        }
        setLocation(1,1);
        Greenfoot.delay(10);
            for(int i=0; i<13;i++){
                setLocation(getX()+1, getY());
                Greenfoot.delay(5);
            }
            for(int i=0; i<11;i++){
                setLocation(getX(), getY()+1);
                Greenfoot.delay(5);
            }
            for(int i=0; i<13;i++){
                setLocation(getX()-1, getY());
                Greenfoot.delay(5);
            }
            for(int i=0; i<11;i++){
                setLocation(getX(), getY()-1);
                Greenfoot.delay(5);
            }
        setLocation (6,6);
        Greenfoot.delay(10);
            for (int i=0; i<8; i++) {
            turn(90);
            Greenfoot.delay(10);
        }
        
        returnToSeat();
    }
    /**
     * myHobby is one of the interfaces provided.
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */ 
    /*StudentAthletes is one of the interfaces that we could choose to edit and 
     * implement as a table group. I edited it for my class.
     * 
     */
    public void mySport(String mySentence, int numberOfSports){
	System.out.println("I play " + numberOfSports + " sports. " + mySentence);
   }
}
