import java.util.*;
import greenfoot.*;
//import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
//import java.util.List;
//import java.util.Arrays;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Classroom here.
 * 
 * @author Mr. Kaehms 
 * @version 2.0  Note: updated for new desk layout. Goal is to make setting seats easy
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(14, 14, 60); 

        prepare();
    }

    /**
     * Prepare the classroom desk layout.  This method should not be chanaged!. Refactored from prepare method.
     */

    private void createDeskLayout(){
        StudentDesk studentdesk = new StudentDesk();
        addObject(studentdesk,2,3);
        StudentDesk studentdesk2 = new StudentDesk();
        addObject(studentdesk2,3,3);
        StudentDesk studentdesk3 = new StudentDesk();
        addObject(studentdesk3,2,4);
        StudentDesk studentdesk4 = new StudentDesk();
        addObject(studentdesk4,3,4);
        StudentDesk studentdesk5 = new StudentDesk();
        addObject(studentdesk5,2,6);
        StudentDesk studentdesk6 = new StudentDesk();
        addObject(studentdesk6,3,6);
        StudentDesk studentdesk7 = new StudentDesk();
        addObject(studentdesk7,2,7);
        StudentDesk studentdesk8 = new StudentDesk();
        addObject(studentdesk8,3,7);
        StudentDesk studentdesk9 = new StudentDesk();
        addObject(studentdesk9,5,3);
        StudentDesk studentdesk10 = new StudentDesk();
        addObject(studentdesk10,6,3);
        StudentDesk studentdesk11 = new StudentDesk();
        addObject(studentdesk11,5,4);
        StudentDesk studentdesk12 = new StudentDesk();
        addObject(studentdesk12,6,4);
        StudentDesk studentdesk13 = new StudentDesk();
        addObject(studentdesk13,5,6);
        StudentDesk studentdesk14 = new StudentDesk();
        addObject(studentdesk14,6,6);
        StudentDesk studentdesk15 = new StudentDesk();
        addObject(studentdesk15,5,7);
        StudentDesk studentdesk16 = new StudentDesk();
        addObject(studentdesk16,6,7);
        StudentDesk studentdesk17 = new StudentDesk();
        addObject(studentdesk17,8,3);
        StudentDesk studentdesk18 = new StudentDesk();
        addObject(studentdesk18,9,3);
        StudentDesk studentdesk19 = new StudentDesk();
        addObject(studentdesk19,8,4);
        StudentDesk studentdesk20 = new StudentDesk();
        addObject(studentdesk20,9,4);
        StudentDesk studentdesk21 = new StudentDesk();
        addObject(studentdesk21,8,6);
        StudentDesk studentdesk22 = new StudentDesk();
        addObject(studentdesk22,9,6);
        StudentDesk studentdesk23 = new StudentDesk();
        addObject(studentdesk23,8,7);
        StudentDesk studentdesk24 = new StudentDesk();
        addObject(studentdesk24,9,7);
        StudentDesk studentdesk25 = new StudentDesk();
        addObject(studentdesk25,8,9);
        StudentDesk studentdesk26 = new StudentDesk();
        addObject(studentdesk26,9,9);
        StudentDesk studentdesk27 = new StudentDesk();
        addObject(studentdesk27,8,10);
        StudentDesk studentdesk28 = new StudentDesk();
        addObject(studentdesk28,9,10);
        StudentDesk studentdesk29 = new StudentDesk();
        addObject(studentdesk29,5,9);
        StudentDesk studentdesk30 = new StudentDesk();
        addObject(studentdesk30,6,9);
        StudentDesk studentdesk31 = new StudentDesk();
        addObject(studentdesk31,5,10);
        StudentDesk studentdesk32 = new StudentDesk();
        addObject(studentdesk32,6,10);
        TeacherDesk teacherdesk = new TeacherDesk();
        addObject(teacherdesk,2,10);
        studentdesk31.setDeskGroup(1);
        studentdesk29.setDeskGroup(1);
        studentdesk30.setDeskGroup(1);
        studentdesk32.setDeskGroup(1);
        studentdesk25.setDeskGroup(2);
        studentdesk27.setDeskGroup(2);
        studentdesk26.setDeskGroup(2);
        studentdesk28.setDeskGroup(2);
        studentdesk21.setDeskGroup(3);
        studentdesk23.setDeskGroup(3);
        studentdesk22.setDeskGroup(3);
        studentdesk13.setDeskGroup(4);
        studentdesk15.setDeskGroup(4);
        studentdesk14.setDeskGroup(4);
        studentdesk16.setDeskGroup(4);
        studentdesk6.setDeskGroup(5);
        studentdesk8.setDeskGroup(5);
        studentdesk5.setDeskGroup(5);
        studentdesk7.setDeskGroup(5);
        studentdesk.setDeskGroup(6);
        studentdesk3.setDeskGroup(6);
        studentdesk4.setDeskGroup(6);
        studentdesk2.setDeskGroup(6);
        studentdesk9.setDeskGroup(7);
        studentdesk11.setDeskGroup(7);
        studentdesk10.setDeskGroup(7);
        studentdesk12.setDeskGroup(7);
        studentdesk17.setDeskGroup(8);
        studentdesk19.setDeskGroup(8);
        studentdesk18.setDeskGroup(8);
        studentdesk20.setDeskGroup(8);
    }
   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    public void prepare()
    {
        createDeskLayout();

        
        KevinTend kevintend = new KevinTend();
        addObject(kevintend, 3, 7);
        kevintend.assignSeat();
        
 // Each student needs to create their specific instance following the KilgoreTrout example.
 // Your current seatX and seatY can be found by right clicking on the corresponding seat in the Classrom.
 // and then clicking on the inspect text

        
        AyushBatghare ayushb = new AyushBatghare();
        addObject(ayushb,9,9);
        ayushb.assignSeat();


        KrishnaEduri krishnaeduri = new KrishnaEduri();
        addObject(krishnaeduri,8,9);
        krishnaeduri.assignSeat();


        
        JonathanAdrian jonathanadrian = new JonathanAdrian();
        addObject(jonathanadrian, 9, 3);
        jonathanadrian.assignSeat();

        HimanshuManchandia himanshumanchandia = new HimanshuManchandia();
        addObject(himanshumanchandia,6,9);
        himanshumanchandia.assignSeat();


        ArunachalamKasi ak = new ArunachalamKasi();
        addObject(ak,6,6);
        ak.assignSeat();

        PrajwalDacharla prajwaldacharla = new PrajwalDacharla();
        addObject(prajwaldacharla,8,4);
        prajwaldacharla.assignSeat();
     

        SiddhiAnanya siddhiananya = new SiddhiAnanya();
        addObject(siddhiananya,9,4);
        siddhiananya.assignSeat();

        JasmineSabharwal jasminesabharwal = new JasmineSabharwal();
        addObject(jasminesabharwal,6,7);
        jasminesabharwal.assignSeat();
        

        EricXiao ericxiao = new EricXiao();
        addObject(ericxiao, 2, 4);
        ericxiao.assignSeat();
        
        DheeshikRamachandran dheeshikRamachandran = new DheeshikRamachandran();
        addObject(dheeshikRamachandran,5,4);
        dheeshikRamachandran.assignSeat();

        SidhantMathur sidhantmathur = new SidhantMathur();
        addObject(sidhantmathur, 6, 10);
        sidhantmathur.assignSeat();
  

        AkshitMakkar akshitmakkar = new AkshitMakkar();
        addObject(akshitmakkar,5,6);
        akshitmakkar.assignSeat();
       
       
        AnuragJakkula anuragjakkula = new AnuragJakkula();
        addObject(anuragjakkula, 6,4);
        anuragjakkula.assignSeat();

        RyanSaleh ryansaleh = new RyanSaleh();
        addObject(ryansaleh, 5, 7);
        ryansaleh.assignSeat();
        
        AdityaDas adityadas = new AdityaDas();
        addObject(adityadas, 8, 6);
        adityadas.assignSeat();


        NikhilPrabhu nikhilprabhu = new NikhilPrabhu();
        addObject(nikhilprabhu,5,3);
        nikhilprabhu.assignSeat();
        
        
        DanielYawar danielyawar = new DanielYawar();
        addObject(danielyawar,2,6);
        danielyawar.assignSeat();


        ShivaniSridhar shivanisridhar = new ShivaniSridhar();
        addObject(shivanisridhar,3,3);
        shivanisridhar.assignSeat();
        

        
        VakshithHemanth vakshithhemanth = new VakshithHemanth();
        addObject(vakshithhemanth, 6,3);
        vakshithhemanth.assignSeat();

        
        AidanSpies aidanspies = new AidanSpies();
        addObject(aidanspies, 5, 10);
        aidanspies.assignSeat();

        //KilgoreTrout kilgoretrout = new KilgoreTrout();
        //addObject(kilgoretrout,2,3);
        //kilgoretrout.assignSeat();
        
        VishnuD vishnud = new VishnuD();
        addObject(vishnud,8,7);
        vishnud.assignSeat();

        AlessandraYu alessandrayu = new AlessandraYu();
        addObject(alessandrayu,2,7);
        alessandrayu.assignSeat();


        RamanArora ramanarora = new RamanArora();
        addObject(ramanarora,9,7);
        ramanarora.assignSeat();
        
        
        TharunSelvakumar tharunselvakumar = new TharunSelvakumar();
        addObject(tharunselvakumar,5,9);
        tharunselvakumar.assignSeat();

        HariniSuresh harinisuresh = new HariniSuresh();
        addObject(harinisuresh,3,6);
        harinisuresh.assignSeat();

        
        MohitVarikuti mohitvarikuti = new MohitVarikuti();
        addObject(mohitvarikuti, 2, 3);
        mohitvarikuti.assignSeat();
        
                
        SamikaSripathi samikasripathi = new SamikaSripathi();
        addObject(samikasripathi,3,4);
        samikasripathi.assignSeat();
        
        ChandiniChennakesavan chandinichennakesavan = new ChandiniChennakesavan();
        addObject(chandinichennakesavan,9,10);
        chandinichennakesavan.assignSeat();
        
        AniszewskiSky aniszewskisky = new AniszewskiSky();
        addObject(aniszewskisky,9,6);
        aniszewskisky.assignSeat();
        
        SuriyaGnanasundar suriyagnanasundar = new SuriyaGnanasundar();
        addObject(suriyagnanasundar,8,10);
        suriyagnanasundar.assignSeat();
        
        PhillipChu phillipchu = new PhillipChu();
        addObject(phillipchu,8,3);
        phillipchu.assignSeat();


    }
    
    public List<Student> getAllStudents(){
       List<Student> s = getObjects(Student.class);  
       return s;
    }
    
  
    /**
     * gets a list of all students, and creates a new file that can be cut/pasted in as a prepare statement.
     * 
     */
    public void createNewSeatingChart(){
        boolean lastWrite;
        String timestamp=DateFormatter.makeDate();
      
        String newChartFile="seatingchart-" + timestamp + ".txt";   
        
        List<Student> students = getObjects(Student.class); 
        
        for (Student s:students){
            String studentClassName=s.getFirstName()+s.getLastName(); 
            
            String studentInstanceVar=studentClassName.toLowerCase();
            String instantiate=studentClassName + " " + studentInstanceVar + " = new " + studentClassName + "(); \n";
            String placeStudent="addObject(" + studentInstanceVar + ","+ s.getX() + "," + s.getY()+"); \n";
            String assignSeat = studentInstanceVar + ".assignSeat();\n\n";
           
            appendFile(newChartFile,instantiate);
            appendFile(newChartFile,placeStudent);  
            appendFile(newChartFile,assignSeat);
            System.out.println(s);
            
        }
        Greenfoot.ask("Your file has been saved as: "+newChartFile+"     -Press [Enter] to continue.");
    
    }
    
 
    
    // modified from https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/
    

   public  void appendFile(String fname, String s){
   {    
      try{
         
        //Specify the file name and path here
        File file =new File(fname);

        /* This logic is to create the file if the
         * file is not already present
         */
        if(!file.exists()){
           file.createNewFile();
        }

        //Here true is to append the content to file
        FileWriter fw = new FileWriter(file,true);
        //BufferedWriter writer give better performance
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        //Closing BufferedWriter Stream
        bw.close();

    System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
         ioe.printStackTrace();
       }
   }
}
}
