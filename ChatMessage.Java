package erub.rb.ru.chat.model;

import java.io.Serializable;

public class ChatMessage implements Serializable {
	
	protected static final long serialVersionUID = 1112122200L;

	// types of message sent by Client
	// WHOISIN receives list of users connected
	// MESSAGE an message
	// LOGOUT disconnects from Server
	public static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
	private int type;
	private String message;
	
	// constructor
	public ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	// getters
	public int getType() {
		return type;
	}
	public String getMessage() {
		return message;
	}
}
