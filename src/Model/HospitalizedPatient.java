package Model;

public class HospitalizedPatient extends Patient{
 //Adding medic in patient

private TreatmentBill Bill;

public HospitalizedPatient() {
	
	
}	

public HospitalizedPatient(String firstName, String lastName, String id, int age, String address, int phone, 
		 Diagnostic diagnostic,Medic M,TreatmentBill Bill) {
// Inheritance with parametrized constructor of the parent
super(firstName, lastName, id,  age,  address, phone, 
		  diagnostic,M);

this.Bill=Bill;

}



public TreatmentBill getBill() {
	return Bill;
}

public void setBill(TreatmentBill bill) {
	Bill = bill;
}

@Override
public String ShowInfo() {
	return "\nHospitalized patient"  + super.toString()  + "\nBill" + Bill ;
}

	
	

}
