package krader_jar;
@ServerEndpoint("/hello")
public class Server{
	@OnOpen
	public void open(Session session) {
	}

	@OnClose
	public void close(Session session) {
	}

	@OnError
	public void onError(Throwable error) {
	}

	@OnMessage
	public void handleMessage(String message, Session session) {
	}
	
}
