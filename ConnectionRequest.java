package demo;

enum connectionStatus{
	Approved,
	Denied,
	Pending
}

public class ConnectionRequest {
	public String sentbyId;
	public String sentToId;
	public String expiryTime;
	public String connectionMessage;
	public connectionStatus connectionStatus;
	public String getSentbyId() {
		return sentbyId;
	}
	public void setSentbyId(String sentbyId) {
		this.sentbyId = sentbyId;
	}
	public String getSentToId() {
		return sentToId;
	}
	public void setSentToId(String sentToId) {
		this.sentToId = sentToId;
	}
	public String getExpiryTime() {
		return expiryTime;
	}
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}
	public String getConnectionMessage() {
		return connectionMessage;
	}
	public void setConnectionMessage(String connectionMessage) {
		this.connectionMessage = connectionMessage;
	}
	public void respondToRequest() {
		
	}
}
