
package twolist;
import java.util.Arrays;
import java.util.Scanner;
public class Twolist {
     Scanner input = new Scanner(System.in);
         public static void merge(int[] list1, int[] list2)  {
		int[] list3 = new int[8];
		for(int i = 0; i < 4; i++){
			list3[i] = list1[i];
                }       
                for(int i = 0; i < 4; i++) {
			list3[i+4] = list2[i];	
		}

		Arrays.sort(list3);
                System.out.print("The merged list is : ");
                for(int i=0;i<8;i++){
                    System.out.print(list3[i]+" ");
                }
         }
                
  public static void main(String[] args) {
        
                int[] list1 = new int[4];
                int[] list2 = new int[4];
		System.out.print("Enter list1: ");
		for (int i = 0; i < 4; i++) {
                    int random = (int)(Math.random()*99);
			list1[i] = random;
                        System.out.print(" "+list1[i]);
		}
                
                System.out.print("\nEnter list2: ");
		for (int i = 0; i < 4; i++) {
                    int random = (int)(Math.random()*99);
			list2[i] = random;
                        System.out.print(" "+list2[i]);
		}
                System.out.println(" ");
                merge(list1,list2);
    }
}
		



   
