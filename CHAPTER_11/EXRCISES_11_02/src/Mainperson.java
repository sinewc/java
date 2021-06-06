import java.util.Scanner;
public class Mainperson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final  int STUDENT = 1;
	final  int EMPLOYEE = 2;
	final  int FACULTY = 3;
	final  int STAFF = 4;
        String name,address,phone,email,officeHours,rank,title;
        int status=0,menu=0,office=0;
        double salary = 0;
        System.out.println("------THE PERSON--------");
        System.out.print("Enter name : " );
                      name = input.nextLine();
	System.out.print("Enter address : " );
                      address = input.nextLine();
	System.out.print("Enter phone : ");
                      phone = input.nextLine();
        System.out.print("Enter email : ");
                      email = input.nextLine();
        person person = new person(name,address,phone,email);
        System.out.println(person.toString());
        
        while(true){
        System.out.println("----------M-E-N-U----------");
        System.out.println("1.STUDENT");
        System.out.println("2.EMPLOYEE");
        System.out.println("3.FACULTY");
        System.out.println("4.STAFF");
        System.out.print("Enter menu : " );
            menu = input.nextInt();
            input.nextLine();
            
        if(menu==1){
        System.out.print("Enter status : ");
             status = input.nextInt();
        student student = new student(name,address,phone,email,status);
        System.out.println(student.toString());
        }
        
        else if(menu==2){
        System.out.print("Enter office : ");
          office = input.nextInt();
        System.out.print("Enter salary : ");
          salary = input.nextDouble(); 
          employee employee=new employee(name,address,phone,email,office,salary);
          System.out.println(employee.toString());
        }
        
        else if(menu=  =3){
            System.out.print("Enter officeHours : ");
                      officeHours = input.nextLine();
        System.out.print("Enter rank : ");
                      rank = input.nextLine();
            faculty faculty=new faculty(name,address,phone,email,office,salary,officeHours,rank);
            System.out.println(faculty.toString());
        }
        
	else if(menu==4){
             System.out.print("Enter ,title : ");
                    title = input.nextLine();
	staff staff=new staff(name,address,phone,email,office,salary,title);
	System.out.println(staff.toString());
        }
        else{
            System.out.print(" Unknown ");
        }
        }
}
}
