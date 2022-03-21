package Model;

public class TreatmentBill extends Billing{
private Double DailyTreatmentCost; // the cost of the daily treatment
private int HospitalizedDays; //Hospitalized days
public TreatmentBill(Double dailyTreatmentCost, int hospitalizedDays) {

	DailyTreatmentCost = dailyTreatmentCost;
	HospitalizedDays = hospitalizedDays;
}
public Double getDailyTreatmentCost() {
	return DailyTreatmentCost;
}
public void setDailyTreatmentCost(Double dailyTreatmentCost) {
	DailyTreatmentCost = dailyTreatmentCost;
}
public int getHospitalizedDays() {
	return HospitalizedDays;
}
public void setHospitalizedDays(int hospitalizedDays) {
	HospitalizedDays = hospitalizedDays;
}
//operation DailyTreatmentCost*HospitalizedDays to calculate the total amount
public double TotalAmount() {

super.setTotalAmount(DailyTreatmentCost*HospitalizedDays);
return super.getTotalAmount();	
	
}
@Override
public String toString() {
	return "\nTreatmentBill [DailyTreatmentCost=" + DailyTreatmentCost + ", HospitalizedDays=" + HospitalizedDays + "\nTotal amount=" + TotalAmount() +"]";
}



}
