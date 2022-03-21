package Model;
import java.util.LinkedList;

public class ConsultingBill extends Billing{

private Medicament Medicament;// adding  medicament
private LinkedList<Medicament> Medicaments=new LinkedList();	 // list of medicaments 

public ConsultingBill () {}
public ConsultingBill(Medicament medicament, LinkedList<Medicament> medicaments) {
	

	Medicament = medicament;
	Medicaments = medicaments;
}

//the total amount to pay
//operation Medicament*Quantity of medicments to calculate the total amount
public double TotalAmount() {
	double totalAmount = 0;
for(int i=0; i<Medicaments.size(); i++) {
	 totalAmount+=(int) (Medicaments.get(i).getPrice()*	Medicaments.get(i).getQuantityMedicament());
	
}
super.setTotalAmount(totalAmount);
return super.getTotalAmount();
	
}
public void setMedicament(Medicament medicament) {
	Medicament = medicament;
}

public Medicament getMedicament() {
	return Medicament;
}
public LinkedList<Medicament> getMedicaments() {
	return Medicaments;
}
public void setMedicaments(LinkedList<Medicament> medicaments) {
	Medicaments = medicaments;
}
@Override
public String toString() {
	return "\nBilling [totalAmount=" + TotalAmount() + ", Medicaments=" + Medicaments ;
			
}





}
