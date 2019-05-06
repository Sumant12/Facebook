package demo;
import java.util.Date;
import java.util.List;

public class Member {
	public Account account;
	public Profile profile;
	public Date dateOfMembership;
	public List<Member> friends;
	public List<ConnectionRequest> connectionrequests;
	public List<Member> suggessions;
	public List<Group> groupsfollowed;
	public List<Post> posts;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Date getDateOfMembership() {
		return dateOfMembership;
	}
	public void setDateOfMembership(Date dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}
	
	public int createpost(Post post) {
		Integer postid =1;//Create a post and return postid
		return postid;
	}
	
	public boolean sendMessage(Member member2) {
		return false;
	}
}
