package Model;

public abstract class Patient {
private String FirstName; //It requires only First name of the patient
private String LastName;// it requires  only the last name of the patient
private String Id;// Number of identification
private int Age; //age of the patient
private String Address; //the current address of the patient
private int Phone; //mobile phonenumber 
	
private Medic Medic;

private Diagnostic Diagnostic; //composition of the patient

//constructor by default
public Patient() {
	
}

// constructor with parameters
public Patient(String firstName, String lastName, String id, int age, String address, int phone, 
		 Diagnostic diagnostic,Medic M) {

	FirstName = firstName;
	LastName = lastName;
	Id = id;
	Age = age;
	Address = address;
	Phone = phone;
    Medic =M;

	Diagnostic = diagnostic;
}


public String getFirstName() {
	return FirstName;
}


public void setFirstName(String firstName) {
	FirstName = firstName;
}


public String getLastName() {
	return LastName;
}


public void setLastName(String lastName) {
	LastName = lastName;
}


public String getId() {
	return Id;
}


public void setId(String id) {
	Id = id;
}


public int getAge() {
	return Age;
}


public void setAge(int age) {
	Age = age;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public int getPhone() {
	return Phone;
}


public void setPhone(int phone) {
	Phone = phone;
}






public Diagnostic getDiagnostic() {
	return Diagnostic;
}


public void setDiagnostic(Diagnostic diagnostic) {
	Diagnostic = diagnostic;
}


@Override
public String toString() {
	return "\nPatient [FirstName=" + FirstName + ", LastName=" + LastName + ", Id=" + Id + ", Age=" + Age + ", Address="
			+ Address + ", Phone=" + Phone + ", Medic=" + Medic + ", Diagnostic=" + Diagnostic + "]";
}

// abstract method that for inheritance the children classes use it
public abstract String ShowInfo() ;
	
}

