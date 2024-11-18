package core_java;

public class Employee {

	// Member variables (fields)
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;

	// Constructor
	public Employee(int empId, String empName, int empAge, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	// Getters and Setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	// ToString method to display employee details
	@Override
	public String toString() {
		return "Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpAge=" + empAge + ", EmpSalary=" + empSalary + "]";
	}

	// Main method to test the Employee class
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ankita More", 21, 55000.00);
		System.out.println(emp); // Print employee details using the toString method
	}



}

//OUTPUT 
// Employee [EmpId=1, EmpName=Ankita More, EmpAge=21, EmpSalary=55000.0]
