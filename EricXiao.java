import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EricXiao extends Student implements SpecialInterestOrHobby
{


    public EricXiao(String firstName, String lastName, int mySeatX, int mySeatY) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mySeatX = mySeatX;
        this.mySeatY = mySeatY;
        portraitFile = firstName.toLowerCase() + lastName.toLowerCase() + ".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile = firstName.toLowerCase() + lastName.toLowerCase() + "-standing.jpg";
        soundFile = firstName.toLowerCase() + lastName.toLowerCase() + ".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public EricXiao() {
        firstName="Eric";
        lastName="Xiao";
        mySeatX=5;
        mySeatY=1;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the EricXiao actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
                sitting=false;
                setImage(standingFile);
                System.out.println("Hello, my name is Eric Xiao");
                getName();
                sayName(soundFile);
            
                myHobby("I like reading, and competition math/programming.");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back to your seat
                hop(1,-1);
                hop(-1,1);
                hop(1,-1);
                hop(1,1);
                hop(-1,-1);
                hop(-1,1);
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
     * This is a local method specific to the EricXiao class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void hop(int horizDir, int vertDir){
        int currentY = getY();
        for (int i=1;i<=10;i++){
            setLocation(getX()+horizDir,currentY + vertDir);
            Greenfoot.delay(2);
        }
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
