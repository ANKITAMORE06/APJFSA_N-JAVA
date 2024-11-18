package core_java;

public class Address {

	private String street;
	private String city;
	private String state;
	private String zipCode;

	// No-argument constructor
	public Address() {
	}

	// Parameterized constructor
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// Getter Method
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	// Setter Method
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\''
				+ ", zipCode='" + zipCode + '\'' + '}';
	}

}
