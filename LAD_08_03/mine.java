import java.util.Scanner;

public class mine {
    public static void main(String[] args) {
        System.out.println("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit)");
        Scanner num = new Scanner(System.in);
        int menu;
        do{
            menu = num.nextInt();
        if (menu == 1) {
            System.out.println("Circle c1 (name radius color)");
            Scanner inputc1 = new Scanner(System.in);
            Circle c1 = new Circle();
            Circle c2 = new Circle();
            String namec1, namec2, colorc1, colorc2;
            double radiusc1, radiusc2;
            //System.out.println("c1 name : ");
            namec1 = inputc1.next();
            //System.out.println("c1 radius : ");
            radiusc1 = inputc1.nextDouble();
            //System.out.println("c1 color : ");
            colorc1 = inputc1.next();
            c1.setName(namec1);
            c1.setRadius(radiusc1);
            c1.setColor(colorc1);
              
            System.out.println("Circle c2 (name radius color)");
            Scanner inputc2 = new Scanner(System.in);
           // System.out.println("c2 name : ");
            namec2 = inputc2.next();
            //System.out.println("c2 radius : ");
            radiusc2 = inputc2.nextDouble();
            //System.out.println("c1 color : ");
            colorc2 = inputc2.next();
            c2.setName(namec2);
            c2.setRadius(radiusc2);
            c2.setColor(colorc2);
            System.out.println(" Equal Circles Equal Circles, if their radii are the same : ");

            if (c1.getRadius() == c2.getRadius()) {
                System.out.println(" : true ");
            } else if (c1.getRadius() != c2.getRadius()) {
                System.out.println(" : false ");

            }
             
            double num1=c1.getRadius();
            double num2=c2.getRadius();

            System.out.println("The larger object using max method : [Circle]");
            if (num1 > num2) {
                System.out.println("name = " + c1.getName() + " radius = " + c1.getRadius() + " color = " + c1.getColor());
               
            } 
            else if(num1<num2){
                System.out.println("name = " + c2.getName() + " radius = " + c2.getRadius() + " color = " + c2.getColor());
                
            }
        }

       else if (menu == 2) {

            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();
            String nameRec1, nameRec2, colorRec1, colorRec2;
            double widthRec1, widthRec2, heightRec1, heightRec2;
            System.out.println("Rectangle r1 (name width height color)");
            Scanner input = new Scanner(System.in);
            //System.out.println("Rectangle r1 :");
            //System.out.println("r1 name : ");
            nameRec1 = input.next();
            //System.out.println("r1 width : ");
            widthRec1 = input.nextDouble();
            //System.out.println("r1 height : ");
            heightRec1 = input.nextDouble();
            //System.out.println("r1 color : ");
            colorRec1 = input.next();
            r1.setName(nameRec1);
            r1.setWidth(widthRec1);
            r1.setHeight(heightRec1);
            r1.setColor(colorRec1);

            
            System.out.println("Rectangle r2 (name width height color)");
           // System.out.println("Rectangle r2 :");
            //System.out.println("r2 name : ");
            nameRec2 = input.next();
            //System.out.println("r2 width : ");
            widthRec2 = input.nextDouble();
            //System.out.println("r2 height : ");
            heightRec2 = input.nextDouble();
            //System.out.println("r2 color : ");
            colorRec2 = input.next();
            r2.setName(nameRec2);
            r2.setWidth(widthRec2);
            r2.setHeight(heightRec2);
            r2.setColor(colorRec2);

            System.out.println(" Equal rectangles, if their areas are the same : ");

            if (r1.getArea() == r2.getArea()) {
                System.out.println(" : true ");
            } else if (r1.getArea() != r2.getArea()) {
                System.out.println(" : false ");
            }

            System.out.println(" Find the larger object using max method ");
            if (r1.getArea() > r2.getArea()) {
                System.out.println("name = " + r1.getName() + " width = " + r1.getWidth() + " height = "
                        + r1.getHeight() + " color = " + r1.getColor());
                break;
            } else if (r2.getArea() > r1.getArea()) {
                System.out.println("name = " + r2.getName() + " width = " + r2.getWidth() + " height = "
                        + r2.getHeight() + " color = " + r2.getColor());
                        break;
            } else if (r1.getArea() == r2.getArea()) {
                System.out.println(": EQUAL");
                break;
            }
        }

        else if (menu == 3) {
            Triangle t1 = new Triangle();
            Triangle t2 = new Triangle();
            System.out.println("triangle t1 (name x1 y1 x2 y2 x3 y3 color)");
            Scanner inputt1 = new Scanner(System.in);
            //System.out.println(" t1 name ");
            String nametri1 = " ";

            System.out.print("Enter three coordinate of the triangle ");
            nametri1 = inputt1.next();
            //System.out.print("\npoint 1 :");
            double x11 = inputt1.nextDouble();
            double y11 = inputt1.nextDouble();
            //System.out.print("point 2 :");
            double x21 = inputt1.nextDouble();
            double y21 = inputt1.nextDouble();
            //System.out.print("point 3 :");
            double x31 = inputt1.nextDouble();
            double y31 = inputt1.nextDouble();
            //System.out.println(" t1 color ");
            String colortri1 = " ";
            colortri1 = inputt1.next();
            t1 = new Triangle(nametri1,x11,y11,x21,y21,x31,y31,colortri1);
           
            System.out.println("triangle t2 (name x1 y1 x2 y2 x3 y3 color)");
            Scanner inputt2 = new Scanner(System.in);
            //System.out.println(" t2 name ");
            String nametri2 = " ";
             System.out.print("Enter three coordinate of the triangle ");
             nametri2 = inputt2.next();
             //System.out.print("\npoint 1 :");
            double x12 = inputt2.nextDouble();
            double y12 = inputt2.nextDouble();
            //System.out.print("point 2 :");
            double x22 = inputt2.nextDouble();
            double y22 = inputt2.nextDouble();
            //System.out.print("point 3 :");
            double x32 = inputt2.nextDouble();
            double y32 = inputt2.nextDouble();
            //System.out.println(" t2 color ");
            String colortri2 = " ";
            colortri2 = inputt2.next();
             t2 = new Triangle(nametri2,x12,y12,x22,y22,x32,y32,colortri2);
             
             System.out.println(" Equal triangles, if their areas are the same : ");
             if (t1.getArea() == t2.getArea()) {
                System.out.println(" : true ");
            } else if (t1.getArea() != t2.getArea()) {
                System.out.println(" : false ");
            }

            System.out.println(" Find the larger object using max method ");
            if (t1.getArea() > t2.getArea()) {
                System.out.println("name = " + t1.getName() + " side1  = " + t1.getSide1() + " side2 = "
                        + t1.getSide2() + " side3  = " + t1.getSide3()+ " color = " + t1.getColor());
                        break;
            } else if (t2.getArea() > t1.getArea()) {
                System.out.println("name = " + t2.getName() + " side1  = " + t2.getSide1() + " side2 = "
                        + t2.getSide2() + " side3  = " + t2.getSide3()+ " color = " + t2.getColor());
                        break;
            } else if (t1.getArea() == t2.getArea()) {
                System.out.println(": EQUAL");
                break;
            }

        }
        else if(menu==4){
            System.out.println("End of program.");
            break;
        }
    }while(menu !=4);
    }
}

