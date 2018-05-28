public class Task02 {

	public static void main(String[] args) {
		
		Stock stock = new Stock("ORCL", "Oracle Corporation"); //create a "stock" object 
		
		stock.setClosingPrice(34.5);
		stock.setCurrentPrice(34.35);
		
		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n", stock.getChangePercent());

	}

}
