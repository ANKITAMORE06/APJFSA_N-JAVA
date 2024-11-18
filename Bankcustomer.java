package core_java;

public class Bankcustomer {

	private int acno; // Account number
	private String atype; // Account type
	private double amt; // Account balance

	// Parameterized constructor
	public Bankcustomer(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Getters and setters
	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	// toString method to display customer details
	@Override
	public String toString() {
		return "Bankcustomer [acno=" + acno + ", atype=" + atype + ", amt=" + amt + "]";
	}

	public static void main(String[] args) {
		// Create BankCustomer objects
		Bankcustomer customer1 = new Bankcustomer(12345, "Savings", 10000.0);
		Bankcustomer customer2 = new Bankcustomer(67890, "Current", 5000.0);

		// Display customer details
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
	}


}

//OUTPUT 
// Bankcustomer [acno=12345, atype=Savings, amt=10000.0]
//Bankcustomer [acno=67890, atype=Current, amt=5000.0]
