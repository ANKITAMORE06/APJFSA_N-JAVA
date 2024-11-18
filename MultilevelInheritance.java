package core_java;

// Base class
class Doctor {
	// Method in the Doctor class
	public void treatment() {
		System.out.println("Doctor gives treatment to the patient.");
	}

	// Method in the Doctor class
	public void patient() {
		System.out.println("Doctor is prescribing medicine to the patient.");
	}
}

// Derived class Surgeon (Multilevel Inheritance)
class Surgeon extends Doctor {
	// Overriding the treatment method
	@Override
	public void treatment() {
		System.out.println("Surgeon is performing surgery on the patient.");
	}

	// New method specific to Surgeon
	public void performSurgery() {
		System.out.println("Surgeon is performing a surgery if necessary.");
	}
}

// Derived class Nurse (Hierarchical Inheritance)
class Nurse extends Doctor {
	// Overriding the treatment method
	@Override
	public void treatment() {
		System.out.println("Nurse is assisting the patient.");
	}

	// New method specific to Nurse
	public void care() {
		System.out.println("Nurse is taking care of  patient.");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		System.out.println("\n----DOCTOR----\n");
		// Creating an object of Doctor
		Doctor doctor = new Doctor();
		doctor.treatment();
		doctor.patient();

		System.out.println("\n----SURGEN----\n");

		// Creating an object of Surgeon
		Surgeon surgeon = new Surgeon();
		surgeon.treatment();  // Overridden method
		surgeon.patient();
		surgeon.performSurgery();

		System.out.println("\n----NURSE----\n");

		// Creating an object of Nurse
		Nurse nurse = new Nurse();
		nurse.treatment();  // Overridden method
		nurse.patient();  // Inherited from Doctor
		nurse.care();
	}
}

/*
 * 
----DOCTOR----

Doctor gives treatment to the patient.
Doctor is prescribing medicine to the patient.

----SURGEN----

Surgeon is performing surgery on the patient.
Doctor is prescribing medicine to the patient.
Surgeon is performing a surgery if necessary.

----NURSE----

Nurse is assisting the patient.
Doctor is prescribing medicine to the patient.
Nurse is taking care of  patient.

 */




