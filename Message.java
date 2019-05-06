package demo;

public class Message {
	public String sentby;
	public String sentto;
	public String messagetext;
	public boolean delivered;
	public boolean seen;
	public Reaction reaction;
	public String getSentby() {
		return sentby;
	}
	public void setSentby(String sentby) {
		this.sentby = sentby;
	}
	public String getSentto() {
		return sentto;
	}
	public void setSentto(String sentto) {
		this.sentto = sentto;
	}
	public String getMessagetext() {
		return messagetext;
	}
	public void setMessagetext(String messagetext) {
		this.messagetext = messagetext;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public boolean isSeen() {
		return seen;
	}
	public void setSeen(boolean seen) {
		this.seen = seen;
	}
	public Reaction getReaction() {
		return reaction;
	}
	public void setReaction(Reaction reaction) {
		this.reaction = reaction;
	}
}
