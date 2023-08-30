import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The MohitVarikuti class can be used as a model for your own class that represents you and your seating location in AP CSA
 *
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class MohitVarikuti extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the MohitVarikuti class.
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
    public MohitVarikuti(String f, String l, int r, int s) {
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
    public MohitVarikuti() {
        firstName="Mohit";
        lastName="Varikuti";
        mySeatX=1;
        mySeatY=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }

     /**
     * Act - do whatever the MohitVarikuti actor wants to do. This method is called whenever
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

                myHobby("I like to time travel!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat

                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.

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
     * This is a local method specific to the MohitVarikuti class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        int delayTime = 10;

        // Move to the start position
        setLocation(5, 0);
        Greenfoot.delay(delayTime);

        // Trace out a star pattern
        int[][] starCoords = {
            {9, 3}, // Top right corner
            {1, 9}, // Bottom left corner
            {1, 1}, // Top left corner
            {9, 9}, // Bottom right corner
            {5, 0}  // Back to the start
        };

        for (int[] coord : starCoords) {
            int x = coord[0];
            int y = coord[1];
            setLocation(x, y);
            Greenfoot.delay(delayTime);
        }

        Greenfoot.delay(20);

        myHobby("I love tracing stars!"); // A fun message in the middle of the animation
        returnToSeat();
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
