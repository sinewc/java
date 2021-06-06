
package listing_02_07;
import java.util.Scanner;
import java.text.DateFormat;
public class LISTING_02_07 {
    public static void main(String[] args) {
       //Obtain the total miliseconds since midnight,Jan 1,1970
       long totalMilliseconds = System.currentTimeMillis();
       
       
       //Obtain the total seconds since midnight,Jan 1,170
       long totalSeconds = totalMilliseconds/1000;
       
       //Compute the current second in the minute in the hour
       long currentSecond = totalMilliseconds%60;
       
       //Obtain the total minutes
       long  totalMinutes = totalSeconds/60;
       
       //Compute the current minute in the hour
       long currentMinute = totalMinutes%60;
       
       //Obtain the tootal hours
       long totalHours = totalMinutes/60;
       
       //Compute the cerren hour
       long currentHour = totalHours%24;
       
       //Display results
       System.out.println("Current time is "+ currentHour+" : "+currentMinute+" : "+currentSecond +" GMT");
       
       
       
       
       
    }
    
}
