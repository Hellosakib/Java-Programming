public class Stock {
	
	String symbol;
	String name;
	private double previousClosingPrice;
	private double currentPrice ;
	
	Stock(){
		
	}
	Stock(String symbol , String name){
		this.symbol =symbol;
		this.name =name;
	}
	public double getClosingPrice() {
		return this.previousClosingPrice;
	}
	public void setClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice =currentPrice;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
