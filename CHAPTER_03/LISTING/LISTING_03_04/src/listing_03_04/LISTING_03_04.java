import java.util.Scanner;
public class LISTING_03_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt the user to enter weight in pounds
        System.out.println("Enter weigth in pounds");
        double weight = input.nextDouble();
        //promt the usr to enter heigth in inches
        System.out.println("Enter weigth in pounds");
        double height = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        //Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms/(heightInMeters * heightInMeters);
        
        //display result
        System.out.println("BMI is "+bmi);
        if(bmi <18.5){
            System.out.println("Underweight");
        }
        else if(bmi<25){
            System.out.println("Normal");
        }
        else if (bmi<30){
            System.out.println("Overweight");           
        }
        else{
            System.out.println("0 bese");
        }       
                      
    }
    
}
