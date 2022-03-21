package Model;

import java.util.LinkedList;

public class ConsultPatient extends Patient{
 //Adding medic in patient

private ConsultingBill Bill;

public ConsultPatient() {
	
	
}	

public ConsultPatient(String firstName, String lastName, String id, int age, String address, int phone, 
		 Diagnostic diagnostic,Medic M,Medicament medicament, LinkedList<Medicament> medicaments) {
	// Inheritance with parametrized constructor of the parent
super(firstName, lastName, id,  age,  address, phone, 
		  diagnostic,M);

Bill=new ConsultingBill( medicament,  medicaments);

}

public ConsultingBill getBill() {
	return Bill;
}

public void setBill(ConsultingBill bill) {
	Bill = bill;
}

@Override
public String ShowInfo() {
	return "\nConsult patient"  + super.toString()  + "\nBill" + Bill.toString() ;
}

	
	

}
