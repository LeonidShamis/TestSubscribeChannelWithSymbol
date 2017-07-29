package checkit;

public abstract class BaseAbstractService {

    private final String uri;

    BaseAbstractService(String apiUrl) {
        this.uri = apiUrl;
    }

    public abstract String getSubscribeMessage(String channelName, Object... args);

    public String subscribeChannel(String channelName, Object... args) {
        String message = getSubscribeMessage(channelName, args);
        System.out.println("Sent subscribe message: { " + message + " }");
        return channelName;
    }
}