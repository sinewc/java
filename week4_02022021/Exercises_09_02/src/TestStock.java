import java.util.Scanner;
public class TestStock {
     public static void main(String[] args) {
         Stock stock = new Stock("ORCL","Oracle Coperation",34.5,34.35);
        
        double previousClosingPrice,currentPrice;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Symbol : ");
            stock.setSymbol(input.nextLine());
        System.out.print("Enter Name : ");
            stock.setName(input.nextLine());
        System.out.print("Enter Previous Closing Price : ");
            stock.setPreviousClosingPrice(input.nextDouble());
        System.out.print("Enter Current Pricee : ");
            stock.setCurrentPrice(input.nextDouble());
        
        
        // Display the price-change percentage
        System.out.println("------------------------------------------- " );
        System.out.println("Stock name: " + stock.getSymbol());
	System.out.println("Stock name: " + stock.getName());
	System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
	System.out.println("Price change : "+stock.getChangePercent()+" % ");
    
     }
}
