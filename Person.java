package demo;

enum Gender{
	  Male,
	  Female,
	  NA,
	}

public class Person {
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Education getEducationdetails() {
		return educationdetails;
	}
	public void setEducationdetails(Education educationdetails) {
		this.educationdetails = educationdetails;
	}
	public String firstname;
	public String lastname;
	public Gender gender;
	public Education educationdetails;

}
