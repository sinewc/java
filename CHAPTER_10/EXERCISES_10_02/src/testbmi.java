import java.util.Scanner;
public class testbmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String name;
            int age=0;
            double weight,height,feet,inches;
            System.out.print("Enter Name : ");
                name = input.nextLine();
            System.out.print("Enter Age : ");
                age  = input.nextInt();
            System.out.print("Enter Weight : ");
                weight = input.nextDouble();
            System.out.print("Enter Feet: ");
                feet = input.nextDouble();
            System.out.print("Enter Inches: ");
                inches = input.nextDouble();
            //class bmi
	    bmi bmi1 = new bmi(name, age ,weight, feet,inches);
            //Display print
            System.out.println("\nThe BMI for " + bmi1.getName() + " is "+ bmi1.getBMI() + " " + bmi1.getStatus());
            
	}
}
