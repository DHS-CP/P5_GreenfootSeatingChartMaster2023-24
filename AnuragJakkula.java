import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // import the ArrayList class

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class AnuragJakkula extends Student implements SpecialInterestOrHobby
{

    /**
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
    public AnuragJakkula(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".mp3";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public AnuragJakkula() {
        firstName="Anurag";
        lastName="Jakkula";
        mySeatX=4;
        mySeatY=4;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".mp3";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    
    public class StudentLeader implements StudentLeadership {
    @Override
    public void myRoleInLeadership() {
        System.out.println("I am a Communications VP in NHS.");
    }
}
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
            
                myHobby("I like to swim and play the piano!!");
                StudentLeader studentLeader = new StudentLeader();
                studentLeader.myRoleInLeadership();
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
                setRotation(0);
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
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    

     // Create an ArrayList object
            public ArrayList<String> Hobbyfiles = new ArrayList<String>();

    
    public void circleClass(){
        Hobbyfiles.add("piano.png");
        Hobbyfiles.add("swimming.jpg");
        Hobbyfiles.add("anuragjakkula-standing.jpg");
        int angle = 0;
        for (String hobby: Hobbyfiles){
        setImage(hobby);
        setLocation(10,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=8;i++){
            setLocation(i,0);
            if (i % 2 == 0){
                 angle+=45;
                setRotation(angle);
            }
            
            else{
                 angle+=45;
                setRotation(angle);
            }
            Greenfoot.delay(5);
        }
        // move back
        for (int i=1;i<=15;i++){
            setLocation(9,i);
            if (i % 2 == 0){
                angle+=45;
                setRotation(angle);
            }
            
            else{
                angle+=45;
                setRotation(angle);            }
            Greenfoot.delay(5);
        }      
         // move left
        for (int i=8;i>=0;i--){
            setLocation(i,5);
            if (i % 2 == 0){
                angle+=45;
                setRotation(angle);
            }
            
            else{
                 angle+=45;
                setRotation(angle);            }
            Greenfoot.delay(5);
        }      
              // move Forward
        for (int i=8;i>=0;i--){
            setLocation(0,i);
            if (i % 2 == 0){
                angle+=45;
                setRotation(angle);            }
            
            else{
                angle+=45;
                setRotation(angle);            }
            Greenfoot.delay(5);
        }  }
        GreenfootImage image = new GreenfootImage(400, 100);        
        // Set the font size and color
        Font font = new Font("Arial", 24);
        image.setFont(font);
        image.setColor(Color.BLACK);
        image.drawString("I'm Anurag!!!", 50, 50);
        setImage(image);
        

        
       setLocation(10,0);
         Greenfoot.delay(2);
        // move right
        for (int i=1;i<=8;i++){
            setLocation(i,0);
            if (i % 2 == 0){
                 angle+=45;
                setRotation(angle);
            }
            
            else{
                 angle+=45;
                setRotation(angle);
            }
            Greenfoot.delay(5);
        }
        // move back
        for (int i=1;i<=15;i++){
            setLocation(9,i);
            if (i % 2 == 0){
                 angle+=45;
                setRotation(angle);
            }
            
            else{
                 angle+=45;
                setRotation(angle);            }
            Greenfoot.delay(5);
        }      
         // move left
        for (int i=8;i>=0;i--){
            setLocation(i,5);
            if (i % 2 == 0){
                 angle+=45;
                setRotation(angle);
            }
            
            else{
                 angle+=45;
                setRotation(angle);            }
            Greenfoot.delay(5);
        }      
              // move Forward
        for (int i=8;i>=0;i--){
            setLocation(0,i);
            if (i % 2 == 0){
                 angle+=45;
                setRotation(angle);            }
            
            else{
                 angle+=45;
                setRotation(angle);            }
            Greenfoot.delay(5);
        } 
        // Draw the text

        
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}
}