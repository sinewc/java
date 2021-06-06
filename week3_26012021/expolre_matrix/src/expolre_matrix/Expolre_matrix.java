
package expolre_matrix;
import java.util.Scanner;
import java.util.Arrays;
public class Expolre_matrix {
public static void main(String[] args) {
   
         int[][] matrix = getMatrix();
         // Display matrix
	 print(matrix);  
         rowandColumn(matrix);
         checkdiagonal(matrix);
         
         
    }

public static void checkdiagonal(int[][] m){
    int superdiagonal = 0;
    int diagonal = 0;
    int subdiagonal = 0;
    for(int i=0;i < m.length;i++){
        for(int j=0;j < m.length;j++){
            if(j==i+1){
            superdiagonal += m[i][j]; 
            }
            if(i==j){
                 diagonal += m[i][j];
            }
            if(j==i+1){
               subdiagonal += m[j][i]; 
            }
        }
    }
    System.out.println((superdiagonal));
    System.out.println((diagonal));
    System.out.println((subdiagonal));
    
     //superdiagonal
    if(superdiagonal==0){
        System.out.println("All 0s on The superdiagonal" );
    }
    else if (superdiagonal==m.length-1){
        System.out.println("All 1s on The superdiagonal" );
    }
    else{
         System.out.println("No same numbers on The superdiagonal");
    }
    
    //diagonal
    if(diagonal==0){
        System.out.println("All 0s on The diagonal" );
    }
    else if (diagonal==m.length){
        System.out.println("All 1s on The diagonal" );
    }
    else{
         System.out.println("No same numbers on The diagonal");
    }
    
   
    //subdiagonal
    if(subdiagonal==0){
        System.out.println("All 0s on The subdiagonal" );
    }
    else if (subdiagonal==m.length-1){
        System.out.println("All 1s on The subdiagonal" );
    }
    else{
         System.out.println("No same numbers on The subdiagonal");
    }
    
   }

    

public static void rowandColumn(int[][] m){
    int[] countRow = new int[m.length];
    int[] countColumn =new int[m.length];
    for(int i=0;i<m.length;i++){
        for(int j=0;j < m.length;j++){
            countRow[i] += m[i][j];
            countColumn[j] += m[i][j];
        }
    }
   System.out.println(Arrays.toString(countRow));
   System.out.println(Arrays.toString(countColumn));
    int sum1=0;
    for(int i=0;i<m.length;i++){
        if(countRow[i] == m.length){
            System.out.println("All 1s on row " + i );
            sum1++;
        }
        else if(countRow[i] == 0){
             System.out.println("All 0s on row " + i );
             sum1++;
        }
        
    }
    if(sum1==0){
        System.out.println("No same numbers on a row");
    }
        
    int sum2=0;
    for(int j=0;j<m.length;j++){
        if(countColumn[j] == m.length){
            System.out.println("All 1s on Column " + j );
            sum2++;
        }
        else if(countColumn[j] == 0){
             System.out.println("All 0s on Column " + j );
             sum2++;
        }
    }
    if(sum2==0){
             System.out.println("No same numbers on a Column");
        }
    }
 
public static int[][] getMatrix() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size for the matrix: ");
    int size = input.nextInt();
    int[][] m = new int[size][size];
    for (int i = 0; i < m.length; i++) {
	for (int j = 0; j < m[i].length; j++) {
	     m[i][j] = (int)(Math.random() * 2);
	}
    }
return m;
}

	/** print displays all elements in a matrix */
public static void print(int[][] m) {
    for (int i = 0; i < m.length; i++) {
	for (int j = 0; j < m[i].length; j++) {
	     System.out.print(m[i][j]);
	}
	      System.out.println();
	}
    }
}