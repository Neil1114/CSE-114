
public class Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	
	public void setPreviousClosingPrice(double price){
		previousClosingPrice = price;
	}
	
	public void setCurrentPrice(double price){
		currentPrice = price;	
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	
	public double getCurrentPrice(){
		return currentPrice;
	}
	
	public double changePercent(){
		return (currentPrice/previousClosingPrice) * 100;
	}
	
	
}
