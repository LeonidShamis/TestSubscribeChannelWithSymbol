package checkit.dto;

public class SubscriptionMessage {

    public static final String EVENT = "event";
    public static final String CHANNEL = "channel";
    public static final String SYMBOL = "symbol";

    private String event;
    private String channel;
    private String symbol;

    public SubscriptionMessage(String event, String channel) {
        this.event = event;
        this.channel = channel;
    }

    public SubscriptionMessage(String event, String channel, String symbol) {
        this.event = event;
        this.channel = channel;
        this.symbol = symbol;
    }

    public String getEvent() {
        return event;
    }

    public String getChannel() {
        return channel;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toString() {
        String returnStr = ""
                            + EVENT + ": " + getEvent() + ", "
                            + CHANNEL + ": " + getChannel();
        if (symbol != null && !symbol.isEmpty())
            returnStr +=  ", " + SYMBOL + ": " + getSymbol();

        return returnStr;
    }
}
