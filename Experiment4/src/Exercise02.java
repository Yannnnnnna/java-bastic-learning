//股票类stock
public class Exercise02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "OracleCorporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println(stock.getChangePercent() * 100 + "%");

    }
}
class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        return Math.abs(previousClosingPrice -currentPrice) / previousClosingPrice;
    }
}
