import java.util.Scanner;
import java.util.GregorianCalendar;
public class TestGregorianCalender {
    public static void main(String[] args){
         
    GregorianCalendar calender =new GregorianCalendar();
    //input
    System.out.println("Current year, month, date, and day of week ");
    System.out.println("Year is "+calender.get(GregorianCalendar.YEAR));
    System.out.println("Mouth is "+calender.get(GregorianCalendar.MONTH));
    System.out.println("Date is "+calender.get(GregorianCalendar.DATE));
    System.out.println("Day of week is "+calender.get(GregorianCalendar.DAY_OF_WEEK));
    System.out.println("------------------------------------------- " );
    
    Scanner input =new Scanner(System.in);
    System.out.print("How many day to add : ");
    long day = input.nextLong();
    calender.setTimeInMillis(calender.getTimeInMillis()+(day*24*60*60*1000));
    
    
    System.out.println("Ater specified the elapsed time of one day after current day ");
    System.out.println("Year is "+calender.get(GregorianCalendar.YEAR));
    System.out.println("Mouth is "+calender.get(GregorianCalendar.MONTH));
    System.out.println("Date is "+calender.get(GregorianCalendar.DATE));
    System.out.println("Day of week is "+calender.get(GregorianCalendar.DAY_OF_WEEK));
    System.out.println(calender.getTime());
    
    
    }
}
