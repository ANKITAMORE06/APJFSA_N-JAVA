package core_java;

public class AddressConstructor {

	private String street;
	private String city;
	private String state;
	private String zipCode;

	// No-argument constructor
	public AddressConstructor() {
	}

	// Parameterized constructor
	public AddressConstructor(String street, String city, String state, String zipCode) {
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
	//Tostring method used
	public String toString() {                 
		return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\''
				+ ", zipCode='" + zipCode + '\'' + '}';
	}


	public static void main(String[] args) {

		// Create an Address object using the parameterized constructor
		Address address = new Address("123 Main St", "SATARA", "MAHARASHTRA", "1000");

		// Access attribute values using getters
		System.out.println("Street: " + address.getStreet());
		System.out.println("City: " + address.getCity());
		System.out.println("State: " + address.getState());
		System.out.println("Zip Code: " + address.getZipCode());

		// Modify attribute values using setters
		address.setCity("PUNE");
		System.out.println("Updated Address: " + address.toString());
	}
}


/*
 * Street: 123 Main St
City: SATARA
State: MAHARASHTRA
Zip Code: 1000
Updated Address: Address{street='123 Main St', city='PUNE', state='MAHARASHTRA', zipCode='1000'}

 */




