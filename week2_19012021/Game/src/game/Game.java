
package game;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
    int playerwon=0,computerwon=0; 
    Scanner input =new Scanner (System.in);
    do{
        //menu
        System.out.print("MENU\nscissor (0), rock (1) , paper (2) :");
        //player
        int player = input.nextInt();
        // Generate a random integer 0, 1, or 2
        int computer = (int)(Math.random() * 3);
        System.out.print("The computer is ");
        choice(computer);
        System.out.print(" You are ");
        if(player == 0||player == 1||player == 2){
           choice(player);
                if(computer==player){
                    System.out.println(" too. It is a draw");
                }
                else{
                    boolean win = (player==0&&computer==2)||
                                  (player==1&&computer==0)||
                                  (player==2&&computer==1);
                        if(win){
                            System.out.println(".You won");
                            playerwon++;
                        }
                        else{
                            System.out.println(".You loses");
                            computerwon++;
                        }
                }
        }
        else{
          System.out.println(" There is no this number in the game.");
        }
        System.out.println("Computer won: " + computerwon +"\nplayer won: " + playerwon);
     }while(Math.abs(computerwon-playerwon)<=2);
    
}
     
     public static int choice(int input){
         switch(input){
             case 0: System.out.print("scissor");break;
             case 1: System.out.print("rock");break;
             case 2: System.out.print("paper");          
         }
         return(input);
     } 
}

    
    


