package demo;

public class Address {
	public String Addressline1;
	public String Addressline2;
	public String city;
	public String zip;
	public String state;
	public String country;
	public String getAddressline1() {
		return Addressline1;
	}
	public void setAddressline1(String addressline1) {
		Addressline1 = addressline1;
	}
	public String getAddressline2() {
		return Addressline2;
	}
	public void setAddressline2(String addressline2) {
		Addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
