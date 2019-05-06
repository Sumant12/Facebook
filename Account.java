package demo;

enum AccountStatus{
	Active,
	Deactivated,
	closed,
	Blocked,
}
public class Account {
	public Integer accountId;
	public AccountStatus accountstatus;
	public String password;
	public Integer passwordexpirytime;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public AccountStatus getAccountstatus() {
		return accountstatus;
	}
	public void setAccountstatus(AccountStatus accountstatus) {
		this.accountstatus = accountstatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPasswordexpirytime() {
		return passwordexpirytime;
	}
	public void setPasswordexpirytime(Integer passwordexpirytime) {
		this.passwordexpirytime = passwordexpirytime;
	}
	
	public void resetpassword(String oldpassword,String newpassword) {
		if(this.password.equals(oldpassword)) {
			this.password=newpassword;
		}
	}

}
