package checkit;

public class MyStreamingMarketDataService implements StreamingMarketDataService {

    private final MyStreamingService service;

    MyStreamingMarketDataService(MyStreamingService service) {
        this.service = service;
    }

    @Override
    public String getTicker(String currencyPair, Object... args) {
        // Channel name is passed as an argument and currency pair is used to build symbol
        String symbol = "t" + currencyPair.replace("-", "");
        String channelName = (String)args[0];
        String subscribedChannel = service.subscribeChannel(channelName, symbol);
        return "Here is a Ticker for channel " + subscribedChannel;
    }
}
