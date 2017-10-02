package mohamedmohsen.despacito.Models;

public class Requests {

    String RequestType;

    public Requests() {
    }

    public Requests(String requestType) {
        RequestType = requestType;
    }

    public String getFriendRequestType() {
        return RequestType;
    }

    public void setFriendRequestType(String requestType) {
        RequestType = requestType;
    }
}