package Model;

public class Medic {
	private String Name; //Only the first name or full name as the customer preference
	private String EN;// Number of Employee
	private String Specialty; //the specialty of the doctor
	
	//contructor by default
	public Medic() {
		
	}
	
	// parametrized constructor 
	public Medic(String name, String eN, String specialty) {
		
		Name = name;
		EN = eN;
		Specialty = specialty;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEN() {
		return EN;
	}
	public void setEN(String eN) {
		EN = eN;
	}
	public String getSpecialty() {
		return Specialty;
	}
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}

	@Override
	public String toString() {
		return "\nMedic [Name=" + Name + ", Employee Number=" + EN + ", Specialty=" + Specialty + "]";
	}
	
			

}
