# Simulate Subscribing to Channel with symbol

Simplified demonstration of the issue https://github.com/bitrich-info/xchange-stream/issues/8#issuecomment-318566827 
with proposed change

Refer to https://docs.bitfinex.com/v2/reference#ws-public-ticker for more details

NOTES:
- Not really creating any streams, not using Observables
- Calling Marker Data service with currenly pair and channel name:
```
	streamingMDService.getTicker(currencyPair, "ticker");
```

Output (running checkit.Main in IntelliJ IDEA):

```
Going to subscribe to channel for BTC-USD ...
Sent subscribe message: { event: subscribe, channel: ticker, symbol: tBTCUSD }
Ticker: Here is a Ticker for channel ticker
```

## Proposed Changes:

**- service-netty\src\main\java\info\bitrich\xchangestream\service\netty\NettyStreamingService.java**
- change from:
```
	public abstract String getSubscribeMessage(String channelName) throws IOException;
	...
	
    public Observable<T> subscribeChannel(String channelName) {
    ...
    	sendMessage(getSubscribeMessage(channelName));
    ...    
```
- to:
```
	public abstract String getSubscribeMessage(String channelName, Object... args) throws IOException;
	...
	
    public Observable<T> subscribeChannel(String channelName, Object... args) {
    ...
    	sendMessage(getSubscribeMessage(channelName, args));
    ...    
```
**- derived StreamingServices classes**
