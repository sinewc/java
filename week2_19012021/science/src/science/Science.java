
package science;
import java.util.Scanner;
public class Science {
    public static void main(String[] args) {
    int dayofweek=0,dayofmonth=0,month=0,year=0;
    Scanner input =new Scanner(System.in);
    System.out.print("Enter year : (e.g.2012) : ");
    year = input.nextInt();
    System.out.print("Enter month: 1-12 : ");
    month = input.nextInt();
        if(month>12){
            //System.out.println("You entered the wrong month number.");
        }
    System.out.print("Enter the day of the month : 1-31 : ");
    dayofmonth =input.nextInt();
        if(dayofmonth>31){
            //System.out.println("You entered the wrong date.");
        }
    
    System.out.print("Day of the week is ");
    if (month == 1 || month == 2){
	month = (month ==1) ?  13 : 14;
	year--;
       }
    //calculator dayofweek
    dayofweek = (dayofmonth +(26*(month+1))/10+(year%100)+(year%100)/4+(year/100)/4+5*(year/100))%7;
    day(dayofweek);
    }
    
    public static int day(int dayofweek){
       switch(dayofweek){
           case 0:System.out.print("Saturday");break;
           case 1:System.out.print("Sunday");break;
           case 2:System.out.print("Monday");break;
           case 3:System.out.print("Tuesday");break;
           case 4:System.out.print("Wednesday");break;
           case 5:System.out.print("Thursday");break;
           case 6:System.out.print("Friday");
           
       } 
       return(dayofweek);
    }
}