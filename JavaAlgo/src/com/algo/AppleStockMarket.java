import java.util.ArrayList;

public class AppleStockMarket {

	int Stock;
	ArrayList<Integer> StockPriceList = new ArrayList<Integer>();

	public AppleStockmarket(int... Stock) {
		for (int i : Stock) {
			this.StockPriceList.add(i);
		}
	}

	public int MaxProfit() {

		int MinPurchasePrice = StockPriceList.get(0);
		int MaxProfit = StockPriceList.get(1) - StockPriceList.get(0);
		for (int i = 1; i < StockPriceList.size(); i++) {
			int currentPrice = StockPriceList.get(i);

			int curMaxProfit = currentPrice - MinPurchasePrice;
			MaxProfit = Math.max(MaxProfit, curMaxProfit);
			MinPurchasePrice = Math.min(MinPurchasePrice, currentPrice);
		}

		return MaxProfit;
	}

	public static void main(String[] args) {
		AppleStockMarket sm = new AppleStockMarket(9,8,7,6,5,4,3,1);
		System.out.println(sm.MaxProfit());

	}

}
