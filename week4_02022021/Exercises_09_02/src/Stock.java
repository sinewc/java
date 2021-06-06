
public class Stock {
        String symbol;                 // The stock's symbol
	String name;                   // The stock's name
	double previousClosingPrice;	 // The stock price for the previous day
	double currentPrice;				 // The stock price for the current time
        String setSymbol;
        String setName;
        double setPreviousClosingPrice;	 // The stock price for the previous day
	double setCurrentPrice;	

	// Construct a stock with a specified symbol and name
	Stock(String newSymbol, String newName,Double newPreviousClosingPrice,Double newCurrentPrice) {
		symbol = newSymbol;
		name = newName;
                previousClosingPrice = newPreviousClosingPrice;
                currentPrice = newCurrentPrice;
                
	}
        //set
        void setSymbol(String newSymbol){
            symbol = newSymbol;
        }
        
        void setName (String newName){
            name = newName;
        }
        
        void setPreviousClosingPrice (double newPreviousClosingPrice){
            previousClosingPrice = newPreviousClosingPrice;
        }
        
        void setCurrentPrice (double newCurrentPrice){
            currentPrice = newCurrentPrice;
        }
        
        
        String getSymbol(){
            return symbol;
        }
        
        String getName(){
            return name;
        }
        
        double getPreviousClosingPrice(){
            return previousClosingPrice;
        }
        
        double getCurrentPrice(){
            return currentPrice;
        }

	// Return the percentage changed from previousClosingPrice to currentPrice
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}

