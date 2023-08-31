    import java.time.format.DateTimeFormatter;  
    import java.time.LocalDateTime;   
 
public class DateFormatter  {

      public static String makeDate() {    
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd--HH-mm-ss");  
       LocalDateTime now = LocalDateTime.now();  
       return dtf.format(now);  
      }    
}    

