package checkit;

public interface StreamingMarketDataService {
    String getTicker(String currencyPair, Object... args);
//    String getOrderBook(String currencyPair, Object... args);
//    String getTrades(String currencyPair, Object... args);
}
