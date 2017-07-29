package checkit;

public class Main {

    public static void main(String[] args) {

        String currencyPair = "BTC-USD";

        System.out.println("\nGoing to subscribe to channel for " + currencyPair + " ...");
        MyStreamingService streamingService = new MyStreamingService("testUrl");
        MyStreamingMarketDataService streamingMDService = new MyStreamingMarketDataService(streamingService);
        String ticker = streamingMDService.getTicker(currencyPair, "ticker");
        System.out.println("Ticker: " + ticker);
    }
}
