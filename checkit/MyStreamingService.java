package checkit;

import checkit.dto.SubscriptionMessage;

public class MyStreamingService extends BaseService {

    private static final String SUBSCRIBE = "subscribe";

    MyStreamingService(String apiUrl) {
        super(apiUrl);
    }

    @Override
    public String getSubscribeMessage(String channelName, Object... args) {
        SubscriptionMessage subscribeMessage =
                new SubscriptionMessage(SUBSCRIBE, channelName, (String)args[0]);
        return subscribeMessage.toString();
    }
}