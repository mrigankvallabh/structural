import proxy.SecurityProxy;
import proxy.TwitterService;
import proxy.TwitterServiceStub;

public class ProxyTwitterDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("screenName"));
        service.postToTimeline("screenName", "message"); // disallow on SecurityProxy
    }
}
