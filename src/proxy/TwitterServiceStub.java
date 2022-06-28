package proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "My stubby timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("Putting " + message + " to screenName " + screenName);
    }

}
