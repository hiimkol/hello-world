package krader_jar;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
@ServerEndpoint("/hello")
public class Server{
	@OnOpen
	public void open(Session session) {
		System.out.println("hello session: "+session.getId());
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
