package board.model;

public class ZipcodeDto {
	private String zipcode1;
	private String zipcode2;
	private String address1;
	
	public String getZipcode1() {
		return zipcode1;
	}
	public void setZipcode1(String zipcode1) {
		this.zipcode1 = zipcode1;
	}
	public String getZipcode2() {
		return zipcode2;
	}
	public void setZipcode2(String zipcode2) {
		this.zipcode2 = zipcode2;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	

	@Override
	public String toString() {
		return "ZipcodeDto [zipcode1=" + zipcode1 + ", zipcode2=" + zipcode2 + ", address1=" + address1 + "]";
	}
	
}
