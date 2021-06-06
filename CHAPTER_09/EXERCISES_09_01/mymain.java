import java.util.Scanner;

public class mymain {

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();
        Rectangle c = new Rectangle(5);
        Rectangle d = new Rectangle(5,3);
        

        a.setHeight(5);
        a.setWidht(5);
        b.setHeight(15);

        // a.height = 2; // int x; x = 2;
        System.out.println("height = " + a.getArea());

        a.callname();
        System.out.println("jj = "+sine(5,8));
    }

    public static int sine(int jj) {
        System.out.println("First Funct");
        return jj-5;
        
    }
    public static int sine(double jj) {
        System.out.println("Secend Funct");
        return (int)jj-5;
        
        
    }

    public static String sine(String jj) {
        System.out.println("three Funct");
        return jj+"wc";
        
        
    }
    public static double sine(double jj,double ii) {
        System.out.println("four Funct");
        return jj+ii;
        
        
    }
}